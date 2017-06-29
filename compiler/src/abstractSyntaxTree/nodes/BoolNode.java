package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class BoolNode extends Node{
    public boolean aBoolean;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
