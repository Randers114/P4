package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class TypesNode extends Node {
    public String type;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
