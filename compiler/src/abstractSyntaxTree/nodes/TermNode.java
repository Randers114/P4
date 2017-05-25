package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class TermNode extends Single {

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
