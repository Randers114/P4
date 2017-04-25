package abstractSyntaxTree.nodes;

import java.util.List;

public class IfNode extends Node {
    public Node bool;
    public Node block;
    public List<Node> elseif;
    public Node el;
}
