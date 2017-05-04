package symbolTable;

<<<<<<< HEAD
import abstractSyntaxTree.nodes.*;

=======
import abstractSyntaxTree.nodes.IdentifierNode;
import abstractSyntaxTree.nodes.InstanceNode;
import abstractSyntaxTree.nodes.Node;
import abstractSyntaxTree.nodes.TypesNode;
import java.io.File;
>>>>>>> 12b6f98e85734771fcea8668a2ca1c52c4396128
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SymbolTable {
    private List<Variable> Variables;
    public static List<SymbolTable> symbolTables = new ArrayList<>();
    private static int CurrentScope = -1;
    private static String InputPath;
    public SymbolTable(String inputPath)
    {
        Variables = new ArrayList<>();
        InputPath = inputPath;
    }

    public void OpenScope(){
        SymbolTable nextScope = new SymbolTable(InputPath);
        CurrentScope++;

        if (symbolTables.size() == 0){
            symbolTables.add(nextScope);
        } else {
            nextScope.Variables.addAll(symbolTables.get(symbolTables.size() - 1).Variables);
            symbolTables.add(nextScope);
        }

    }
    public void CloseScope(){
        symbolTables.remove((symbolTables.size() - 1));
    }

    public void Insert(Node id, Node type)
    {
        if (!LookUp(((IdentifierNode) id).name)){
            if (type instanceof TypesNode){
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(((IdentifierNode) id).name,((TypesNode) type).type));
            } else {
                symbolTables.get((symbolTables.size() - 1)).Variables.add(new Variable(((IdentifierNode) id).name,((InstanceNode) type).instance));
            }

        } else {

            try {
                File file = new File(InputPath);
                Scanner scanner = new Scanner(file);
                int line = 0, k = 1;
                String currentline;
                line = ScopeLineStart(scanner, line);

                while (scanner.hasNext()){
                    currentline = scanner.nextLine();
                    if (currentline.contains("number " + ((IdentifierNode) id).name) || currentline.contains("bool " + ((IdentifierNode) id).name)){
                        if (k != 1){
                            line++;
                            System.out.println("Variable " + ((IdentifierNode) id).name + " already exists in this context, error at line: " + line);
                            break;
                        }
                        k++;
                    }
                    line++;
                }

            } catch (Exception e){

            }

        }
    }
    Boolean LookUp(String varName)
    {
        for (Variable var: symbolTables.get(symbolTables.size() - 1).Variables
             ) {
            if (var.Name.equals(varName)){
                return true;
            }
        }

        return false;
    }

<<<<<<< HEAD
    public boolean LookUpAndIsType(String name, String type)
    {
        for (SymbolTable s: symbolTables
                ) {
            for (Variable var: s.Variables
                    ) {
                if (var.Name.equals(name) && var.Type.equals(type)){
                    return true;
                }
            }
        }
        return false;
    }

    public String GetType(String name)
    {
        for (SymbolTable s: symbolTables
                ) {
            for (Variable var: s.Variables
                    ) {
                if (var.Name.equals(name)){
                    return var.Type;
                }
                else return null;
            }
        }
        return null;
    }

=======
    int ScopeLineStart(Scanner scanner, int line){
        int scope = 0;

        while (scanner.hasNext() && scope < CurrentScope){
            if (scanner.nextLine().contains("{")){
                scope++;
            }
            line++;
        }

        return line;
    }

    public static String GetTypeByID(String name, SymbolTable symbolTable){
        String type = null;
        for (Variable var: symbolTable.Variables
                ) {
            if (var.Name.equals(name)){
                type = var.Type;
            }
        }
        return type;
    }
>>>>>>> 12b6f98e85734771fcea8668a2ca1c52c4396128
}
