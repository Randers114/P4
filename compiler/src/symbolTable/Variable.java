package symbolTable;

public class Variable {
    public String Name;
    public String Type;
    public String Symbol;

    public Variable(String name, String type) {
        Name = name;
        Type = type;
        Symbol = "";
    }

    public Variable(String name, String type, String symbol) {
        this(name, type);
        Symbol = symbol;
    }
}
