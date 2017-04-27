package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class NumberNode extends Node {
    public double value;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
