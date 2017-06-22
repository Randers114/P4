// Generated from F:/Source Tree/Programmer/P4/compiler/src/sourceParser\MSTGrammar.g4 by ANTLR 4.7
package sourceParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MSTGrammarParser}.
 */
public interface MSTGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MSTGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MSTGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MSTGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MSTGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(MSTGrammarParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(MSTGrammarParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(MSTGrammarParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(MSTGrammarParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MSTGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MSTGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 */
	void enterDesignSpecificDcl(MSTGrammarParser.DesignSpecificDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#designSpecificDcl}.
	 * @param ctx the parse tree
	 */
	void exitDesignSpecificDcl(MSTGrammarParser.DesignSpecificDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MSTGrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MSTGrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MSTGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MSTGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#fprmt}.
	 * @param ctx the parse tree
	 */
	void enterFprmt(MSTGrammarParser.FprmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#fprmt}.
	 * @param ctx the parse tree
	 */
	void exitFprmt(MSTGrammarParser.FprmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#returnval}.
	 * @param ctx the parse tree
	 */
	void enterReturnval(MSTGrammarParser.ReturnvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#returnval}.
	 * @param ctx the parse tree
	 */
	void exitReturnval(MSTGrammarParser.ReturnvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(MSTGrammarParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(MSTGrammarParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MSTGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MSTGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MSTGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MSTGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(MSTGrammarParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(MSTGrammarParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(MSTGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(MSTGrammarParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(MSTGrammarParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(MSTGrammarParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#h}.
	 * @param ctx the parse tree
	 */
	void enterH(MSTGrammarParser.HContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#h}.
	 * @param ctx the parse tree
	 */
	void exitH(MSTGrammarParser.HContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(MSTGrammarParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(MSTGrammarParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#instancedcl}.
	 * @param ctx the parse tree
	 */
	void enterInstancedcl(MSTGrammarParser.InstancedclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#instancedcl}.
	 * @param ctx the parse tree
	 */
	void exitInstancedcl(MSTGrammarParser.InstancedclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#elsel}.
	 * @param ctx the parse tree
	 */
	void enterElsel(MSTGrammarParser.ElselContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#elsel}.
	 * @param ctx the parse tree
	 */
	void exitElsel(MSTGrammarParser.ElselContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(MSTGrammarParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(MSTGrammarParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#prmt}.
	 * @param ctx the parse tree
	 */
	void enterPrmt(MSTGrammarParser.PrmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#prmt}.
	 * @param ctx the parse tree
	 */
	void exitPrmt(MSTGrammarParser.PrmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(MSTGrammarParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(MSTGrammarParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 */
	void enterBoolvalop(MSTGrammarParser.BoolvalopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#boolvalop}.
	 * @param ctx the parse tree
	 */
	void exitBoolvalop(MSTGrammarParser.BoolvalopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#motorInvoke}.
	 * @param ctx the parse tree
	 */
	void enterMotorInvoke(MSTGrammarParser.MotorInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#motorInvoke}.
	 * @param ctx the parse tree
	 */
	void exitMotorInvoke(MSTGrammarParser.MotorInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#sensorInvoke}.
	 * @param ctx the parse tree
	 */
	void enterSensorInvoke(MSTGrammarParser.SensorInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#sensorInvoke}.
	 * @param ctx the parse tree
	 */
	void exitSensorInvoke(MSTGrammarParser.SensorInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#listInvoke}.
	 * @param ctx the parse tree
	 */
	void enterListInvoke(MSTGrammarParser.ListInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#listInvoke}.
	 * @param ctx the parse tree
	 */
	void exitListInvoke(MSTGrammarParser.ListInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSTGrammarParser#boolop}.
	 * @param ctx the parse tree
	 */
	void enterBoolop(MSTGrammarParser.BoolopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSTGrammarParser#boolop}.
	 * @param ctx the parse tree
	 */
	void exitBoolop(MSTGrammarParser.BoolopContext ctx);
}