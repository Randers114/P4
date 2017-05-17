package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatMotorNode extends Node {
    public String instance;
    public Node parameter;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
