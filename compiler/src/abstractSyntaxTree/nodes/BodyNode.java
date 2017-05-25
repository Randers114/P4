package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class BodyNode extends Node {
    public Node content;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
