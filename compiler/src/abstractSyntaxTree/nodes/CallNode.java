package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class CallNode extends Node {
    public Node id;
    public Node invoke;
    public Node parameter;


    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
