package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class UnaryMinusNode extends Single {

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
