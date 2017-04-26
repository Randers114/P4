package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class BoolNode extends Node{
    public boolean aBoolean;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
