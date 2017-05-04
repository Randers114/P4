package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class TimesNode extends OpNode {

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
