package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class ParameterNode extends Node {
    public Node Parameter;
    public Node prmt;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
