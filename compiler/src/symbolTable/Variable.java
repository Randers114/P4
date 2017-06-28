package symbolTable;

import abstractSyntaxTree.nodes.IdentifierNode;
import abstractSyntaxTree.nodes.ListNode;
import abstractSyntaxTree.nodes.TypesNode;

public class Variable {
    public String Name;
    public String Type;
    public String Symbol;
    public String ListType;

    public Variable(String name, String type) {
        Name = name;
        Type = type;
        Symbol = "";
    }

    public Variable(String name, String type, String symbol) {
        this(name, type);
        Symbol = symbol;
    }

    public Variable(ListNode listNode) {
        Name = ((IdentifierNode) listNode.id).name;
        Type = "List";
        ListType = ((TypesNode) listNode.type).type;
    }
}
