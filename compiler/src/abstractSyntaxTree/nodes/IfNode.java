package abstractSyntaxTree.nodes;

import java.util.List;

/**
 * Created by Stefan on 29-03-2017.
 */
public class IfNode extends Node {
    public Node bool;
    public Node block;
    public List<Node> elseif;
    public Node el;
}
