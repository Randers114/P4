import abstractSyntaxTree.AstBuild;
import abstractSyntaxTree.nodes.ProgramNode;
import kotlin.SinceKotlin;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.TokenStream;
import prettyPrint.PrettyPrint;
import sourceParser.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String InputPath = scanner.nextLine();
        
        org.antlr.v4.runtime.CharStream charStream = new ANTLRFileStream(InputPath);

        PrettyPrint.Init(InitAST(RunParser(charStream)));
    }

    private static FinalGrammarParser InitParser(org.antlr.v4.runtime.CharStream charStream){
        FinalGrammarLexer lexer = new FinalGrammarLexer(charStream);
        TokenStream tokenStream = new org.antlr.v4.runtime.CommonTokenStream(lexer);

        return new FinalGrammarParser(tokenStream);
    }

    private static ProgramNode InitAST(FinalGrammarParser.ProgramContext programContext){
        AstBuild astBuild = new AstBuild();

        return (ProgramNode) astBuild.visitProgram(programContext);
    }

    private static FinalGrammarParser.ProgramContext RunParser(org.antlr.v4.runtime.CharStream charStream){
        FinalGrammarParser.ProgramContext programContext = new FinalGrammarParser.ProgramContext(null, -1);

        try {
            programContext = InitParser(charStream).program();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return programContext;
    }
}
