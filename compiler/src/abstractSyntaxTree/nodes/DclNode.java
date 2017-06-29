package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class DclNode extends Node {
    public Node left;
    public Node middle;
    public Node right;
    public boolean isList = false;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
