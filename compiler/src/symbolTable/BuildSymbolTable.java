package symbolTable;


import abstractSyntaxTree.nodes.*;

public class BuildSymbolTable {
    private SymbolTable symbolTable;
    public BuildSymbolTable(ProgramNode node) {
        Build(node);
        symbolTable = new SymbolTable();
    }

    private void Build(Node node){

        if (node instanceof IfNode){


        } else if (node instanceof ProgramNode){
            symbolTable.OpenScope();

            for (Node a: ((ProgramNode) node).methods
                 ) {
                symbolTable.Insert(((MethodNode) a).id, ((MethodNode) a).type);
            }
        }

        for (Node a: node.ChildrenList
             ) {
            Build(a);
        }

        symbolTable.CloseScope();
    }
}
