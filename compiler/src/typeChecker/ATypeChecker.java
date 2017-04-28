package typeChecker;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;
import symbolTable.SymbolTable;

import java.util.Stack;

public class ATypeChecker extends Visitor<Double, String, Boolean> {
    private Stack<SymbolTable> CurrentSymbolTable = new Stack<>();


    @Override
    public Void Visit(AssignNode node){

        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        CurrentSymbolTable.push(node.symbolTable);

        for (Node n: node.ChildrenList
                ) {
            n.Accept(this);
        }

        CurrentSymbolTable.pop();
        return null;
    }

    @Override
    public Void Visit(BodyNode node) {
        node.content.Accept(this);

        return null;
    }

    @Override
    public Boolean Visit(BoolExprNode node) {
        return null;
    }

    @Override
    public Boolean Visit(BoolNode node) {
        return null;
    }

    @Override
    public Boolean Visit(BoolOpNode node) {
        return null;
    }

    @Override
    public Boolean Visit(BoolValOpNode node) {
        return null;
    }

    @Override
    public String Visit(CallNode node) {
        return null;
    }

    @Override
    public Void Visit(DclNode node) {
        String type, type2 = "";

        type = (String) node.left.Accept(this);

        if (node.right != null){
            if (node.right.Accept(this).getClass() == Boolean.class){
                type2 = "bool";
            } else if (node.right.Accept(this).getClass() == Double.class){
                type2 = "number";
            }

            if (!type.equals(type2)){
                System.out.println("Mistakes have been made");
            }
        }
        return null;
    }

    @Override
    public Double Visit(DivideNode node) {
        return (Double) node.left.Accept(this) / (Double) node.right.Accept(this);
    }

    @Override
    public Void Visit(ElseIfNode node) {
        return null;
    }

    @Override
    public Void Visit(ElseNode node) {
        return null;
    }

    @Override
    public Void Visit(FormalParameterNode node) {
        return null;
    }

    @Override
    public Void Visit(ForNode node) {
        return null;
    }

    @Override
    public Void Visit(IdentifierNode node) {


        return null;
    }

    @Override
    public Void Visit(IfNode node) {
        return null;
    }

    @Override
    public String Visit(InstanceNode node) {
        return null;
    }

    @Override
    public Void Visit(MethodNode node) {
        return null;
    }

    @Override
    public Double Visit(MinusNode node) {
        return (Double) node.left.Accept(this) - (Double) node.right.Accept(this);
    }

    @Override
    public Boolean Visit(NegatedBoolNode node) {
        return null;
    }

    @Override
    public Boolean Visit(NotBoolNode node) {
        return null;
    }

    @Override
    public Double Visit(NumberNode node) {
        return node.value;
    }

    @Override
    public Void Visit(ParameterNode node) {
        return null;
    }

    @Override
    public Double Visit(PlusNode node) {
        return (Double) node.left.Accept(this) + (Double) node.right.Accept(this);
    }

    @Override
    public Void Visit(ProgramNode node) {
        CurrentSymbolTable.push(node.symbolTable);

        for (Node n: node.ChildrenList
                ) {
            n.Accept(this);
        }

        CurrentSymbolTable.pop();
        return null;
    }

    @Override
    public Boolean Visit(RBooleanNode node) {
        return null;
    }

    @Override
    public Void Visit(ReturnValNode node) {
        return null;
    }

    @Override
    public Void Visit(StatIdNode node) {
        return null;
    }

    @Override
    public Void Visit(StatListNode node) {
        return null;
    }

    @Override
    public Void Visit(StatMotorNode node) {
        return null;
    }

    @Override
    public Void Visit(StatSensorNode node) {
        return null;
    }

    @Override
    public Void Visit(StmtNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Double Visit(TermNode node) {
        return (Double) node.child.Accept(this);
    }

    @Override
    public Double Visit(TimesNode node) {
        return (Double) node.left.Accept(this) * (Double) node.right.Accept(this);
    }

    @Override
    public String Visit(TypesNode node) {
        return node.type;
    }

    @Override
    public Double Visit(UnaryMinusNode node) {
        return null;
    }

    @Override
    public Object Visit(ValueNode node) {
        return node.child.Accept(this);
    }

    @Override
    public Void Visit(WhileNode node) {
        return null;
    }
}






