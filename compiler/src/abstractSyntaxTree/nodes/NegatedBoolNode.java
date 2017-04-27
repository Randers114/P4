package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class NegatedBoolNode extends Node {
    public Node left;
    public Node middle;
    public Node right;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
