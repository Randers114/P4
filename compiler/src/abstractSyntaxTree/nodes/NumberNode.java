package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class NumberNode extends Node {
    public double value;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
