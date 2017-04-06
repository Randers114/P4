package symbolTable;

import abstractSyntaxTree.nodes.IdentifierNode;
import abstractSyntaxTree.nodes.Node;
import abstractSyntaxTree.nodes.TypesNode;

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

    public void Insert(Node id, Node type)
    {
        if (LookUp(((IdentifierNode) id).name)){
            symbolTables.peek().Variables.add(new Variable(((IdentifierNode) id).name,((TypesNode) type).type));
        } else{
            
        }
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
