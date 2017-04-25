package abstractSyntaxTree.nodes;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    public Node leftMain;
    public List<Node> methods = new ArrayList<>();
}

