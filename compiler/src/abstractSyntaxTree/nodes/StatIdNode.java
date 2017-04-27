package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class StatIdNode extends Node {
    public Node instance;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
