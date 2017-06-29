package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class MethodNode extends Node {
    public Node type;
    public Node id;
    public Node fprmt;
    public Node block;
    public Node returnval;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
