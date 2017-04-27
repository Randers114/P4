package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class BoolOpNode extends Node {
    public String child;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
