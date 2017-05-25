package abstractSyntaxTree.nodes;

import visitor.Visitor;
import symbolTable.SymbolTable;

public class BlockNode extends Node {
    public SymbolTable symbolTable;

    @Override
    public Object Accept(Visitor visitor) {
         return visitor.Visit(this);
    }
}