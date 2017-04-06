package symbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {
    private List<Variable> Variables;
    public static Stack<SymbolTable> symbolTables;

    public SymbolTable()
    {
        Variables = new ArrayList<>();
    }

    public void OpenScope(){
        SymbolTable nextScope = new SymbolTable();
        symbolTables.push(nextScope);
    }
    public void CloseScope(){
        symbolTables.pop();
    }

    public void Insert(String variableName, String type)
    {
        symbolTables.peek().Variables.add(new Variable(variableName, type));

    }
    public Boolean LookUp(String varName)
    {
        for (Variable var: symbolTables.peek().Variables
             ) {
            if (var.Name.equals(varName)){
                return true;
            }
        }
        return false;
    }

}
