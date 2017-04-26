package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class ForNode extends Node {
    public Node startNumber;
    public Node endNumber;
    public Node block;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
