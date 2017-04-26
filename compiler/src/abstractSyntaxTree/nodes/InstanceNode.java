package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class InstanceNode extends Node {
    public String instance;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
