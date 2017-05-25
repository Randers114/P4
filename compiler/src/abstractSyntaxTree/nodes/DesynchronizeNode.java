package abstractSyntaxTree.nodes;

import visitor.Visitor;

public class DesynchronizeNode extends OpNode{
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
