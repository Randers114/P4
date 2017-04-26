package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class FormalParameterNode extends Node {
    public Node id;
    public Node type;
    public Node fprmt;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
