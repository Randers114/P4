package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatListNode extends Node {
    public String instance;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
