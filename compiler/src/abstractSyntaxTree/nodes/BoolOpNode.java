package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class BoolOpNode extends Node {
    public String child;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
