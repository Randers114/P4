// Generated from C:/Users/Simon/Documents/P4/compiler/src/sourceParser\MST.g4 by ANTLR 4.7
package sourceParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MSTParser}.
 */
public interface MSTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MSTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MSTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MSTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MSTParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MSTParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(MSTParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(MSTParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(MSTParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(MSTParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MSTParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MSTParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 */
	void enterDesignSpecificDcl(MSTParser.DesignSpecificDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 */
	void exitDesignSpecificDcl(MSTParser.DesignSpecificDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MSTParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MSTParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MSTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MSTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#fprmt}.
	 * @param ctx the parse tree
	 */
	void enterFprmt(MSTParser.FprmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#fprmt}.
	 * @param ctx the parse tree
	 */
	void exitFprmt(MSTParser.FprmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#returnval}.
	 * @param ctx the parse tree
	 */
	void enterReturnval(MSTParser.ReturnvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#returnval}.
	 * @param ctx the parse tree
	 */
	void exitReturnval(MSTParser.ReturnvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(MSTParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(MSTParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MSTParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MSTParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MSTParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MSTParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(MSTParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(MSTParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(MSTParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(MSTParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(MSTParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(MSTParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#h}.
	 * @param ctx the parse tree
	 */
	void enterH(MSTParser.HContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#h}.
	 * @param ctx the parse tree
	 */
	void exitH(MSTParser.HContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(MSTParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(MSTParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#instancedcl}.
	 * @param ctx the parse tree
	 */
	void enterInstancedcl(MSTParser.InstancedclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#instancedcl}.
	 * @param ctx the parse tree
	 */
	void exitInstancedcl(MSTParser.InstancedclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#elsel}.
	 * @param ctx the parse tree
	 */
	void enterElsel(MSTParser.ElselContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#elsel}.
	 * @param ctx the parse tree
	 */
	void exitElsel(MSTParser.ElselContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(MSTParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(MSTParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#prmt}.
	 * @param ctx the parse tree
	 */
	void enterPrmt(MSTParser.PrmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#prmt}.
	 * @param ctx the parse tree
	 */
	void exitPrmt(MSTParser.PrmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(MSTParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(MSTParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#boolvalop}.
	 * @param ctx the parse tree
	 */
	void enterBoolvalop(MSTParser.BoolvalopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#boolvalop}.
	 * @param ctx the parse tree
	 */
	void exitBoolvalop(MSTParser.BoolvalopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#motorInvoke}.
	 * @param ctx the parse tree
	 */
	void enterMotorInvoke(MSTParser.MotorInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#motorInvoke}.
	 * @param ctx the parse tree
	 */
	void exitMotorInvoke(MSTParser.MotorInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#sensorInvoke}.
	 * @param ctx the parse tree
	 */
	void enterSensorInvoke(MSTParser.SensorInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#sensorInvoke}.
	 * @param ctx the parse tree
	 */
	void exitSensorInvoke(MSTParser.SensorInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#listInvoke}.
	 * @param ctx the parse tree
	 */
	void enterListInvoke(MSTParser.ListInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#listInvoke}.
	 * @param ctx the parse tree
	 */
	void exitListInvoke(MSTParser.ListInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTParser#boolop}.
	 * @param ctx the parse tree
	 */
	void enterBoolop(MSTParser.BoolopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTParser#boolop}.
	 * @param ctx the parse tree
	 */
	void exitBoolop(MSTParser.BoolopContext ctx);
}