package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class MinusNode extends OpNode {

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
