package abstractSyntaxTree.nodes;

import AVisitor.Visitor;
import symbolTable.SymbolTable;

public class BlockNode extends Node {
    public SymbolTable table;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}