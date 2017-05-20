package AVisitor;

import abstractSyntaxTree.nodes.*;

public abstract class Visitor{
    public abstract Object Visit(SynchronizationNode node);
    public abstract Object Visit(SleepNode node);
    public abstract Object Visit(AndNode node);
    public abstract Object Visit(AssignNode node);
    public abstract Object Visit(BlockNode node);
    public abstract Object Visit(BodyNode node);
    public abstract Object Visit(BoolNode node);
    public abstract Object Visit(CallNode node);
    public abstract Object Visit(DclNode node);
    public abstract Object Visit(DesignSpecificDclNode node);
    public abstract Object Visit(DivideNode node);
    public abstract Object Visit(ElseIfNode node);
    public abstract Object Visit(ElseNode node);
    public abstract Object Visit(EqualNode node);
    public abstract Object Visit(FormalParameterNode node);
    public abstract Object Visit(ForNode node);
    public abstract Object Visit(GreaterThanNode node);
    public abstract Object Visit(GreaterThanOrEqualNode node);
    public abstract Object Visit(IdentifierNode node);
    public abstract Object Visit(IfNode node);
    public abstract Object Visit(InstanceNode node);
    public abstract Object Visit(InvokeNode node);
    public abstract Object Visit(LessThanNode node);
    public abstract Object Visit(LessThanOrEqualNode node);
    public abstract Object Visit(ListInvokeNode node);
    public abstract Object Visit(MethodNode node);
    public abstract Object Visit(MotorNode node);
    public abstract Object Visit(MinusNode node);
    public abstract Object Visit(MotorInvokeNode node);
    public abstract Object Visit(NotBoolNode node);
    public abstract Object Visit(NotEqualNode node);
    public abstract Object Visit(NumberNode node);
    public abstract Object Visit(OrNode node);
    public abstract Object Visit(ParameterNode node);
    public abstract Object Visit(PlusNode node);
    public abstract Object Visit(ProgramNode node);
    public abstract Object Visit(ReturnValNode node);
    public abstract Object Visit(SensorInvokeNode node);
    public abstract Object Visit(StmtNode node);
    public abstract Object Visit(TermNode node);
    public abstract Object Visit(TimesNode node);
    public abstract Object Visit(TouchSensorNode node);
    public abstract Object Visit(TypesNode node);
    public abstract Object Visit(UltraSoundSensorNode node);
    public abstract Object Visit(UnaryMinusNode node);
    public abstract Object Visit(ValueNode node);
    public abstract Object Visit(WhileNode node);

}
