package prettyPrint;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

public class APrettyPrint extends Visitor {
    @Override
    public void Visit(AssignNode node) {
        node.left.Accept(this);
    }

    @Override
    public void Visit(BlockNode node) {

    }

    @Override
    public void Visit(BodyNode node) {

    }

    @Override
    public void Visit(BoolExprNode node) {

    }

    @Override
    public void Visit(BoolNode node) {

    }

    @Override
    public void Visit(BoolOpNode node) {

    }

    @Override
    public void Visit(BoolValOpNode node) {

    }

    @Override
    public void Visit(CallNode node) {

    }

    @Override
    public void Visit(DclNode node) {

    }

    @Override
    public void Visit(DivideNode node) {

    }

    @Override
    public void Visit(ElseIfNode node) {

    }

    @Override
    public void Visit(ElseNode node) {

    }

    @Override
    public void Visit(FormalParameterNode node) {

    }

    @Override
    public void Visit(ForNode node) {

    }

    @Override
    public void Visit(IdentifierNode node) {

    }

    @Override
    public void Visit(IfNode node) {

    }

    @Override
    public void Visit(InstanceNode node) {

    }

    @Override
    public void Visit(MethodNode node) {

    }

    @Override
    public void Visit(MinusNode node) {

    }

    @Override
    public void Visit(NegatedBoolNode node) {

    }

    @Override
    public void Visit(NotBoolNode node) {

    }

    @Override
    public void Visit(NumberNode node) {

    }

    @Override
    public void Visit(ParameterNode node) {

    }

    @Override
    public void Visit(PlusNode node) {

    }

    @Override
    public void Visit(ProgramNode node) {

    }

    @Override
    public void Visit(RBooleanNode node) {

    }

    @Override
    public void Visit(ReturnValNode node) {

    }

    @Override
    public void Visit(StatIdNode node) {

    }

    @Override
    public void Visit(StatListNode node) {

    }

    @Override
    public void Visit(StatMotorNode node) {

    }

    @Override
    public void Visit(StatSensorNode node) {

    }

    @Override
    public void Visit(StmtNode node) {

    }

    @Override
    public void Visit(TermNode node) {

    }

    @Override
    public void Visit(TimesNode node) {

    }

    @Override
    public void Visit(TypesNode node) {

    }

    @Override
    public void Visit(UnaryMinusNode node) {

    }

    @Override
    public void Visit(ValueNode node) {

    }

    @Override
    public void Visit(WhileNode node) {

    }
}
