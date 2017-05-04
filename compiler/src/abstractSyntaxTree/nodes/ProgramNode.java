package abstractSyntaxTree.nodes;

import AVisitor.Visitor;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    public Node leftMain;
    public List<Node> methods = new ArrayList<>();
    public SymbolTable symbolTable;

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}

