package AVisitor;

import abstractSyntaxTree.nodes.*;

public abstract class Visitor {
    public abstract void Visit(AssignNode node);
    public abstract void Visit(BlockNode node);
    public abstract void Visit(BodyNode node);
    public abstract void Visit(BoolExprNode node);
    public abstract void Visit(BoolNode node);
    public abstract void Visit(BoolOpNode node);
    public abstract void Visit(BoolValOpNode node);
    public abstract void Visit(CallNode node);
    public abstract void Visit(DclNode node);
    public abstract void Visit(DivideNode node);
    public abstract void Visit(ElseIfNode node);
    public abstract void Visit(ElseNode node);
    public abstract void Visit(FormalParameterNode node);
    public abstract void Visit(ForNode node);
    public abstract void Visit(IdentifierNode node);
    public abstract void Visit(IfNode node);
    public abstract void Visit(InstanceNode node);
    public abstract void Visit(MethodNode node);
    public abstract void Visit(MinusNode node);
    public abstract void Visit(NegatedBoolNode node);
    public abstract void Visit(NotBoolNode node);
    public abstract void Visit(NumberNode node);
    public abstract void Visit(ParameterNode node);
    public abstract void Visit(PlusNode node);
    public abstract void Visit(ProgramNode node);
    public abstract void Visit(RBooleanNode node);
    public abstract void Visit(ReturnValNode node);
    public abstract void Visit(StatIdNode node);
    public abstract void Visit(StatListNode node);
    public abstract void Visit(StatMotorNode node);
    public abstract void Visit(StatSensorNode node);
    public abstract void Visit(StmtNode node);
    public abstract void Visit(TermNode node);
    public abstract void Visit(TimesNode node);
    public abstract void Visit(TypesNode node);
    public abstract void Visit(UnaryMinusNode node);
    public abstract void Visit(ValueNode node);
    public abstract void Visit(WhileNode node);

}
