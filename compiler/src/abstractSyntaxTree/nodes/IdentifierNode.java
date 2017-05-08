package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class IdentifierNode extends Node {
    public String name;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
