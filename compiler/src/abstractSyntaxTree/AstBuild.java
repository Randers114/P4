package abstractSyntaxTree;

import abstractSyntaxTree.nodes.*;
import com.sun.org.apache.bcel.internal.classfile.LineNumber;
import org.antlr.v4.runtime.tree.TerminalNode;
import sourceParser.*;
import org.apache.commons.collections4.*;
import java.util.ArrayList;
import java.util.List;

public class AstBuild extends MSTGrammarBaseVisitor<Node> {

    @Override
    public Node visitProgram(MSTGrammarParser.ProgramContext ctx) {
        return new ProgramNode(){{
            if (ctx.designSpecificDcl() != null){
                for (MSTGrammarParser.DesignSpecificDclContext d: ctx.designSpecificDcl()
                     ) {
                    designSpecificInvokes.add(visitDesignSpecificDcl(d));
                }
            }
            mainBlock = visitBlock(ctx.body());

            for (MSTGrammarParser.MethodsContext m: ctx.methods()
                    ) {
                if (m != null) {
                    methods.add(visitMethods(m));
                }
            }
            CollectionUtils.addIgnoreNull(ChildrenList, mainBlock);
            ChildrenList.addAll(methods);
            ChildrenList.addAll(designSpecificInvokes);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitBlock(List<MSTGrammarParser.BodyContext> bodyContexts){
        return new BlockNode(){{ChildrenList = new ArrayList<>(visitBodyList(bodyContexts));}};
    }

    private List<Node> visitBodyList(List<MSTGrammarParser.BodyContext> bodyContexts){
        List<Node> nodeList = new ArrayList<>();
        for (MSTGrammarParser.BodyContext bodyContext: bodyContexts
             ) {
            if (bodyContext != null){
                nodeList.add(visitBody(bodyContext));
            }
        }

        return nodeList;
    }

    @Override
    public Node visitDesignSpecificDcl(MSTGrammarParser.DesignSpecificDclContext ctx) {
        return new DesignSpecificDclNode(){{
           child = visitInstancedcl(ctx.instancedcl());

           if (child instanceof MotorNode){
               if (ctx.Num() != null){
                   ((MotorNode) child).symbol = Double.toString(((NumberNode) visitTerminal(ctx.Num())).value);
                   ((MotorNode) child).id = visitTerminal(ctx.Identifier(0));
               } else {
                   ((MotorNode) child).symbol = ((IdentifierNode) visitTerminal(ctx.Identifier(0))).name;
                   ((MotorNode) child).id = visitTerminal(ctx.Identifier(1));
               }
               ((MotorNode) child).id.LineNumber = ctx.start.getLine();
           } else if (child instanceof UltraSoundSensorNode){
               if (ctx.Num() != null){
                   Double d = ((NumberNode) visitTerminal(ctx.Num())).value;
                   ((UltraSoundSensorNode) child).symbol = Integer.toString(d.intValue());
                   ((UltraSoundSensorNode) child).id = visitTerminal(ctx.Identifier(0));
               } else {
                   ((UltraSoundSensorNode) child).symbol = ((IdentifierNode) visitTerminal(ctx.Identifier(0))).name;
                   ((UltraSoundSensorNode) child).id = visitTerminal(ctx.Identifier(1));
               }
               ((UltraSoundSensorNode) child).id.LineNumber = ctx.start.getLine();
           } else if (child instanceof TouchSensorNode){
               if (ctx.Num() != null){
                   Double d = ((NumberNode) visitTerminal(ctx.Num())).value;
                   ((TouchSensorNode) child).symbol = Integer.toString(d.intValue());
                   ((TouchSensorNode) child).id = visitTerminal(ctx.Identifier(0));
               } else {
                   ((TouchSensorNode) child).symbol = ((IdentifierNode) visitTerminal(ctx.Identifier(0))).name;
                   ((TouchSensorNode) child).id = visitTerminal(ctx.Identifier(1));
               }
               ((TouchSensorNode) child).id.LineNumber = ctx.start.getLine();
           }
           ChildrenList.add(child);
        }};
    }

    @Override
    public Node visitInvoke(MSTGrammarParser.InvokeContext ctx) {
        return new InvokeNode(){{
            if (ctx.motorInvoke() != null){
                child = visitMotorInvoke(ctx.motorInvoke());
            } else if (ctx.sensorInvoke() != null){
                child = visitSensorInvoke(ctx.sensorInvoke());
            } else if (ctx.listInvoke() != null) {
                child = visitListInvoke(ctx.listInvoke());
            }
        }};

    }

    @Override
    public Node visitBody(MSTGrammarParser.BodyContext ctx) {
        return new BodyNode(){{
            if (ctx.dcl() != null) {
                content = visitDcl(ctx.dcl());
            } else if (ctx.call() != null){
                content = visitCall(ctx.call());
            } else if(ctx.stmt() != null) {
                content = visitStmt(ctx.stmt());
            }

            CollectionUtils.addIgnoreNull(ChildrenList, content);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitMethods(MSTGrammarParser.MethodsContext ctx) {
        return new MethodNode(){{
            if (!ctx.getText().contains("void")){
                type = visitType(ctx.type());
            } else {
                type = new TypesNode(){{type = "void";}};
            }

            id = visitTerminal(ctx.Identifier());
            if (ctx.fprmt() != null) {
                fprmt = visitFprmt(ctx.fprmt());
            }

            block = visitBlock(ctx.body());

            if(ctx.returnval() != null) {
                returnval = visitReturnval(ctx.returnval());
            }

            ChildrenList.add(type);
            ChildrenList.add(id);
            CollectionUtils.addIgnoreNull(ChildrenList, fprmt);
            CollectionUtils.addIgnoreNull(ChildrenList, block);
            CollectionUtils.addIgnoreNull(ChildrenList, returnval);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitDcl(MSTGrammarParser.DclContext ctx) {
        return new DclNode(){{
            if (ctx.type() != null && !ctx.getText().contains("List")){
                left = visitType(ctx.type());
                middle = visitTerminal(ctx.Identifier());
                if (ctx.b() != null){
                    right = visitB(ctx.b());
                }
                middle.LineNumber = ctx.start.getLine();
            } else {
                left = new ListNode(){{
                    type = visitType(ctx.type());
                    id = visitTerminal(ctx.Identifier());
                    LineNumber = ctx.start.getLine();
                }};
			}

            CollectionUtils.addIgnoreNull(ChildrenList, left);
            CollectionUtils.addIgnoreNull(ChildrenList, middle);
            CollectionUtils.addIgnoreNull(ChildrenList, right);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitStmt(MSTGrammarParser.StmtContext ctx) {
        return new StmtNode(){{
            if (ctx.start.getText().contains("if")){
                child = visitIf(ctx);
            } else if (ctx.start.getText().contains("while")){
                child = visitWhile(ctx);
            } else if (ctx.start.getText().contains("for")){
                child = visitFor(ctx);
            } else if(ctx.start.getText().contains("Sleep"))
				child = visitSleep(ctx);
			else if(ctx.getText().contains("synchronize"))
				child = visitSynch(ctx);
			else if (ctx.Identifier() != null){
                child = visitAssign(ctx);
            }


            CollectionUtils.addIgnoreNull(ChildrenList, child);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitWhile(MSTGrammarParser.StmtContext ctx){
        return new WhileNode(){{
            bool = visitB(ctx.b());
            block = visitBlock(ctx.body());

            CollectionUtils.addIgnoreNull(ChildrenList, bool);
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitFor(MSTGrammarParser.StmtContext ctx){
        return new ForNode(){{
            if (ctx.Num().size() > 1){
                startNumber = visitTerminal(ctx.Num(0));
                endNumber = visitTerminal(ctx.Num(1));
            } else if (ctx.Identifier().size() > 1){
                startNumber = visitTerminal(ctx.Identifier(0));
                endNumber = visitTerminal(ctx.Identifier(1));
            } else if (ctx.getChild(2) == ctx.Num(0)) {
                startNumber = visitTerminal(ctx.Num(0));
                endNumber = visitTerminal(ctx.Identifier(0));
            } else {
                startNumber = visitTerminal(ctx.Identifier(0));
                endNumber = visitTerminal(ctx.Num(0));
            }
            startNumber.LineNumber = ctx.start.getLine();
            endNumber.LineNumber = ctx.start.getLine();
            block = visitBlock(ctx.body());

            ChildrenList.add(startNumber);
            ChildrenList.add(endNumber);
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitIf(MSTGrammarParser.StmtContext ctx){
        return new IfNode(){{
            bool = visitB(ctx.b());
            block = visitBlock(ctx.body());

            for (MSTGrammarParser.ElseifContext elseifContext: ctx.elseif()){
                if (elseifContext != null) {
                    elseif.add(visitElseif(elseifContext));
                }
            }

            if(ctx.elsel() != null) {
                el = visitElsel(ctx.elsel());
            }

            ChildrenList.add(bool);
            ChildrenList.add(block);

            if(elseif != null){
                ChildrenList.addAll(elseif);
            }

            CollectionUtils.addIgnoreNull(ChildrenList, el);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitAssign(MSTGrammarParser.StmtContext ctx){
        return new AssignNode(){{
            left = visitTerminal(ctx.Identifier(0));
            left.LineNumber = ctx.Identifier(0).getSymbol().getLine();
            if (ctx.b() != null) {
                right = visitB(ctx.b());
            }

            ChildrenList.add(left);
            CollectionUtils.addIgnoreNull(ChildrenList, right);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitCall(MSTGrammarParser.CallContext ctx) {
        return new CallNode(){{
            id = visitTerminal(ctx.Identifier());
            id.LineNumber = ctx.Identifier().getSymbol().getLine();
            if(ctx.invoke() != null){
                invoke = visitInvoke(ctx.invoke());
            }
            if (ctx.prmt() != null){
                parameter = visitPrmt(ctx.prmt());
            }

            ChildrenList.add(id);
            CollectionUtils.addIgnoreNull(ChildrenList, invoke);
            CollectionUtils.addIgnoreNull(ChildrenList, parameter);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitFprmt(MSTGrammarParser.FprmtContext ctx) {
        return new FormalParameterNode(){{
            type = visitType(ctx.type());
            id = visitTerminal(ctx.Identifier());
            id.LineNumber = ctx.Identifier().getSymbol().getLine();

            if (ctx.fprmt() != null){
                fprmt = visitFprmt(ctx.fprmt());
            }
            ChildrenList.add(type);
            ChildrenList.add(id);
            CollectionUtils.addIgnoreNull(ChildrenList, fprmt);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitPrmt(MSTGrammarParser.PrmtContext ctx) {
        return new ParameterNode(){{
            Parameter = visitB(ctx.b());

            if (ctx.prmt() != null){
                prmt = visitPrmt(ctx.prmt());
            }
            ChildrenList.add(Parameter);
            CollectionUtils.addIgnoreNull(ChildrenList, prmt);
            LineNumber = ctx.start.getLine();
        }};
    }


    @Override
    public Node visitReturnval(MSTGrammarParser.ReturnvalContext ctx) {
        return new ReturnValNode(){{
            returnvalue = visitB(ctx.b());
            CollectionUtils.addIgnoreNull(ChildrenList, returnvalue);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitInstancedcl(MSTGrammarParser.InstancedclContext ctx) {
        String type = ctx.getText();

        if (type.contains("Motor")){
            return new MotorNode();
        } else if (type.contains("Ultrasound")){
            return new UltraSoundSensorNode();
        } else if (type.contains("Touch")){
            return new TouchSensorNode();
        }
        return null;
    }

    @Override
    public Node visitElseif(MSTGrammarParser.ElseifContext ctx) {
        return new ElseIfNode(){{
            bool = visitB(ctx.b());
            block = visitBlock(ctx.body());
            ChildrenList.add(bool);
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();}};

    }

    @Override
    public Node visitElsel(MSTGrammarParser.ElselContext ctx) {
        return new ElseNode(){{
            block = visitBlock(
            ctx.body());
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();}};
    }

    @Override
    public Node visitType(MSTGrammarParser.TypeContext ctx) {
        return new TypesNode(){{
            type = ctx.getText();
            LineNumber = ctx.start.getLine();}};
    }

    @Override
    public Node visitVal(MSTGrammarParser.ValContext ctx) {
        return new ValueNode(){{
            if (ctx.Num() != null){
                child = visitTerminal(ctx.Num());
                child.LineNumber = ctx.Num().getSymbol().getLine();
            } else if (ctx.call() != null){
                child = visitCall(ctx.call());
            } else if (ctx.Identifier() != null){
                child = visitTerminal(ctx.Identifier());
                child.LineNumber = ctx.Identifier().getSymbol().getLine();
            } else if(ctx.b() != null){
                child = visitB(ctx.b());
                paren = true;
            } else if(ctx.expr() != null){
                child = visitUnary(ctx);
            }

            ChildrenList.add(child);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitUnary(MSTGrammarParser.ValContext ctx){
        return new UnaryMinusNode(){{
            child = visitExpr(ctx.expr());
            ChildrenList.add(child);
            LineNumber = ctx.start.getLine();}};

    }

    @Override
    public Node visitExpr(MSTGrammarParser.ExprContext ctx) {
        if (ctx.getChildCount() == 1){
            return new TermNode(){{
                child = visitTerm(ctx.term());
                ChildrenList.add(child);
                LineNumber = ctx.start.getLine();
            }};
        } else if(ctx.getText().contains("+")){
            return new PlusNode(){{
                left = visitTerm(ctx.term());
                right = visitExpr(ctx.expr());
                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("-")){
            return new MinusNode(){{
                left = visitTerm(ctx.term());
                right = visitExpr(ctx.expr());
                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        }


        return null;
    }

    @Override
    public Node visitTerm(MSTGrammarParser.TermContext ctx) {
        if (ctx.getChildCount() == 1){
            return visitVal(ctx.val());
        } else if (ctx.getChild(1).getText().equals("*")){
            return new TimesNode(){{
                left = visitVal(ctx.val());
                right = visitTerm(ctx.term());
                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getChild(1).getText().equals("/")){
            return new DivideNode(){{
                left = visitVal(ctx.val());
                right = visitTerm(ctx.term());
                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        }
        return null;
    }

    @Override
    public Node visitB(MSTGrammarParser.BContext ctx) {
        if (ctx.getChildCount() == 1){
            return visitT(ctx.t());
        } else if (ctx.getText().contains("and")) {
            return new AndNode() {{
                left = visitT(ctx.t());
                right = visitB(ctx.b());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        }

        return null;
    }

    @Override
    public Node visitT(MSTGrammarParser.TContext ctx) {
        if (ctx.getChildCount() == 1){
            return visitF(ctx.f());
        } else if (ctx.getText().contains("or")) {
            return new OrNode() {{
                left = visitF(ctx.f());
                right = visitT(ctx.t());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        }

        return null;
    }

    @Override
    public Node visitF(MSTGrammarParser.FContext ctx) {
        if (ctx.getChildCount() == 1){
            return visitH(ctx.h());
        } else if (ctx.getText().contains("equal")) {
            return new EqualNode() {{
                left = visitH(ctx.h());
                right = visitF(ctx.f());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("notEqual")) {
            return new NotEqualNode() {{
                left = visitH(ctx.h());
                right = visitF(ctx.f());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        }

        return null;
    }

    @Override
    public Node visitH(MSTGrammarParser.HContext ctx) {
        if (ctx.getChildCount() == 1){
            return visitI(ctx.i());
        } else if (ctx.getText().contains("lessThan")) {
            return new LessThanNode() {{
                left = visitI(ctx.i());
                right = visitH(ctx.h());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("lessThanOrEqual")) {
            return new LessThanOrEqualNode() {{
                left = visitI(ctx.i());
                right = visitH(ctx.h());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("greaterThan")) {
            return new GreaterThanNode() {{
                left = visitI(ctx.i());
                right = visitH(ctx.h());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("greaterThanOrEqual")) {
            return new GreaterThanOrEqualNode() {{
                left = visitI(ctx.i());
                right = visitH(ctx.h());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("equal")) {
            return new EqualNode() {{
                left = visitI(ctx.i());
                right = visitH(ctx.h());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        } else if (ctx.getText().contains("notEqual")) {
            return new NotEqualNode() {{
                left = visitI(ctx.i());
                right = visitH(ctx.h());

                ChildrenList.add(left);
                ChildrenList.add(right);
                LineNumber = ctx.start.getLine();
            }};
        }

        return null;
    }

    @Override
    public Node visitI(MSTGrammarParser.IContext ctx) {
        if (ctx.Bool() != null) {
            return visitTerminal(ctx.Bool());
        } else if (ctx.expr() != null) {
            return visitExpr(ctx.expr());
        } else if (ctx.getText().contains("not")) {
            return new NotBoolNode(){{
                child = visitB(ctx.b());

                ChildrenList.add(child);
                LineNumber = ctx.start.getLine();
            }};
        }

        return null;
    }

    @Override
    public Node visitListInvoke(MSTGrammarParser.ListInvokeContext ctx) {
        return new ListInvokeNode(){{
            if (ctx.getText().contains("Add")){
                method = "Add";
                input = visitB(ctx.b());
            } else if (ctx.getText().contains("Remove")) {
                method = "Remove";
            } else if (ctx.getText().contains("GetIndex")) {
                method = "GetIndex";
                input = visitExpr(ctx.expr());
            }
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitMotorInvoke(MSTGrammarParser.MotorInvokeContext ctx) {
        return new MotorInvokeNode(){{
            if (ctx.getText().contains("Stop")) {
                method = "Stop()";
            } else if (ctx.expr().size() > 1){
                if (ctx.getText().contains("ForwardSeconds")) {
                    method = "ForwardSeconds";
                } else if (ctx.getText().contains("BackwardSeconds")) {
                    method = "BackwardSeconds";
                }
                speed = visitExpr(ctx.expr(0));
                time = visitExpr(ctx.expr(1));
            } else if (ctx.expr() != null){
                if(ctx.getText().contains("Forward")) {
                    method = "Forward";
                }
                else if(ctx.getText().contains("Backward")) {
                    method = "Backward";
                }
                speed = visitExpr(ctx.expr(0));
            }
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitSensorInvoke(MSTGrammarParser.SensorInvokeContext ctx) {
        return new SensorInvokeNode(){{
            method = ctx.getText();
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitTerminal(TerminalNode node) {
        try{
            return new NumberNode(){{
                value = Double.parseDouble(node.getText());}};
        } catch (NumberFormatException e){
            if (node.getText().equals("true")){
                return new BoolNode(){{aBoolean = true;}};
            } else if (node.getText().equals("false")){
                return new BoolNode(){{aBoolean = false;}};
            } else {
                return new IdentifierNode(){{name = node.getText();}};
            }
        }
    }

    private Node visitSleep(MSTGrammarParser.StmtContext ctx)
	{
		return new SleepNode(){{
		    if (ctx.Num(0) != null) {
                child = visitTerminal(ctx.Num(0));
            } else if(ctx.Identifier(0) != null){
		        child = visitTerminal(ctx.Identifier(0));
            }
			LineNumber = ctx.start.getLine();
		}};
	}

	private Node visitSynch(MSTGrammarParser.StmtContext ctx)
	{
	    if (ctx.getText().contains("d")){
            return new DesynchronizeNode(){{
                left = visitTerminal(ctx.Identifier(0));
                right = visitTerminal(ctx.Identifier(1));
                LineNumber = ctx.start.getLine();
            }};
        } else {
            return new SynchronizationNode(){{
                left = visitTerminal(ctx.Identifier(0));
                right = visitTerminal(ctx.Identifier(1));
                if (ctx.expr() != null) {
                    relativeSpeed = visitExpr(ctx.expr());
                }
                LineNumber = ctx.start.getLine();
            }};
        }

	}
}