package symbolTable;

import abstractSyntaxTree.nodes.*;
import compilerInitializer.CompilerInitializer;
import errorHandling.PrintError;
import event.ErrorEvent;
import errorHandling.FireableError;

import java.util.List;

public class BuildSymbolTable extends FireableError{
    private SymbolTable symbolTable = new SymbolTable();

    public BuildSymbolTable() {
        symbolTable.AddErrorListener(e -> PrintError.PrintErrors(e.getSource().toString()));
        symbolTable.AddErrorListener(e -> CompilerInitializer.SetScopeAndTypeError());
    }

    public void InitializeSymbolTable(ProgramNode node){
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
            } else {
                symbolTable.Insert(((DclNode) node).right, ((DclNode) node).left);
            }
        } else if (node instanceof IdentifierNode){
            if (!symbolTable.LookUp(((IdentifierNode) node).name)){
                FireError(new ErrorEvent("Variable: " + ((IdentifierNode) node).name + " does not exist in this context, error at line: " + node.LineNumber));
            }
        } else if (node instanceof SynchronizationNode){
            symbolTable.Synchronize((IdentifierNode) ((SynchronizationNode) node).left, (IdentifierNode) ((SynchronizationNode) node).right, (SynchronizationNode) node);
        } else if (node instanceof DesynchronizeNode){
            symbolTable.Desynchronize((IdentifierNode) ((DesynchronizeNode) node).left, (IdentifierNode) ((DesynchronizeNode) node).right, (DesynchronizeNode) node);
        } else {
            TraverseChildren(node.ChildrenList);
        }
    }

    private void TraverseChildren(List<Node> childrenList){
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
