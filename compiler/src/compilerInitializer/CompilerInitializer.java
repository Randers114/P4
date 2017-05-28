package compilerInitializer;

import abstractSyntaxTree.AstBuild;
import abstractSyntaxTree.nodes.ProgramNode;
import codeGenerator.CodeGenerator;
import codeGenerator.JavaBytecodeGenerator;
import errorHandling.AntlrErrorHandler;
import errorHandling.PrintError;
import org.antlr.v4.runtime.*;
import prettyPrint.PrettyPrint;
import sourceParser.MSTGrammarLexer;
import sourceParser.MSTGrammarParser;
import symbolTable.BuildSymbolTable;
import typeChecker.TypeChecker;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class CompilerInitializer {

    private BuildSymbolTable buildSymbolTable = new BuildSymbolTable();
    private TypeChecker typeChecker = new TypeChecker();
    private CodeGenerator codeGenerator = new CodeGenerator();
    private static boolean syntaxError = false, scopeAndTypeError = false;

    public void Initialize(){
        System.out.println("Please enter the path of the file you wish to compile.");

        ProgramNode root;
        Scanner scanner = new Scanner(System.in);
        String scannerInput = scanner.nextLine();

        String[] inputCommands;
        inputCommands = SplitInputString(scannerInput);
        Path inputPath = Paths.get(inputCommands[0]);

        try {
            MSTGrammarParser.ProgramContext programContext = RunParser(AntlerInit(inputPath));
            if (syntaxError){
                System.exit(0);
            }
            root = InitAST(programContext);

            PrettyPrintGeneration(root, inputCommands);
            SymbolTableAndTypeCheckerInit(root);
            if (!scopeAndTypeError){
                if (inputCommands.length > 1){
                    if (inputCommands[1].equals(" -jvb")){
                        JavaBytecodeGeneration(root);
                    }
                }
                CodeGenerationInit(root);
                System.out.println("The compilation completed without errors.");
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }


    }


    private String[] SplitInputString(String scannerInput){
        String[] inputCommands;
        inputCommands = scannerInput.split(".txt");
        inputCommands[0] += ".txt";

        return inputCommands;
    }

    private org.antlr.v4.runtime.CharStream AntlerInit(Path inputPath) throws Exception{
        return CharStreams.fromPath(inputPath);
    }

    private ProgramNode InitAST(MSTGrammarParser.ProgramContext programContext){
        AstBuild astBuild = new AstBuild();

        return (ProgramNode) astBuild.visitProgram(programContext);
    }

    private MSTGrammarParser.ProgramContext RunParser(org.antlr.v4.runtime.CharStream charStream){
        return AddErrorListenersAndInitParser(charStream).program();
    }

    private MSTGrammarParser AddErrorListenersAndInitParser(org.antlr.v4.runtime.CharStream charStream){
        MSTGrammarLexer lexer = new MSTGrammarLexer(charStream);
        AntlrErrorHandler antlrErrorListener = new AntlrErrorHandler();
        lexer.addErrorListener(antlrErrorListener);
        TokenStream tokenStream = new org.antlr.v4.runtime.CommonTokenStream(lexer);
        MSTGrammarParser parser = new MSTGrammarParser(tokenStream);
        parser.addErrorListener(antlrErrorListener);
        return parser;
    }

    private void PrettyPrintGeneration(ProgramNode root, String[] inputCommands){
        if (inputCommands.length > 1){
            if (inputCommands[1].equals(" -p")){
                PrettyPrint prettyPrint = new PrettyPrint();
                prettyPrint.Visit(root);

                System.exit(0);
            }
        }
    }

    private void SymbolTableAndTypeCheckerInit(ProgramNode root){
        buildSymbolTable.AddErrorListener(e -> PrintError.PrintErrors(e.getSource().toString()));
        typeChecker.AddErrorListener(e -> PrintError.PrintErrors(e.getSource().toString()));

        buildSymbolTable.AddErrorListener(e -> SetScopeAndTypeError());
        typeChecker.AddErrorListener(e -> SetScopeAndTypeError());

        buildSymbolTable.InitializeSymbolTable(root);
        typeChecker.Visit(root);
    }

    private void CodeGenerationInit(ProgramNode root){
        codeGenerator.Visit(root);
        codeGenerator.openfile();
    }

    private void JavaBytecodeGeneration(ProgramNode root){
        JavaBytecodeGenerator javaBytecodeGenerator = new JavaBytecodeGenerator();
        javaBytecodeGenerator.Visit(root);
        javaBytecodeGenerator.openfile();
        System.exit(0);
    }

    public static void SetSyntaxError(){
        syntaxError = true;
    }

    public static void SetScopeAndTypeError(){
        scopeAndTypeError = true;
    }
}