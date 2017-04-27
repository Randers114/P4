package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatListNode extends Node {
    public String instance;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
