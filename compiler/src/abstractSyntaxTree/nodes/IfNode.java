package abstractSyntaxTree.nodes;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends Node {
    public Node bool;
    public Node block;
    public List<Node> elseif = new ArrayList<>();
    public Node el;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
