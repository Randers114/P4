package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class PlusNode extends OpNode {

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
