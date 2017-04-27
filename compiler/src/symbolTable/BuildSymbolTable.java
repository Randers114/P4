package symbolTable;

import abstractSyntaxTree.nodes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class BuildSymbolTable {

    private SymbolTable symbolTable;
    private String InputPath;

    public BuildSymbolTable(ProgramNode node, String inputPath) {
        symbolTable = new SymbolTable(inputPath);
        InputPath = inputPath;
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
                int errorLine = 0;

                File file = new File(InputPath);
                try {
                    Scanner scanner = new Scanner(file);
                    errorLine = symbolTable.ScopeLineStart(scanner, errorLine);
                    String currentLine = scanner.nextLine();

                    while (scanner.hasNext()){
                        errorLine++;

                        if (currentLine.contains(((IdentifierNode) node).name)){
                            System.out.println("Variable: " + ((IdentifierNode) node).name + " does not exist in this context. Error at line: " + errorLine);
                        }
                        currentLine = scanner.nextLine();
                    }

                } catch (FileNotFoundException e){

                }


            }
        } else {
            TraverseChildren(node.ChildrenList);
        }
    }

    public void TraverseChildren(List<Node> childrenList){
        for (Node a: childrenList) {
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
