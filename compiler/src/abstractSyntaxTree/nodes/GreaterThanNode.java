package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class GreaterThanNode extends OpNode {
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
