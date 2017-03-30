package abstractSyntaxTree.nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stefan on 29-03-2017.
 */
public class MethodNode extends Node {
    public Node type;
    public Node id;
    public Node fprmt;
    public List<Node> body = new ArrayList<>();
    public Node returnval;
}
