package abstractSyntaxTree.nodes;

import visitor.Visitor;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    public List<Node> designSpecificInvokes = new ArrayList<>();
    public Node mainBlock;
    public List<Node> methods = new ArrayList<>();
    public SymbolTable symbolTable;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}

