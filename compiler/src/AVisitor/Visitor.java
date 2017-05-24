package AVisitor;

import abstractSyntaxTree.nodes.*;

public interface Visitor{
    Object Visit(SynchronizationNode node);
    Object Visit(SleepNode node);
    Object Visit(AndNode node);
    Object Visit(AssignNode node);
    Object Visit(BlockNode node);
    Object Visit(BodyNode node);
    Object Visit(BoolNode node);
    Object Visit(CallNode node);
    Object Visit(DclNode node);
    Object Visit(DesignSpecificDclNode node);
    Object Visit(DesynchronizeNode node);
    Object Visit(DivideNode node);
    Object Visit(ElseIfNode node);
    Object Visit(ElseNode node);
    Object Visit(EqualNode node);
    Object Visit(FormalParameterNode node);
    Object Visit(ForNode node);
    Object Visit(GreaterThanNode node);
    Object Visit(GreaterThanOrEqualNode node);
    Object Visit(IdentifierNode node);
    Object Visit(IfNode node);
    Object Visit(InvokeNode node);
    Object Visit(LessThanNode node);
    Object Visit(LessThanOrEqualNode node);
    Object Visit(ListInvokeNode node);
    Object Visit(MethodNode node);
    Object Visit(MotorNode node);
    Object Visit(MinusNode node);
    Object Visit(MotorInvokeNode node);
    Object Visit(NotBoolNode node);
    Object Visit(NotEqualNode node);
    Object Visit(NumberNode node);
    Object Visit(OrNode node);
    Object Visit(ParameterNode node);
    Object Visit(PlusNode node);
    Object Visit(ProgramNode node);
    Object Visit(ReturnValNode node);
    Object Visit(SensorInvokeNode node);
    Object Visit(StmtNode node);
    Object Visit(TermNode node);
    Object Visit(TimesNode node);
    Object Visit(TouchSensorNode node);
    Object Visit(TypesNode node);
    Object Visit(UltraSoundSensorNode node);
    Object Visit(UnaryMinusNode node);
    Object Visit(ValueNode node);
    Object Visit(WhileNode node);

}
