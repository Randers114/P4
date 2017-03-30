package abstractSyntaxTree.nodes;

import java.util.List;

/**
 * Created by Stefan on 29-03-2017.
 */
public class ForNode extends Node {
    public Node startNumber;
    public Node endNumber;
    public List<Node> body;
}
