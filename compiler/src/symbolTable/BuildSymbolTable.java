package symbolTable;

import abstractSyntaxTree.nodes.*;
import java.util.List;

public class BuildSymbolTable {

    private SymbolTable symbolTable;

    public BuildSymbolTable(ProgramNode node, String inputPath) {
        symbolTable = new SymbolTable(inputPath);
        Build(node);
    }

    private void Build(Node node){
        if (node instanceof ProgramNode){
            symbolTable.OpenScope();

            for (Node a: ((ProgramNode) node).methods
                 ) {
                symbolTable.Insert(((MethodNode) a).id, ((MethodNode) a).type);
            }
            TraverseChildren(node.ChildrenList);

        } else if (node instanceof MethodNode) {
            symbolTable.OpenScope();
            if (((MethodNode) node).fprmt != null) {
                TraverseFix(((FormalParameterNode) ((MethodNode) node).fprmt));
            }
            TraverseChildren(((MethodNode) node).block.ChildrenList);
            symbolTable.CloseScope();

        } else if (node instanceof FormalParameterNode) {
            symbolTable.Insert(((FormalParameterNode) node).id, ((FormalParameterNode) node).type);
            if (((FormalParameterNode) node).fprmt != null) {
                TraverseFix((FormalParameterNode) ((FormalParameterNode) node).fprmt);
            }
        } else if (node instanceof BlockNode){
            symbolTable.OpenScope();
            TraverseChildren(node.ChildrenList);
            symbolTable.CloseScope();

        } else if (node instanceof DclNode){
            if(((DclNode) node).left instanceof TypesNode){
                symbolTable.Insert(((DclNode) node).middle, ((DclNode) node).left);
                if (((DclNode) node).right != null){
                    TraverseChildren(((DclNode) node).right.ChildrenList);
                }
            } else {
                symbolTable.Insert(((DclNode) node).right, ((DclNode) node).left);
            }


        } else if (node instanceof IdentifierNode){
            if (!symbolTable.LookUp(((IdentifierNode) node).name)){
                System.out.println("Variable: " + ((IdentifierNode) node).name + " does not exist in this context");
            }
        } else {
            TraverseChildren(node.ChildrenList);
        }
    }

    private void TraverseChildren(List<Node> childrenList){
        for (Node a: childrenList
                ) {
            if (a != null) {
                Build(a);
            }
        }
    }

    private void TraverseFix(FormalParameterNode node){
        FormalParameterNode fixedNode = new FormalParameterNode();
        fixedNode.ChildrenList.add(node);
        TraverseChildren(fixedNode.ChildrenList);
    }
}
