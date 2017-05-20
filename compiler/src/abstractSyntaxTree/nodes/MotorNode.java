package abstractSyntaxTree.nodes;


import AVisitor.Visitor;

public class MotorNode extends Node{
    public String Symbol;
    public Node id;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
