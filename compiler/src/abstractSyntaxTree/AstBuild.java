package abstractSyntaxTree;

import abstractSyntaxTree.nodes.*;
import org.antlr.v4.runtime.tree.TerminalNode;
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
            LineNumber = ctx.start.getLine();
        }};
    }

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
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitMethods(FinalGrammarParser.MethodsContext ctx) {
        return new MethodNode(){{
            type = visitType(ctx.type());
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
    public Node visitDcl(FinalGrammarParser.DclContext ctx) {
        return new DclNode(){{
            if (ctx.type() != null){
                left = visitType(ctx.type());
                middle = visitTerminal(ctx.Identifier(0));
                if (ctx.b() != null){
                    right = visitB(ctx.b());
                }
            } else if (ctx.instancedcl() != null){
                left = visitInstancedcl(ctx.instancedcl());
                middle = visitTerminal(ctx.Identifier(0));
                right = visitTerminal(ctx.Identifier(1));
            }

            CollectionUtils.addIgnoreNull(ChildrenList, left);
            CollectionUtils.addIgnoreNull(ChildrenList, middle);
            CollectionUtils.addIgnoreNull(ChildrenList, right);
            middle.LineNumber = ctx.start.getLine();
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitStmt(FinalGrammarParser.StmtContext ctx) {
        return new StmtNode(){{
            if (ctx.getText().contains("if")){
                child = visitIf(ctx);
            } else if (ctx.getText().contains("while")){
                child = visitWhile(ctx);
            } else if (ctx.getText().contains("for")){
                child = visitFor(ctx);
            } else if (ctx.Identifier() != null){
                child = visitAssign(ctx);
            }

            CollectionUtils.addIgnoreNull(ChildrenList, child);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitWhile(FinalGrammarParser.StmtContext ctx){
        return new WhileNode(){{
            bool = visitB(ctx.b());
            block = visitBlock(ctx.body());

            CollectionUtils.addIgnoreNull(ChildrenList, bool);
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitFor(FinalGrammarParser.StmtContext ctx){
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

    private Node visitIf(FinalGrammarParser.StmtContext ctx){
        return new IfNode(){{
            bool = visitB(ctx.b());
            block = visitBlock(ctx.body());

            for (FinalGrammarParser.ElseifContext elseifContext: ctx.elseif()){
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

    private Node visitAssign(FinalGrammarParser.StmtContext ctx){
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
    public Node visitCall(FinalGrammarParser.CallContext ctx) {
        return new CallNode(){{
            id = visitTerminal(ctx.Identifier());
            id.LineNumber = ctx.Identifier().getSymbol().getLine();
            if(ctx.statid() != null){
                statId = visitStatid(ctx.statid());
            }
            if (ctx.prmt() != null){
                parameter = visitPrmt(ctx.prmt());
            }

            ChildrenList.add(id);
            CollectionUtils.addIgnoreNull(ChildrenList, statId);
            CollectionUtils.addIgnoreNull(ChildrenList, parameter);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitFprmt(FinalGrammarParser.FprmtContext ctx) {
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
    public Node visitPrmt(FinalGrammarParser.PrmtContext ctx) {
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
    public Node visitReturnval(FinalGrammarParser.ReturnvalContext ctx) {
        return new ReturnValNode(){{
            returnvalue = visitB(ctx.b());
            CollectionUtils.addIgnoreNull(ChildrenList, returnvalue);
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitInstancedcl(FinalGrammarParser.InstancedclContext ctx) {
        return new InstanceNode(){{
            instance = ctx.getText();
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitElseif(FinalGrammarParser.ElseifContext ctx) {
        return new ElseIfNode(){{
            bool = visitB(ctx.b());
            block = visitBlock(ctx.body());
            ChildrenList.add(bool);
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();}};

    }

    @Override
    public Node visitElsel(FinalGrammarParser.ElselContext ctx) {
        return new ElseNode(){{
            block = visitBlock(
            ctx.body());
            ChildrenList.add(block);
            LineNumber = ctx.start.getLine();}};
    }

    @Override
    public Node visitType(FinalGrammarParser.TypeContext ctx) {
        return new TypesNode(){{
            type = ctx.getText();
            LineNumber = ctx.start.getLine();}};
    }

    @Override
    public Node visitVal(FinalGrammarParser.ValContext ctx) {
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
            } else if(ctx.expr() != null){
                child = visitUnary(ctx.expr());
            }

            ChildrenList.add(child);
            LineNumber = ctx.start.getLine();
        }};
    }

    private Node visitUnary(FinalGrammarParser.ExprContext ctx){
        return new UnaryMinusNode(){{
            child = visitExpr(ctx.expr());
            ChildrenList.add(child);
            LineNumber = ctx.start.getLine();}};

    }

    @Override
    public Node visitExpr(FinalGrammarParser.ExprContext ctx) {
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
    public Node visitTerm(FinalGrammarParser.TermContext ctx) {
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
            LineNumber = ctx.start.getLine();
        }};
    }

    @Override
    public Node visitB(FinalGrammarParser.BContext ctx) {
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
    public Node visitT(FinalGrammarParser.TContext ctx) {
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
    public Node visitF(FinalGrammarParser.FContext ctx) {
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
    public Node visitH(FinalGrammarParser.HContext ctx) {
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
    public Node visitI(FinalGrammarParser.IContext ctx) {
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
    public Node visitStatmotorid(FinalGrammarParser.StatmotoridContext ctx) {
        return new StatMotorNode(){{
            instance = ctx.getText();
            LineNumber = ctx.start.getLine();}};
    }

    @Override
    public Node visitStatsensorid(FinalGrammarParser.StatsensoridContext ctx) {
        return new StatSensorNode(){{
            instance = ctx.getText();
            LineNumber = ctx.start.getLine();}};
    }

    @Override
    public Node visitStatlistid(FinalGrammarParser.StatlistidContext ctx) {
        return new StatListNode(){{
            instance = ctx.getText();
            LineNumber = ctx.start.getLine();}};
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
}