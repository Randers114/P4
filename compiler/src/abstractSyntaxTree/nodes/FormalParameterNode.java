package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class FormalParameterNode extends Node {
    public Node id;
    public Node type;
    public Node fprmt;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
