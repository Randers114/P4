package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class ElseNode extends Node {
    public Node block;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
