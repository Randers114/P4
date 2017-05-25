package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class ElseIfNode extends Node {
    public Node bool;
    public Node block;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
