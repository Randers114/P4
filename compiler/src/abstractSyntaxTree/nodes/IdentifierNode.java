package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class IdentifierNode extends Node {
    public String name;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
