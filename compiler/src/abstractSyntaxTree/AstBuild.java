package abstractSyntaxTree;

import abstractSyntaxTree.nodes.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import sourceParser.*;

import java.util.ArrayList;
import java.util.List;

public class AstBuild extends FinalGrammarBaseVisitor<Node> {

    @Override
    public Node visitProgram(FinalGrammarParser.ProgramContext ctx) {
        ProgramNode prognode = new ProgramNode();

        prognode.leftMain = new ArrayList<>(visitBodyList(ctx.body()));


        for (FinalGrammarParser.MethodsContext m: ctx.methods()
                ) {
            if (m != null) {
                prognode.methods.add(visitMethods(m));
            }
        }

        return prognode;
    }

    public List<Node> visitBodyList(List<FinalGrammarParser.BodyContext> bodyContexts){
        List<Node> nodeList = new ArrayList<>();
        for (FinalGrammarParser.BodyContext bodyContext: bodyContexts
             ) {
            if (bodyContext != null){
                nodeList.add(visitBody(bodyContext));
            }
        }

        return nodeList;
    }
    @Override
    public Node visitBody(FinalGrammarParser.BodyContext ctx) {
        BodyNode body = new BodyNode();

        if (ctx.dcl() != null) {
            body.content = visitDcl(ctx.dcl());
        }
        else if (ctx.call() != null){
            body.content = visitCall(ctx.call());
        } else if(ctx.stmt() != null) {
            body.content = visitStmt(ctx.stmt());
        }
        return body;
    }

    @Override
    public Node visitMethods(FinalGrammarParser.MethodsContext ctx) {
        MethodNode methodNode = new MethodNode();

        methodNode.type = visitType(ctx.type());
        methodNode.id = visitTerminal(ctx.Identifier());
        if (methodNode.fprmt != null) {
            methodNode.fprmt = visitFprmt(ctx.fprmt());
        }

        methodNode.body = new ArrayList<>(visitBodyList(ctx.body()));

        if(ctx.returnval() != null) {
            methodNode.returnval = visitReturnval(ctx.returnval());
        }

        return methodNode;
    }

    @Override
    public Node visitDcl(FinalGrammarParser.DclContext ctx) {
        DclNode dclNode = new DclNode();

        if (ctx.type() != null){
            dclNode.left = visitType(ctx.type());
            dclNode.middle = visitTerminal(ctx.Identifier(0));
            if (ctx.expr() != null){
                dclNode.right = visitExpr(ctx.expr());
            } else if (ctx.r_boolean() != null){
                dclNode.right = visitR_boolean(ctx.r_boolean());
            }
        } else if (ctx.instancedcl() != null){
            dclNode.left = visitInstancedcl(ctx.instancedcl());
            dclNode.middle = visitTerminal(ctx.Identifier(0));
            dclNode.right = visitTerminal(ctx.Identifier(1));
        }


        return dclNode;
    }

    @Override
    public Node visitStmt(FinalGrammarParser.StmtContext ctx) {
        StmtNode stmtNode = new StmtNode();


        if (ctx.getText().contains("=")){
            stmtNode.child = visitAssign(ctx);
        } else if (ctx.getText().contains("if")){
            stmtNode.child = visitIf(ctx);
        } else if (ctx.getText().contains("while")){
            stmtNode.child = visitWhile(ctx);
        } else if (ctx.getText().contains("for")){
            stmtNode.child = visitFor(ctx);
        }


        return stmtNode;
    }

    public Node visitWhile(FinalGrammarParser.StmtContext ctx){
        WhileNode whileNode = new WhileNode();

        whileNode.bool = visitR_boolean(ctx.r_boolean());

        whileNode.body = new ArrayList<>(visitBodyList(ctx.body()));

        return whileNode;
    }

    public Node visitFor(FinalGrammarParser.StmtContext ctx){
        ForNode forNode = new ForNode();

        forNode.startNumber = visitTerminal(ctx.Num(0));
        forNode.endNumber = visitTerminal(ctx.Num(1));

        forNode.body = new ArrayList<>(visitBodyList(ctx.body()));

        return forNode;
    }

    public Node visitIf(FinalGrammarParser.StmtContext ctx){
        IfNode ifNode = new IfNode();

        ifNode.bool = visitR_boolean(ctx.r_boolean());

        ifNode.body = new ArrayList<>(visitBodyList(ctx.body()));

        for (FinalGrammarParser.ElseifContext elseifContext: ctx.elseif()){
            ifNode.elseif.add(visitElseif(elseifContext));
        }

        if(ctx.elsel() != null) {
            ifNode.el = visitElsel(ctx.elsel());
        }

        return ifNode;
    }

    public Node visitAssign(FinalGrammarParser.StmtContext ctx){
        AssignNode assignNode = new AssignNode();

        assignNode.left = visitTerminal(ctx.Identifier());
        assignNode.right = visitExpr(ctx.expr());

        return assignNode;
    }

    @Override
    public Node visitCall(FinalGrammarParser.CallContext ctx) {
        CallNode callNode = new CallNode();

        callNode.id = visitTerminal(ctx.Identifier());
        if(ctx.statid() != null){
            callNode.statId = visitStatid(ctx.statid());
        }

        if (ctx.prmt() != null){
            callNode.parameter = visitPrmt(ctx.prmt());
        }


        return callNode;
    }

    @Override
    public Node visitFprmt(FinalGrammarParser.FprmtContext ctx) {
        FormalParameterNode formalParameterNode = new FormalParameterNode();

        formalParameterNode.type = visitType(ctx.type());
        formalParameterNode.id = visitTerminal(ctx.Identifier());

        if (ctx.fprmt() != null){
            formalParameterNode.fprmt = visitFprmt(ctx.fprmt());
        }
        return formalParameterNode;
    }

    @Override
    public Node visitPrmt(FinalGrammarParser.PrmtContext ctx) {
        ParameterNode parameterNode = new ParameterNode();

        parameterNode.Parameter = ctx.getChild(0).getText();

        if (ctx.prmt() != null){
            parameterNode.prmt = visitPrmt(ctx.prmt());
        }

        return parameterNode;
    }


    @Override
    public Node visitReturnval(FinalGrammarParser.ReturnvalContext ctx) {
        ReturnValNode returnValNode = new ReturnValNode();

        if (ctx.expr() != null){
            returnValNode.returnvalue = visitExpr(ctx.expr());
        } else if (ctx.boolexpr() != null){
            returnValNode.returnvalue = visitBoolexpr(ctx.boolexpr());
        }

        return returnValNode;
    }

    @Override
    public Node visitInstancedcl(FinalGrammarParser.InstancedclContext ctx) {
        InstanceNode instanceNode = new InstanceNode();

        instanceNode.instance = ctx.getText();

        return instanceNode;
    }

    @Override
    public Node visitElseif(FinalGrammarParser.ElseifContext ctx) {
        ElseIfNode elseIfNode = new ElseIfNode();

        elseIfNode.bool = visitR_boolean(ctx.r_boolean());

        elseIfNode.body = new ArrayList<>(visitBodyList(ctx.body()));

        return elseIfNode;
    }

    @Override
    public Node visitElsel(FinalGrammarParser.ElselContext ctx) {
        ElseNode elseNode = new ElseNode();
        elseNode.body = new ArrayList<>(visitBodyList(ctx.body()));

        return elseNode;
    }

    @Override
    public Node visitType(FinalGrammarParser.TypeContext ctx) {
        TypesNode typesNode = new TypesNode();

        typesNode.type = ctx.getText();

        return typesNode;
    }

    @Override
    public Node visitVal(FinalGrammarParser.ValContext ctx) {
        ValueNode valueNode = new ValueNode();

        if (ctx.Num() != null){
            valueNode.child = visitTerminal(ctx.Num());
        } else if (ctx.call() != null){
            valueNode.child = visitCall(ctx.call());
        } else if (ctx.Identifier() != null){
            valueNode.child = visitTerminal(ctx.Identifier());
        } else if(ctx.getStart().getText().equals("(")){
            valueNode.child = visitExpr(ctx.expr());
        } else if(ctx.getStart().getText().equals("-")){
            valueNode.child = visitUnary(ctx.expr());
        } else {
            return null;
        }

        return valueNode;
    }

    public Node visitUnary(FinalGrammarParser.ExprContext ctx){
        UnaryMinusNode unaryMinusNode = new UnaryMinusNode();
        unaryMinusNode.child = visitExpr(ctx.expr());

        return unaryMinusNode;
    }

    @Override
    public Node visitExpr(FinalGrammarParser.ExprContext ctx) {

        if (ctx.getChildCount() == 1){
            TermNode termNode = new TermNode();
            termNode.child = visitTerm(ctx.term());
            return termNode;
        } else if(ctx.getText().contains("+")){
            PlusNode plusNode = new PlusNode();
            plusNode.left = visitTerm(ctx.term());
            plusNode.right = visitExpr(ctx.expr());
            return plusNode;
        } else if (ctx.getText().contains("-")){
            MinusNode minusNode = new MinusNode();
            minusNode.left = visitTerm(ctx.term());
            minusNode.right = visitExpr(ctx.expr());
            return minusNode;
        }

        return null;
    }

    @Override
    public Node visitTerm(FinalGrammarParser.TermContext ctx) {

        if (ctx.getChildCount() == 1){
            ValueNode valueNode = new ValueNode();
            valueNode.child = visitVal(ctx.val());
            return valueNode;
        } else if (ctx.getText().contains("*")){
            TimesNode timesNode = new TimesNode();
            timesNode.left = visitVal(ctx.val());
            timesNode.right = visitTerm(ctx.term());
            return timesNode;
        } else if (ctx.getText().contains("/")){
            DivideNode divideNode = new DivideNode();
            divideNode.left = visitVal(ctx.val());
            divideNode.right = visitTerm(ctx.term());
            return divideNode;
        }

        return null;
    }

    @Override
    public Node visitR_boolean(FinalGrammarParser.R_booleanContext ctx) {
        RBooleanNode rBooleanNode = new RBooleanNode();

        if(ctx.Identifier() != null && ctx.getChildCount() < 3){
            if(ctx.getChildCount() == 1){
                rBooleanNode.left = visitTerminal(ctx.Identifier());
                return rBooleanNode;
            } else if(ctx.getChildCount() == 2){
                NotBoolNode notBoolNode = new NotBoolNode();
                notBoolNode.child = visitTerminal(ctx.Identifier());
                rBooleanNode.left = notBoolNode;
                return rBooleanNode;
            }

        } else if(ctx.call() != null){
            rBooleanNode.left = visitCall(ctx.call());
            return rBooleanNode;
        } else if(ctx.boolexpr() != null){
            rBooleanNode.left = visitBoolexpr(ctx.boolexpr());
            return rBooleanNode;
        } else if(ctx.getChildCount() == 3){
            if(ctx.getChild(0) == ctx.expr()){
                rBooleanNode.left = visitExpr(ctx.expr());
                rBooleanNode.middle = visitBoolvalop(ctx.boolvalop());
                rBooleanNode.right = visitTerminal(ctx.Identifier());
                return rBooleanNode;
            } else if(ctx.getChild(0) == ctx.Identifier()){
                rBooleanNode.left = visitTerminal(ctx.Identifier());
                rBooleanNode.middle = visitBoolvalop(ctx.boolvalop());
                rBooleanNode.right = visitExpr(ctx.expr());
                return rBooleanNode;
            }
        }

        return null;
    }

    @Override
    public Node visitStatid(FinalGrammarParser.StatidContext ctx) {
        StatIdNode statIdNode = new StatIdNode();

        if (ctx.statlistid() != null){
            statIdNode.instance = visitStatlistid(ctx.statlistid());
        } else if (ctx.statmotorid() != null) {
            statIdNode.instance = visitStatmotorid(ctx.statmotorid());
        } else if (ctx.statsensorid() != null) {
            statIdNode.instance = visitStatsensorid(ctx.statsensorid());
        }


        return statIdNode;
    }

    @Override
    public Node visitBoolexpr(FinalGrammarParser.BoolexprContext ctx) {
        BoolExprNode boolExprNode = new BoolExprNode();

        if (ctx.expr() != null){
            boolExprNode.left = visitExpr(ctx.expr());
            boolExprNode.middle = visitBoolvalop(ctx.boolvalop());
            boolExprNode.right = visitBoolexpr(ctx.boolexpr());
        } else if (ctx.getChild(1).getText().equals("not")){
            boolExprNode.left = visitUnaryBoolExpr(ctx);
        } else {
            if (ctx.Bool() != null) {
                boolExprNode.left = visitTerminal(ctx.Bool());
            } else if (ctx.Identifier() != null){
                boolExprNode.left = visitTerminal(ctx.Identifier());
            } else if (ctx.call() != null){
                boolExprNode.left = visitCall(ctx.call());
            }
            boolExprNode.middle = visitBoolop(ctx.boolop());
            boolExprNode.right = visitR_boolean(ctx.r_boolean());
        }

        return boolExprNode;
    }

    public Node visitUnaryBoolExpr(FinalGrammarParser.BoolexprContext ctx){
        NegatedBoolNode negatedBoolNode = new NegatedBoolNode();

        if (ctx.Bool() != null) {
            negatedBoolNode.left = visitTerminal(ctx.Bool());
        } else if (ctx.Identifier() != null){
            negatedBoolNode.left = visitTerminal(ctx.Identifier());
        } else if (ctx.call() != null){
            negatedBoolNode.left = visitCall(ctx.call());
        }
        negatedBoolNode.middle = visitBoolop(ctx.boolop());
        negatedBoolNode.right = visitR_boolean(ctx.r_boolean());

        return negatedBoolNode;
    }

    @Override
    public Node visitBoolvalop(FinalGrammarParser.BoolvalopContext ctx) {
        BoolValOpNode boolValOpNode = new BoolValOpNode();

        boolValOpNode.boolValOperator = ctx.getText();

        return boolValOpNode;
    }

    @Override
    public Node visitStatmotorid(FinalGrammarParser.StatmotoridContext ctx) {
        StatMotorNode statMotorNode = new StatMotorNode();

        statMotorNode.instance = ctx.getText();

        return statMotorNode;
    }

    @Override
    public Node visitStatsensorid(FinalGrammarParser.StatsensoridContext ctx) {
        StatSensorNode statSensorNode = new StatSensorNode();

        statSensorNode.instance = ctx.getText();

        return statSensorNode;
    }

    @Override
    public Node visitStatlistid(FinalGrammarParser.StatlistidContext ctx) {
        StatListNode statListNode = new StatListNode();

        statListNode.instance = ctx.getText();

        return statListNode;
    }

    @Override
    public Node visitBoolop(FinalGrammarParser.BoolopContext ctx) {
        return new BoolOpNode(){{child = ctx.getText();}};
    }

    @Override
    public Node visitTerminal(TerminalNode node) {
        try{
            return new NumberNode(){{value = Double.parseDouble(node.getText());}};
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
}
