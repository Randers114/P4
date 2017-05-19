// Generated from C:/Users/Simon/Documents/P4/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.7
package sourceParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinalGrammarParser}.
 */
public interface FinalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FinalGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FinalGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FinalGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FinalGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(FinalGrammarParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(FinalGrammarParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(FinalGrammarParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(FinalGrammarParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FinalGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FinalGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(FinalGrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(FinalGrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FinalGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FinalGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#fprmt}.
	 * @param ctx the parse tree
	 */
	void enterFprmt(FinalGrammarParser.FprmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#fprmt}.
	 * @param ctx the parse tree
	 */
	void exitFprmt(FinalGrammarParser.FprmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#returnval}.
	 * @param ctx the parse tree
	 */
	void enterReturnval(FinalGrammarParser.ReturnvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#returnval}.
	 * @param ctx the parse tree
	 */
	void exitReturnval(FinalGrammarParser.ReturnvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(FinalGrammarParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(FinalGrammarParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FinalGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FinalGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FinalGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FinalGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(FinalGrammarParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(FinalGrammarParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(FinalGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(FinalGrammarParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(FinalGrammarParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(FinalGrammarParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#h}.
	 * @param ctx the parse tree
	 */
	void enterH(FinalGrammarParser.HContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#h}.
	 * @param ctx the parse tree
	 */
	void exitH(FinalGrammarParser.HContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(FinalGrammarParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(FinalGrammarParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#instancedcl}.
	 * @param ctx the parse tree
	 */
	void enterInstancedcl(FinalGrammarParser.InstancedclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#instancedcl}.
	 * @param ctx the parse tree
	 */
	void exitInstancedcl(FinalGrammarParser.InstancedclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#elsel}.
	 * @param ctx the parse tree
	 */
	void enterElsel(FinalGrammarParser.ElselContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#elsel}.
	 * @param ctx the parse tree
	 */
	void exitElsel(FinalGrammarParser.ElselContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(FinalGrammarParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(FinalGrammarParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#prmt}.
	 * @param ctx the parse tree
	 */
	void enterPrmt(FinalGrammarParser.PrmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#prmt}.
	 * @param ctx the parse tree
	 */
	void exitPrmt(FinalGrammarParser.PrmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#statid}.
	 * @param ctx the parse tree
	 */
	void enterStatid(FinalGrammarParser.StatidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#statid}.
	 * @param ctx the parse tree
	 */
	void exitStatid(FinalGrammarParser.StatidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 */
	void enterBoolvalop(FinalGrammarParser.BoolvalopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 */
	void exitBoolvalop(FinalGrammarParser.BoolvalopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#statmotorid}.
	 * @param ctx the parse tree
	 */
	void enterStatmotorid(FinalGrammarParser.StatmotoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#statmotorid}.
	 * @param ctx the parse tree
	 */
	void exitStatmotorid(FinalGrammarParser.StatmotoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#statsensorid}.
	 * @param ctx the parse tree
	 */
	void enterStatsensorid(FinalGrammarParser.StatsensoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#statsensorid}.
	 * @param ctx the parse tree
	 */
	void exitStatsensorid(FinalGrammarParser.StatsensoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#statlistid}.
	 * @param ctx the parse tree
	 */
	void enterStatlistid(FinalGrammarParser.StatlistidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#statlistid}.
	 * @param ctx the parse tree
	 */
	void exitStatlistid(FinalGrammarParser.StatlistidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalGrammarParser#boolop}.
	 * @param ctx the parse tree
	 */
	void enterBoolop(FinalGrammarParser.BoolopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalGrammarParser#boolop}.
	 * @param ctx the parse tree
	 */
	void exitBoolop(FinalGrammarParser.BoolopContext ctx);
}