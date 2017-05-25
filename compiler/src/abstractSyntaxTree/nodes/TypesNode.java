package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class TypesNode extends Node {
    public String type;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
