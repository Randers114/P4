package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class ValueNode extends Single {

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
