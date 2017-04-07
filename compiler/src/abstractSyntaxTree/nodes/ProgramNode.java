package abstractSyntaxTree.nodes;

import abstractSyntaxTree.nodes.Node;
import abstractSyntaxTree.nodes.OpNode;
import abstractSyntaxTree.nodes.Single;

import java.util.ArrayList;
import java.util.List;


public class ProgramNode extends Node {
    public Node leftMain;
    public List<Node> methods = new ArrayList<>();
}

