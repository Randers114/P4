package symbolTable;

import abstractSyntaxTree.nodes.*;
import codeGenerator.SyncMotor;
import event.ErrorEvent;
import errorHandling.FireableError;

import java.util.*;

public class SymbolTable extends FireableError{
    private List<Variable> Variables;
    static List<SymbolTable> symbolTables = new ArrayList<>();
    private List<SyncMotor> syncMotors = new ArrayList<>();
    SymbolTable()
    {
        Variables = new ArrayList<>();
    }

    void OpenScope(){
        SymbolTable nextScope = new SymbolTable();

        if (symbolTables.size() == 0){
            symbolTables.add(nextScope);
        } else {
            nextScope.Variables.addAll(symbolTables.get(symbolTables.size() - 1).Variables);
            symbolTables.add(nextScope);
        }

    }
    void CloseScope(){
        symbolTables.remove((symbolTables.size() - 1));
    }

    void Insert(Node id, Node type)
    {
        if (!LookUp(((IdentifierNode) id).name)){
            if (type instanceof TypesNode){
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(((IdentifierNode) id).name,((TypesNode) type).type));
            }
        } else {
            FireError(new ErrorEvent("Variable " + ((IdentifierNode) id).name + " already exists in this context, error at line: " + id.LineNumber));
        }
    }

    void Insert(Node id, String type, String symbol){
        if (!LookUpSymbol(symbol)){
            if (type.equals("Motor") && symbol.matches("[A-D]") || (type.equals("TouchSensor") || type.equals("UltrasoundSensor")) && symbol.matches("[0-4]")){
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(((IdentifierNode) id).name, type, symbol));
            } else {
                FireError(new ErrorEvent("Variable " + ((IdentifierNode) id).name + " failed, the socket " + symbol + " does not exist error at line: " + id.LineNumber));
            }

        } else {
            FireError(new ErrorEvent("Variable " + ((IdentifierNode) id).name + " failed, the socket " + symbol + " is already initialized error at line: " + id.LineNumber));
        }
    }

    void Insert(IdentifierNode id, String type, String listType, boolean islist){
        if (!LookUp(id.name)){
            if (type.equals("List")){
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(id.name, listType, islist));
            }
        } else {
            FireError(new ErrorEvent("Variable " + id.name + " failed, the variable is already initialized error at line: " + id.LineNumber));
        }
    }

    private Boolean LookUpSymbol(String symbol){
        for (Variable var: symbolTables.get(symbolTables.size() - 1).Variables
                ) {
            if (var.Symbol.equals(symbol)){
                return true;
            }
        }
        return false;
    }

    void Synchronize(IdentifierNode left, IdentifierNode right , SynchronizationNode line){
        if (!LookUpSyncedMotor(left, right)){
            syncMotors.add(new SyncMotor(left, right));
        } else {
            FireError(new ErrorEvent("Motors already synced, error at line: " + line.LineNumber));
        }
    }

    void Desynchronize(IdentifierNode left, IdentifierNode right , DesynchronizeNode line){
        boolean error = true;
        for (SyncMotor sync: syncMotors
             ) {
            if (left.name.equals((sync.motor1).name) && right.name.equals((sync.motor2).name)){
                syncMotors.remove(sync);
                error = false;
                break;
            }
        }

        if (error){
            FireError(new ErrorEvent("Motors are not synced, error at line: " + line.LineNumber));
        }
    }

    private Boolean LookUpSyncedMotor(IdentifierNode left, IdentifierNode right){
        for (SyncMotor sync: syncMotors
             ) {
            if (left.name.equals((sync.motor1).name) && right.name.equals((sync.motor2).name) || left.name.equals((sync.motor2).name)){
                return true;
            }
        }
        return left.name.equals(right.name);
    }

    Boolean LookUp(String varName)
    {
        for (Variable var: symbolTables.get(symbolTables.size() - 1).Variables
             ) {
            if (var.Name.equals(varName)){
                return true;
            }
        }

        return false;
    }

    public static String GetTypeByID(String name, SymbolTable symbolTable){
        String type = "";
        for (Variable var: symbolTable.Variables
                ) {
            if (var.Name.equals(name)){
                type = var.Type;
            }
        }
        return type;
    }
}