package symbolTable;

import abstractSyntaxTree.nodes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildSymbolTable {

    private SymbolTable symbolTable;

    public BuildSymbolTable(ProgramNode node) {
        symbolTable = new SymbolTable();
        Build(node);
    }

    private void Build(Node node){
        if (node instanceof ProgramNode){
            symbolTable.OpenScope();

            for (Node a: ((ProgramNode) node).methods
                 ) {
                symbolTable.Insert(((MethodNode) a).id, ((MethodNode) a).type);
            }

            for (Node designDclNode: ((ProgramNode) node).designSpecificInvokes
                 ) {
                if (((DesignSpecificDclNode) designDclNode).child instanceof MotorNode){
                    symbolTable.Insert(((MotorNode) ((DesignSpecificDclNode) designDclNode).child).id, "Motor", ((MotorNode) ((DesignSpecificDclNode) designDclNode).child).symbol);
                } else if (((DesignSpecificDclNode) designDclNode).child instanceof UltraSoundSensorNode){
                    symbolTable.Insert(((UltraSoundSensorNode) ((DesignSpecificDclNode) designDclNode).child).id, "UltrasoundSensor", ((UltraSoundSensorNode) ((DesignSpecificDclNode) designDclNode).child).symbol);
                } else if (((DesignSpecificDclNode) designDclNode).child instanceof TouchSensorNode){
                    symbolTable.Insert(((TouchSensorNode) ((DesignSpecificDclNode) designDclNode).child).id, "TouchSensor", ((TouchSensorNode) ((DesignSpecificDclNode) designDclNode).child).symbol);
                }
            }
            TraverseChildren(node.ChildrenList);
            ((ProgramNode) node).symbolTable = SymbolTable.symbolTables.get(SymbolTable.symbolTables.size() - 1);

        } else if (node instanceof MethodNode) {
            symbolTable.OpenScope();
            if (((MethodNode) node).fprmt != null) {
                TraverseFix(((FormalParameterNode) ((MethodNode) node).fprmt));
            }
            TraverseChildren(((MethodNode) node).block.ChildrenList);
            ((BlockNode)((MethodNode) node).block).symbolTable = SymbolTable.symbolTables.get(SymbolTable.symbolTables.size() - 1);
            symbolTable.CloseScope();

        } else if (node instanceof FormalParameterNode) {
            symbolTable.Insert(((FormalParameterNode) node).id, ((FormalParameterNode) node).type);
            if (((FormalParameterNode) node).fprmt != null) {
                TraverseFix((FormalParameterNode) ((FormalParameterNode) node).fprmt);
            }
        } else if (node instanceof BlockNode){
            symbolTable.OpenScope();
            TraverseChildren(node.ChildrenList);
            ((BlockNode) node).symbolTable = SymbolTable.symbolTables.get(SymbolTable.symbolTables.size() - 1);
            symbolTable.CloseScope();

        } else if (node instanceof DclNode){
            if(((DclNode) node).left instanceof TypesNode){
                symbolTable.Insert(((DclNode) node).middle, ((DclNode) node).left);
                if (((DclNode) node).right != null){
                    TraverseChildren(((DclNode) node).right.ChildrenList);
                }
            }
			//else if(((DclNode) node).left instanceof  ListNode) //TODO
			//{
			//	symbolTable.Insert(((DclNode)node).right, ((DclNode)node).left, ((DclNode) node).middle);
			//}
			else if(((DclNode)node).middle instanceof TypesNode)
            {
                if(((TypesNode)(((DclNode)node).middle)).type.equals("bool") ||((TypesNode)(((DclNode)node).middle)).type.equals("number") )
                    symbolTable.InsertList(((IdentifierNode)(((DclNode)node).right)).name, new ArrayList<>(), node.LineNumber);
            }
			else {
                symbolTable.Insert(((DclNode) node).right, ((DclNode) node).left);
            }


        } else if (node instanceof IdentifierNode){
            if (!symbolTable.LookUp(((IdentifierNode) node).name)){
                System.out.println("Variable: " + ((IdentifierNode) node).name + " does not exist in this context. Error at line: " + node.LineNumber);
            }
        } else if (node instanceof SynchronizationNode){
            if (((SynchronizationNode) node).relativeSpeed != null){
                symbolTable.Synchronize((IdentifierNode) ((SynchronizationNode) node).left, (IdentifierNode) ((SynchronizationNode) node).right, ((SynchronizationNode) node).relativeSpeed, (SynchronizationNode) node);
            } else {
                symbolTable.Synchronize((IdentifierNode) ((SynchronizationNode) node).left, (IdentifierNode) ((SynchronizationNode) node).right, (SynchronizationNode) node);
            }
        } else if (node instanceof DesynchronizeNode){
            symbolTable.Desynchronize((IdentifierNode) ((DesynchronizeNode) node).left, (IdentifierNode) ((DesynchronizeNode) node).right, (DesynchronizeNode) node);


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
