package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class LessThanNode extends OpNode {
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
