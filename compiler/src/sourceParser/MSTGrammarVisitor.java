// Generated from C:/Users/Simon/Documents/P4/compiler/src/sourceParser\MSTGrammar.g4 by ANTLR 4.7
package sourceParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MSTGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MSTGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MSTGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MSTGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(MSTGrammarParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(MSTGrammarParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MSTGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignSpecificDcl(MSTGrammarParser.DesignSpecificDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MSTGrammarParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MSTGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#fprmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFprmt(MSTGrammarParser.FprmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#returnval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnval(MSTGrammarParser.ReturnvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(MSTGrammarParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MSTGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MSTGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(MSTGrammarParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(MSTGrammarParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(MSTGrammarParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH(MSTGrammarParser.HContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(MSTGrammarParser.IContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#instancedcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstancedcl(MSTGrammarParser.InstancedclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#elsel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsel(MSTGrammarParser.ElselContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(MSTGrammarParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#prmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrmt(MSTGrammarParser.PrmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(MSTGrammarParser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolvalop(MSTGrammarParser.BoolvalopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#motorInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMotorInvoke(MSTGrammarParser.MotorInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#sensorInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensorInvoke(MSTGrammarParser.SensorInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#listInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInvoke(MSTGrammarParser.ListInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTGrammarParser#boolop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolop(MSTGrammarParser.BoolopContext ctx);
}