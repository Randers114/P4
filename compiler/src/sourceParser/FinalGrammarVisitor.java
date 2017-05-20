// Generated from F:/Source Tree/Programmer/P4/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by {@link FinalGrammarParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignSpecificDcl(FinalGrammarParser.DesignSpecificDclContext ctx);
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
	 * Visit a parse tree produced by {@link FinalGrammarParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(FinalGrammarParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(FinalGrammarParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(FinalGrammarParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH(FinalGrammarParser.HContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(FinalGrammarParser.IContext ctx);
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
	 * Visit a parse tree produced by {@link FinalGrammarParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(FinalGrammarParser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolvalop(FinalGrammarParser.BoolvalopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#motorInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMotorInvoke(FinalGrammarParser.MotorInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#sensorInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensorInvoke(FinalGrammarParser.SensorInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#listInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInvoke(FinalGrammarParser.ListInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalGrammarParser#boolop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolop(FinalGrammarParser.BoolopContext ctx);
}