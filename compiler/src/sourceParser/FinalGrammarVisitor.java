// Generated from C:/Users/Stefan/Desktop/4. Semester/Git/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.6
package sourceParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FinalGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FinalGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FinalGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FinalGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(FinalGrammarParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(FinalGrammarParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FinalGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(FinalGrammarParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FinalGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#fprmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFprmt(FinalGrammarParser.FprmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#returnval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnval(FinalGrammarParser.ReturnvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(FinalGrammarParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FinalGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FinalGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#r_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_boolean(FinalGrammarParser.R_booleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#instancedcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstancedcl(FinalGrammarParser.InstancedclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#elsel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsel(FinalGrammarParser.ElselContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(FinalGrammarParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#prmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrmt(FinalGrammarParser.PrmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#statid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatid(FinalGrammarParser.StatidContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(FinalGrammarParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolvalop(FinalGrammarParser.BoolvalopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#statmotorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmotorid(FinalGrammarParser.StatmotoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#statsensorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsensorid(FinalGrammarParser.StatsensoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#statlistid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatlistid(FinalGrammarParser.StatlistidContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#boolop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolop(FinalGrammarParser.BoolopContext ctx);
}