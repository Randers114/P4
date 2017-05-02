package AVisitor;

import abstractSyntaxTree.nodes.*;

public abstract class Visitor<D, S, B>{
    public abstract Void Visit(AssignNode node);
    public abstract Void Visit(BlockNode node);
    public abstract Void Visit(BodyNode node);
    public abstract B Visit(BoolExprNode node);
    public abstract B Visit(BoolNode node);
    public abstract Object Visit(BoolOpNode node);
    public abstract S Visit(CallNode node);
    public abstract Void Visit(DclNode node);
    public abstract D Visit(DivideNode node);
    public abstract Void Visit(ElseIfNode node);
    public abstract Void Visit(ElseNode node);
    public abstract Object Visit(EqualNode node);
    public abstract Void Visit(FormalParameterNode node);
    public abstract Void Visit(ForNode node);
    public abstract Object Visit(GreaterThanNode node);
    public abstract Object Visit(GreaterThanOrEqualNode node);
    public abstract S Visit(IdentifierNode node);
    public abstract Void Visit(IfNode node);
    public abstract S Visit(InstanceNode node);
    public abstract Object Visit(LessThanNode node);
    public abstract Object Visit(LessThanOrEqualNode node);
    public abstract Void Visit(MethodNode node);
    public abstract D Visit(MinusNode node);
    public abstract B Visit(NotBoolNode node);
    public abstract Object Visit(NotEqualNode node);
    public abstract D Visit(NumberNode node);
    public abstract Void Visit(ParameterNode node);
    public abstract D Visit(PlusNode node);
    public abstract Void Visit(ProgramNode node);
    public abstract B Visit(RBooleanNode node);
    public abstract Object Visit(ReturnValNode node);
    public abstract Void Visit(StatIdNode node);
    public abstract Void Visit(StatListNode node);
    public abstract Void Visit(StatMotorNode node);
    public abstract Void Visit(StatSensorNode node);
    public abstract Void Visit(StmtNode node);
    public abstract Object Visit(TermNode node);
    public abstract D Visit(TimesNode node);
    public abstract S Visit(TypesNode node);
    public abstract D Visit(UnaryMinusNode node);
    public abstract Object Visit(ValueNode node);
    public abstract Void Visit(WhileNode node);

}
