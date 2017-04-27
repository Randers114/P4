package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class WhileNode extends Node {
    public Node bool;
    public Node block;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
