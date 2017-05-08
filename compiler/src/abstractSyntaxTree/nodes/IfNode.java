package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

import java.util.List;

public class IfNode extends Node {
    public Node bool;
    public Node block;
    public List<Node> elseif;
    public Node el;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
