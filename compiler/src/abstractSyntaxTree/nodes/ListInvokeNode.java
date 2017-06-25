package abstractSyntaxTree.nodes;

import visitor.Visitor;


public class ListInvokeNode extends Node{
    public String method;
    public Node input;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
