package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class ReturnValNode extends Node {
    public Node returnvalue;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
