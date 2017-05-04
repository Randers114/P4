package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class InstanceNode extends Node {
    public String instance;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
