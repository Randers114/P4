package abstractSyntaxTree.nodes;


import AVisitor.Visitor;

public class MotorInvokeNode extends Node{
    public String method;
    public Node speed;
    public Node time;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
