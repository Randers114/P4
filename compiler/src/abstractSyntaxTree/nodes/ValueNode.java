package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class ValueNode extends Single {
    public boolean paren = false;
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
