package abstractSyntaxTree.nodes;


import AVisitor.Visitor;

public class UltraSoundSensorNode extends Node{
    public String symbol;
    public Node id;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
