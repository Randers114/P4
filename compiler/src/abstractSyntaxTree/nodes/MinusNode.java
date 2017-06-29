package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class MinusNode extends OpNode {

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
