package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class TermNode extends Single {

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
