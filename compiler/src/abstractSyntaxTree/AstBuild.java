package abstractSyntaxTree;

import abstractSyntaxTree.nodes.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jetbrains.annotations.NotNull;
import sourceParser.*;
import org.apache.commons.collections4.*;
import java.util.ArrayList;
import java.util.List;

public class AstBuild extends FinalGrammarBaseVisitor<Node> {

    @Override
    public Node visitProgram(FinalGrammarParser.ProgramContext ctx) {
        return new ProgramNode(){{
            leftMain = visitBlock(ctx.body());

            for (FinalGrammarParser.MethodsContext m: ctx.methods()
                    ) {
                if (m != null) {
                    methods.add(visitMethods(m));
                }
            }
            CollectionUtils.addIgnoreNull(ChildrenList, leftMain);
            ChildrenList.addAll(methods);
        }};
    }

    @NotNull
    private Node visitBlock(List<FinalGrammarParser.BodyContext> bodyContexts){
        return new BlockNode(){{ChildrenList = new ArrayList<>(visitBodyList(bodyContexts));}};
    }

    private List<Node> visitBodyList(List<FinalGrammarParser.BodyContext> bodyContexts){
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
        return new BodyNode(){{
            if (ctx.dcl() != null) {
                content = visitDcl(ctx.dcl());
            } else if (ctx.call() != null){
                content = visitCall(ctx.call());
            } else if(ctx.stmt() != null) {
                content = visitStmt(ctx.stmt());
            }

            CollectionUtils.addIgnoreNull(ChildrenList, content);
        }};
    }

    @Override
    public Node visitMethods(FinalGrammarParser.MethodsContext ctx) {
        MethodNode methodNode = new MethodNode();

        methodNode.type = visitType(ctx.type());
        methodNode.id = visitTerminal(ctx.Identifier());
        if (ctx.fprmt() != null) {
            methodNode.fprmt = visitFprmt(ctx.fprmt());
        }

        methodNode.block = visitBlock(ctx.body());

        if(ctx.returnval() != null) {
            methodNode.returnval = visitReturnval(ctx.returnval());
        }

        methodNode.ChildrenList.add(methodNode.type);
        methodNode.ChildrenList.add(methodNode.id);
        CollectionUtils.addIgnoreNull(methodNode.ChildrenList, methodNode.fprmt);
        CollectionUtils.addIgnoreNull(methodNode.ChildrenList, methodNode.block);
        CollectionUtils.addIgnoreNull(methodNode.ChildrenList, methodNode.returnval);

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

        CollectionUtils.addIgnoreNull(dclNode.ChildrenList, dclNode.left);
        CollectionUtils.addIgnoreNull(dclNode.ChildrenList, dclNode.middle);
        CollectionUtils.addIgnoreNull(dclNode.ChildrenList, dclNode.right);
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

        CollectionUtils.addIgnoreNull(stmtNode.ChildrenList, stmtNode.child);

        return stmtNode;
    }

    private Node visitWhile(FinalGrammarParser.StmtContext ctx){
        WhileNode whileNode = new WhileNode();

        whileNode.bool = visitR_boolean(ctx.r_boolean());
        whileNode.block = visitBlock(ctx.body());

        CollectionUtils.addIgnoreNull(whileNode.ChildrenList, whileNode.bool);
        whileNode.ChildrenList.add(whileNode.block);

        return whileNode;
    }

    private Node visitFor(FinalGrammarParser.StmtContext ctx){
        ForNode forNode = new ForNode();

        forNode.startNumber = visitTerminal(ctx.Num(0));
        forNode.endNumber = visitTerminal(ctx.Num(1));
        forNode.block = visitBlock(ctx.body());

        forNode.ChildrenList.add(forNode.startNumber);
        forNode.ChildrenList.add(forNode.endNumber);
        forNode.ChildrenList.add(forNode.block);

        return forNode;
    }

    private Node visitIf(FinalGrammarParser.StmtContext ctx){
        IfNode ifNode = new IfNode();

        ifNode.bool = visitR_boolean(ctx.r_boolean());
        ifNode.block = visitBlock(ctx.body());

        for (FinalGrammarParser.ElseifContext elseifContext: ctx.elseif()){
            if (elseifContext != null) {
                ifNode.elseif.add(visitElseif(elseifContext));
            }
        }

        if(ctx.elsel() != null) {
            ifNode.el = visitElsel(ctx.elsel());
        }

        ifNode.ChildrenList.add(ifNode.bool);
        ifNode.ChildrenList.add(ifNode.block);
        if(ifNode.elseif != null){
            ifNode.ChildrenList.addAll(ifNode.elseif);
        }

        CollectionUtils.addIgnoreNull(ifNode.ChildrenList, ifNode.el);

        return ifNode;
    }

    private Node visitAssign(FinalGrammarParser.StmtContext ctx){
        AssignNode assignNode = new AssignNode();

        assignNode.left = visitTerminal(ctx.Identifier());
        assignNode.right = visitExpr(ctx.expr());

        assignNode.ChildrenList.add(assignNode.left);
        assignNode.ChildrenList.add(assignNode.right);
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

        callNode.ChildrenList.add(callNode.id);
        CollectionUtils.addIgnoreNull(callNode.ChildrenList, callNode.statId);
        CollectionUtils.addIgnoreNull(callNode.ChildrenList, callNode.parameter);
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
        formalParameterNode.ChildrenList.add(formalParameterNode.type);
        formalParameterNode.ChildrenList.add(formalParameterNode.id);
        CollectionUtils.addIgnoreNull(formalParameterNode.ChildrenList, formalParameterNode.fprmt);
        return formalParameterNode;
    }

    @Override
    public Node visitPrmt(FinalGrammarParser.PrmtContext ctx) {
        ParameterNode parameterNode = new ParameterNode();

        parameterNode.Parameter = visitVal(ctx.val());

        if (ctx.prmt() != null){
            parameterNode.prmt = visitPrmt(ctx.prmt());
        }
        parameterNode.ChildrenList.add(parameterNode.Parameter);
        CollectionUtils.addIgnoreNull(parameterNode.ChildrenList, parameterNode.prmt);
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

        CollectionUtils.addIgnoreNull(returnValNode.ChildrenList, returnValNode.returnvalue);

        return returnValNode;
    }

    @Override
    public Node visitInstancedcl(FinalGrammarParser.InstancedclContext ctx) {
        return new InstanceNode(){{instance = ctx.getText();}};
    }

    @Override
    public Node visitElseif(FinalGrammarParser.ElseifContext ctx) {
        return new ElseIfNode(){{
            bool = visitR_boolean(ctx.r_boolean());
            block = visitBlock(ctx.body());
            ChildrenList.add(bool);
            ChildrenList.add(block);}};
    }

    @Override
    public Node visitElsel(FinalGrammarParser.ElselContext ctx) {
        return new ElseNode(){{block = visitBlock(ctx.body()); ChildrenList.add(block);}};
    }

    @Override
    public Node visitType(FinalGrammarParser.TypeContext ctx) {
        return new TypesNode(){{type = ctx.getText();}};
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

        valueNode.ChildrenList.add(valueNode.child);
        return valueNode;
    }

    @NotNull
    private Node visitUnary(FinalGrammarParser.ExprContext ctx){
        return new UnaryMinusNode(){{
            child = visitExpr(ctx.expr());
            ChildrenList.add(child);}};
    }

    @Override
    public Node visitExpr(FinalGrammarParser.ExprContext ctx) {

        if (ctx.getChildCount() == 1){
            return new TermNode(){{
                child = visitTerm(ctx.term());
                ChildrenList.add(child);
            }};
        } else if(ctx.getText().contains("+")){
            return new PlusNode(){{
                left = visitTerm(ctx.term());
                right = visitExpr(ctx.expr());
                ChildrenList.add(left);
                ChildrenList.add(right);
            }};
        } else if (ctx.getText().contains("-")){
            return new MinusNode(){{
                left = visitTerm(ctx.term());
                right = visitExpr(ctx.expr());
                ChildrenList.add(left);
                ChildrenList.add(right);
            }};
        }


        return null;
    }

    @Override
    public Node visitTerm(FinalGrammarParser.TermContext ctx) {

        if (ctx.getChildCount() == 1){
            return visitVal(ctx.val());
        } else if (ctx.getChild(1).getText().equals("*")){
            return new TimesNode(){{
                left = visitVal(ctx.val());
                right = visitTerm(ctx.term());
                ChildrenList.add(left);
                ChildrenList.add(right);
            }};
        } else if (ctx.getChild(1).getText().equals("/")){
            return new DivideNode(){{
                left = visitVal(ctx.val());
                right = visitTerm(ctx.term());
                ChildrenList.add(left);
                ChildrenList.add(right);
            }};
        }
        return null;
    }

    @Override
    public Node visitR_boolean(FinalGrammarParser.R_booleanContext ctx) {
        RBooleanNode rBooleanNode = new RBooleanNode();

        if(ctx.Identifier() != null && ctx.getChildCount() < 3){
            if(ctx.getChildCount() == 1){
                rBooleanNode.left = visitTerminal(ctx.Identifier());
            } else if(ctx.getChildCount() == 2){
                NotBoolNode notBoolNode = new NotBoolNode();
                notBoolNode.child = visitTerminal(ctx.Identifier());
                notBoolNode.ChildrenList.add(notBoolNode.child);
                rBooleanNode.left = notBoolNode;
            }
        } else if(ctx.call() != null){
            rBooleanNode.left = visitCall(ctx.call());
        } else if(ctx.boolexpr() != null){
            rBooleanNode.left = visitBoolexpr(ctx.boolexpr());
        } else if(ctx.getChildCount() == 3){
            if(ctx.getChild(0) == ctx.expr()){
                rBooleanNode.left = visitExpr(ctx.expr());
                rBooleanNode.middle = visitBoolvalop(ctx.boolvalop());
                rBooleanNode.right = visitTerminal(ctx.Identifier());
            } else if(ctx.getChild(0) == ctx.Identifier()){
                rBooleanNode.left = visitTerminal(ctx.Identifier());
                rBooleanNode.middle = visitBoolvalop(ctx.boolvalop());
                rBooleanNode.right = visitExpr(ctx.expr());
            }
        } else {
            return null;
        }

        rBooleanNode.ChildrenList.add(rBooleanNode.left);
        CollectionUtils.addIgnoreNull(rBooleanNode.ChildrenList, rBooleanNode.middle);
        CollectionUtils.addIgnoreNull(rBooleanNode.ChildrenList, rBooleanNode.right);
        return rBooleanNode;
    }

    @Override
    public Node visitStatid(FinalGrammarParser.StatidContext ctx) {
        return new StatIdNode(){{
            if (ctx.statlistid() != null){
                instance = visitStatlistid(ctx.statlistid());
            } else if (ctx.statmotorid() != null) {
                instance = visitStatmotorid(ctx.statmotorid());
            } else if (ctx.statsensorid() != null) {
                instance = visitStatsensorid(ctx.statsensorid());
            }
            ChildrenList.add(instance);
        }};
    }

    @Override
    public Node visitBoolexpr(FinalGrammarParser.BoolexprContext ctx) {
        return new BoolExprNode(){{
            if (ctx.expr() != null){
                left = visitExpr(ctx.expr());
                middle = visitBoolvalop(ctx.boolvalop());
                right = visitBoolexpr(ctx.boolexpr());
            } else if (ctx.getChild(1).getText().equals("not")){
                left = visitUnaryBoolExpr(ctx);
            } else {
                if (ctx.Bool() != null) {
                    left = visitTerminal(ctx.Bool());
                } else if (ctx.Identifier() != null){
                    left = visitTerminal(ctx.Identifier());
                } else if (ctx.call() != null){
                    left = visitCall(ctx.call());
                }
                middle = visitBoolop(ctx.boolop());
                right = visitR_boolean(ctx.r_boolean());
            }

            ChildrenList.add(left);
            CollectionUtils.addIgnoreNull(ChildrenList, middle);
            CollectionUtils.addIgnoreNull(ChildrenList, right);
        }};
    }

    @NotNull
    private Node visitUnaryBoolExpr(FinalGrammarParser.BoolexprContext ctx){
        return new NegatedBoolNode(){{
            if (ctx.Bool() != null) {
                left = visitTerminal(ctx.Bool());
            } else if (ctx.Identifier() != null){
                left = visitTerminal(ctx.Identifier());
            } else if (ctx.call() != null){
                left = visitCall(ctx.call());
            }
            middle = visitBoolop(ctx.boolop());
            right = visitR_boolean(ctx.r_boolean());

            ChildrenList.add(left);
            ChildrenList.add(middle);
            ChildrenList.add(right);
        }};
    }

    @Override
    public Node visitBoolvalop(FinalGrammarParser.BoolvalopContext ctx) {
        return new BoolValOpNode(){{boolValOperator = ctx.getText();}};
    }

    @Override
    public Node visitStatmotorid(FinalGrammarParser.StatmotoridContext ctx) {
        return new StatMotorNode(){{instance = ctx.getText();}};
    }

    @Override
    public Node visitStatsensorid(FinalGrammarParser.StatsensoridContext ctx) {
        return new StatSensorNode(){{instance = ctx.getText();}};
    }

    @Override
    public Node visitStatlistid(FinalGrammarParser.StatlistidContext ctx) {
        return new StatListNode(){{instance = ctx.getText();}};
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