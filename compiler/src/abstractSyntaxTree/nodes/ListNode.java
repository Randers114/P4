package abstractSyntaxTree.nodes;

import visitor.Visitor;


public class ListNode extends Node {
    public Node type;
    public Node id;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
