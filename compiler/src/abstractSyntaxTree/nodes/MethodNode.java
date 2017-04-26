package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class MethodNode extends Node {
    public Node type;
    public Node id;
    public Node fprmt;
    public Node block;
    public Node returnval;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
