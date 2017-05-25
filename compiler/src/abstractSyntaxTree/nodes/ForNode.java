package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class ForNode extends Node {
    public Node startNumber;
    public Node endNumber;
    public Node block;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
