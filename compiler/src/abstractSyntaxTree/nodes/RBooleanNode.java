package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class RBooleanNode extends Node {
    public Node left;
    public Node middle;
    public Node right;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
