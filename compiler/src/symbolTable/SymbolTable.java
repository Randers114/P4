package symbolTable;

import abstractSyntaxTree.nodes.IdentifierNode;
import abstractSyntaxTree.nodes.InstanceNode;
import abstractSyntaxTree.nodes.Node;
import abstractSyntaxTree.nodes.TypesNode;
import java.io.File;
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

        } else{
            int scope = 0, line = 0;
            try {
                File file = new File(InputPath);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext() && scope < CurrentScope){
                    if (scanner.nextLine().contains("{")){
                        scope++;
                    }
                    line++;
                }
                int k = 1;
                while (scanner.hasNext()){
                    if (scanner.nextLine().contains("number" + " " + ((IdentifierNode) id).name) || scanner.nextLine().contains("bool" + " " + ((IdentifierNode) id).name)){
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
    public Boolean LookUp(String varName)
    {
        for (SymbolTable s: symbolTables
             ) {
            for (Variable var: s.Variables
                    ) {
                if (var.Name.equals(varName)){
                    return true;
                }
            }
        }
        return false;
    }
}
