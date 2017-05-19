package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatIdNode extends Node {
    public Node instance;

    @Override
    public Object Accept(Visitor visitor) {
            return visitor.Visit(this);
    }
}
