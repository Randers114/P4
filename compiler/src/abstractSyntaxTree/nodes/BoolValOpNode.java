package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class BoolValOpNode extends Node {
    public String boolValOperator;


    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
