// Generated from C:/Users/Simon/Documents/P4/compiler/src/sourceParser\MST.g4 by ANTLR 4.7
package sourceParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MSTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MSTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MSTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MSTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MSTParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(MSTParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(MSTParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MSTParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignSpecificDcl(MSTParser.DesignSpecificDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MSTParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MSTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#fprmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFprmt(MSTParser.FprmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#returnval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnval(MSTParser.ReturnvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(MSTParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MSTParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MSTParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(MSTParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(MSTParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(MSTParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH(MSTParser.HContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(MSTParser.IContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#instancedcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstancedcl(MSTParser.InstancedclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#elsel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsel(MSTParser.ElselContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(MSTParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#prmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrmt(MSTParser.PrmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(MSTParser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#boolvalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolvalop(MSTParser.BoolvalopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#motorInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMotorInvoke(MSTParser.MotorInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#sensorInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensorInvoke(MSTParser.SensorInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#listInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInvoke(MSTParser.ListInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MSTParser#boolop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolop(MSTParser.BoolopContext ctx);
}