package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class EqualNode extends OpNode {
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
