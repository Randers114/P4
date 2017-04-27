package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class ElseNode extends Node {
    public Node block;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
