package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class ReturnValNode extends Node {
    public Node returnvalue;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
