package abstractSyntaxTree.nodes;


import visitor.Visitor;

public class SensorInvokeNode extends Node{
    public String method;
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
