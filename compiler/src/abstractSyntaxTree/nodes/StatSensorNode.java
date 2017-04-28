package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatSensorNode extends Node {
    public String instance;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
