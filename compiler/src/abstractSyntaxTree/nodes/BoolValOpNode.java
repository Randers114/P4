package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class BoolValOpNode extends Node {
    public String boolValOperator;


    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
