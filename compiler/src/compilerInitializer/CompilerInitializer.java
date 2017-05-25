package compilerInitializer;

import abstractSyntaxTree.AstBuild;
import abstractSyntaxTree.nodes.ProgramNode;
import codeGenerator.CodeGenerator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import prettyPrint.APrettyPrint;
import sourceParser.FinalGrammarLexer;
import sourceParser.FinalGrammarParser;
import symbolTable.BuildSymbolTable;
import typeChecker.ATypeChecker;
import event.*;
import java.awt.*;
import java.io.File;
import java.util.BitSet;
import java.util.Scanner;

public class CompilerInitializer {

    private BuildSymbolTable buildSymbolTable = new BuildSymbolTable();
    private ATypeChecker typeChecker = new ATypeChecker();
    private CodeGenerator codeGenerator = new CodeGenerator();
    private boolean b = false;

    public void Initialize() throws Exception{
        System.out.println("Please enter the path of the file you wish to compile.");

        ProgramNode root = new ProgramNode();
        Scanner scanner = new Scanner(System.in);
        String scannerInput = scanner.nextLine();

        String[] inputCommands = new String[2];
        inputCommands = SplitInputString(scannerInput);
        String inputPath = inputCommands[0];

        try {
            root = InitAST(RunParser(AntlerInit(inputPath)));
        } catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println(b);
        PrettyPrintGeneration(root, inputCommands);
        SymbolTableAndTypeCheckerInit(root);
        CodeGenerationInit(root);
        OpenFileAfterCompilation(scanner);

    }


    private String[] SplitInputString(String scannerInput){
        String[] inputCommands = new String[2];
        inputCommands = scannerInput.split(".txt");
        if (inputCommands[1] != null){
            inputCommands[0] += ".txt";
        }
        return inputCommands;
    }

    private org.antlr.v4.runtime.CharStream AntlerInit(String inputPath) throws Exception{
        return new ANTLRFileStream(inputPath);
    }

    private ProgramNode InitAST(FinalGrammarParser.ProgramContext programContext){
        AstBuild astBuild = new AstBuild();

        return (ProgramNode) astBuild.visitProgram(programContext);
    }

    private FinalGrammarParser.ProgramContext RunParser(org.antlr.v4.runtime.CharStream charStream){
        return InitParser(charStream).program();
    }

    private FinalGrammarParser InitParser(org.antlr.v4.runtime.CharStream charStream){
        FinalGrammarLexer lexer = new FinalGrammarLexer(charStream);
        ANTLRErrorListener antlrErrorListener = new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                throw new Exception();
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

            }
        };
        lexer.addErrorListener(antlrErrorListener);
        TokenStream tokenStream = new org.antlr.v4.runtime.CommonTokenStream(lexer);
        return new FinalGrammarParser(tokenStream);
    }

    private void PrettyPrintGeneration(ProgramNode root, String[] inputCommands){
        if (inputCommands[1] != null){
            if (inputCommands[1].equals(" -p")){
                APrettyPrint aPrettyPrint = new APrettyPrint();
                aPrettyPrint.Visit(root);

                System.exit(0);
            }
        }
    }

    private void SymbolTableAndTypeCheckerInit(ProgramNode root){
        buildSymbolTable.InitializeSymbolTable(root);
        typeChecker.Visit(root);
    }

    private void CodeGenerationInit(ProgramNode root){
        codeGenerator.Visit(root);
        codeGenerator.openfile();
    }

    private void OpenFileAfterCompilation(Scanner scanner) throws Exception {
        System.out.println("Do you wish to open the compiled c-file, enter Y for yes, N for no.");
        String confirmInput = scanner.nextLine();

        if (confirmInput.equals("Y")){
            Desktop desktop = Desktop.getDesktop();
            File file = new File("C:\\Users\\Nille\\OneDrive\\Dokumenter\\P4\\compiler\\src\\codeGenerator/newfile.c");
            if (file.exists()){
                desktop.open(file);
            }
        }
    }

    private void SetB(){
        b = true;
    }
}