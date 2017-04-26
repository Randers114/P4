package abstractSyntaxTree.nodes;

import AVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    public Node leftMain;
    public List<Node> methods = new ArrayList<>();

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}

