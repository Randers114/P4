package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class BodyNode extends Node {
    public Node content;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
