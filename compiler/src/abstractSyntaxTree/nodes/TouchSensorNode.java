package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class TouchSensorNode extends Node{
    public String symbol;
    public Node id;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
