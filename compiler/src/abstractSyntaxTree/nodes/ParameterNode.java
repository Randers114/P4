package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class ParameterNode extends Node {
    public Node Parameter;
    public Node prmt;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
