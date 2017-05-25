package abstractSyntaxTree.nodes;


import visitor.Visitor;

public class ListInvokeNode extends Node{
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
