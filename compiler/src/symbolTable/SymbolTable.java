package symbolTable;

import abstractSyntaxTree.nodes.IdentifierNode;
import abstractSyntaxTree.nodes.InstanceNode;
import abstractSyntaxTree.nodes.Node;
import abstractSyntaxTree.nodes.TypesNode;

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
}
