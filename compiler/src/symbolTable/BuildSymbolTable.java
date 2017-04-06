package symbolTable;


import abstractSyntaxTree.nodes.*;

import java.util.List;

public class BuildSymbolTable {

    private SymbolTable symbolTable;

    public BuildSymbolTable(ProgramNode node) {
        Build(node);
        symbolTable = new SymbolTable();
    }

    private void Build(Node node){
        if (node instanceof ProgramNode){
            symbolTable.OpenScope();

            for (Node a: ((ProgramNode) node).methods
                 ) {
                symbolTable.Insert(((MethodNode) a).id, ((MethodNode) a).type);
            }
            TraverseChildren(node.ChildrenList);

        } else if (node instanceof BlockNode){
            symbolTable.OpenScope();
            TraverseChildren(node.ChildrenList);
            symbolTable.CloseScope();

        } else if (node instanceof DclNode){
            if(((DclNode) node).left instanceof TypesNode){
                symbolTable.Insert(((DclNode) node).middle, ((DclNode) node).left);
                TraverseChildren(((DclNode) node).right.ChildrenList);

            } else {
                symbolTable.Insert(((DclNode) node).right, ((DclNode) node).left);
            }


        } else if (node instanceof IdentifierNode){
            if (!symbolTable.LookUp(((IdentifierNode) node).name)){
                throw new Exception();
            }

        } else if (){

        } else if (){

        } else if (){

        }



        symbolTable.CloseScope();
    }

    private void TraverseChildren(List<Node> childrenList){
        for (Node a: childrenList
                ) {
            Build(a);
        }
    }
}
