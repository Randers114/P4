package abstractSyntaxTree.nodes;

import java.util.List;

/**
 * Created by Stefan on 29-03-2017.
 */
public class WhileNode extends Node {
    public Node bool;
    public List<Node> body;
}
