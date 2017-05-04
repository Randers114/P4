package symbolTable;

import abstractSyntaxTree.nodes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {
    private List<Variable> Variables;
    public static List<SymbolTable> symbolTables = new ArrayList<>();

    public SymbolTable()
    {
        Variables = new ArrayList<>();
    }

    public void OpenScope(){
        SymbolTable nextScope = new SymbolTable();
        symbolTables.add(nextScope);
    }
    public void CloseScope(){
        symbolTables.remove((symbolTables.size() - 1));
    }

    public void Insert(Node id, Node type)
    {
        if (!LookUp(((IdentifierNode) id).name)){
            if (type instanceof TypesNode){
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(((IdentifierNode) id).name,((TypesNode) type).type));
            } else {
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(((IdentifierNode) id).name,((InstanceNode) type).instance));
            }

        } else{
            System.out.println("Variable " + ((IdentifierNode) id).name + " already exists in this context");
        }
    }
    public Boolean LookUp(String varName)
    {
        for (SymbolTable s: symbolTables
             ) {
            for (Variable var: s.Variables
                    ) {
                if (var.Name.equals(varName)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean LookUpAndIsType(String name, String type)
    {
        for (SymbolTable s: symbolTables
                ) {
            for (Variable var: s.Variables
                    ) {
                if (var.Name.equals(name) && var.Type.equals(type)){
                    return true;
                }
            }
        }
        return false;
    }

    public String GetType(String name)
    {
        for (SymbolTable s: symbolTables
                ) {
            for (Variable var: s.Variables
                    ) {
                if (var.Name.equals(name)){
                    return var.Type;
                }
                else return null;
            }
        }
        return null;
    }

}
