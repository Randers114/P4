package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

public class CallNode extends Node {
    public Node id;
    public Node statId;
    public Node parameter;


    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
