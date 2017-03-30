import abstractSyntaxTree.AstBuild;
import abstractSyntaxTree.nodes.ProgramNode;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.TokenStream;
import prettyPrint.PrettyPrint;
import sourceParser.*;

public class Main {

    public static void main(String[] args) throws Exception {

        org.antlr.v4.runtime.CharStream charStream = new ANTLRFileStream("C:\\Users\\Stefan\\Desktop\\javaparser\\src\\TestProgram.txt");
        FinalGrammarLexer lexer = new FinalGrammarLexer(charStream);

        TokenStream tokenStream = new org.antlr.v4.runtime.CommonTokenStream(lexer);
        FinalGrammarParser parser = new FinalGrammarParser(tokenStream);

        FinalGrammarParser.ProgramContext programContext = new FinalGrammarParser.ProgramContext(null, -1);

        try {
            programContext = parser.program();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProgramNode programNode;

        AstBuild astBuild = new AstBuild();

        programNode = (ProgramNode) astBuild.visitProgram(programContext);

        PrettyPrint prettyPrint = new PrettyPrint(programNode);
    }
}
