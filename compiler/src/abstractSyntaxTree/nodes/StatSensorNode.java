package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatSensorNode extends Node {
    public String instance;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
