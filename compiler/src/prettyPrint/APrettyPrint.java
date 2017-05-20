package prettyPrint;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

public class APrettyPrint extends Visitor {

    private int tab = 0;

    @Override
    public Object Visit(DesignSpecificDclNode node) {
        return null;
    }

    @Override
    public Object Visit(InvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(ListInvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(MotorNode node) {
        return null;
    }

    @Override
    public Object Visit(MotorInvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(SensorInvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(TouchSensorNode node) {
        return null;
    }

    @Override
    public Object Visit(UltraSoundSensorNode node) {
        return null;
    }

    @Override
    public Object Visit (SynchronizationNode node)
    {
        //TODO
         return null;
    }

    @Override
    public Object Visit (SleepNode node)
    {
        //TODO
        return null;
    }

    @Override
    public Object Visit(AndNode node) {
        node.left.Accept(this);
        System.out.print(" and ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(EqualNode node) {
        node.left.Accept(this);
        System.out.print(" equal ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(GreaterThanNode node) {
        node.left.Accept(this);
        System.out.print(" greaterThan ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(GreaterThanOrEqualNode node) {
        node.left.Accept(this);
        System.out.print(" greaterThanOrEqual ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(LessThanNode node) {
        node.left.Accept(this);
        System.out.print(" lessThan ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(LessThanOrEqualNode node) {
        node.left.Accept(this);
        System.out.print(" lessThanOrEqual ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(NotEqualNode node) {
        node.left.Accept(this);
        System.out.print(" notEqual ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(OrNode node) {
        node.left.Accept(this);
        System.out.print(" or ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(AssignNode node) {
        node.left.Accept(this);
        System.out.printf(" = ");
        node.left.Accept(this);
        System.out.println(";");
        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        tab++;
        for (Node a: node.ChildrenList
             ) {
            a.Accept(this);
        }
        tab--;
        return null;
    }

    @Override
    public Void Visit(BodyNode node) {
        Indend();
        node.content.Accept(this);
        return null;
    }

    @Override
    public Void Visit(BoolNode node) {
        System.out.print(node.aBoolean);
        return null;
    }

    @Override
    public Void Visit(CallNode node) {
        node.id.Accept(this);
        System.out.print("(");
        if (node.parameter != null){
            node.parameter.Accept(this);
        }
        System.out.print(")");
        return null;
    }

    @Override
    public Void Visit(DclNode node) {
        node.left.Accept(this);
        node.middle.Accept(this);
        if (node.right != null) {
            System.out.print(" = ");
            node.right.Accept(this);
        }
        System.out.println(";");
        return null;
    }

    @Override
    public Void Visit(DivideNode node) {
        node.left.Accept(this);
        System.out.print("/");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(ElseIfNode node) {
        System.out.print(" else if (");
        node.bool.Accept(this);
        System.out.println(") then");
        Indend();
        System.out.println("{");
        node.block.Accept(this);
        Indend();
        System.out.println("}");

        return null;
    }

    @Override
    public Void Visit(ElseNode node) {
        System.out.println("else");
        Indend();
        System.out.println("{");
        node.block.Accept(this);
        Indend();
        System.out.println("}");

        return null;
    }

    @Override
    public Void Visit(FormalParameterNode node) {
        node.type.Accept(this);
        node.id.Accept(this);
        if (node.fprmt != null){
            System.out.print(", ");
            node.fprmt.Accept(this);
        }
        return null;
    }

    @Override
    public Void Visit(ForNode node) {
        System.out.print("for ( ");
        node.startNumber.Accept(this);
        System.out.print(" to ");
        node.endNumber.Accept(this);
        System.out.println(" )");
        Indend();
        System.out.println("{");
        node.block.Accept(this);
        Indend();
        System.out.println("}");
        return null;
    }

    @Override
    public Void Visit(IdentifierNode node) {
        System.out.print(node.name);
        return null;
    }

    @Override
    public Void Visit(IfNode node) {
        System.out.print("if(");
        node.bool.Accept(this);
        System.out.println(") then ");
        Indend();
        System.out.println("{");
        node.block.Accept(this);
        Indend();
        System.out.print("}");

        if (node.elseif != null) {
            for (Node item : node.elseif
                    ) {
                item.Accept(this);
            }
        }
        if(node.el != null){
            node.el.Accept(this);
        }
        return null;
    }
    /*
    @Override
    public Void Visit(InstanceNode node) {
        System.out.print(node.instance + " ");
        return null;
    }
    */ //TODO
    @Override
    public Void Visit(MethodNode node) {
        node.type.Accept(this);
        System.out.print("Method ");
        node.id.Accept(this);
        System.out.print("(");
        if (node.fprmt != null){
            node.fprmt.Accept(this);
        }
        System.out.print(")");
        System.out.println("{");
        node.block.Accept(this);
        tab++;
        Indend();
        node.returnval.Accept(this);
        System.out.println(";");
        tab--;
        System.out.println("}");

        return null;
    }

    @Override
    public Void Visit(MinusNode node) {
        node.left.Accept(this);
        System.out.print(" - ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(NotBoolNode node) {
        System.out.printf("not ");
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(NumberNode node) {
        System.out.print(node.value);
        return null;
    }

    @Override
    public Void Visit(ParameterNode node) {

        node.Parameter.Accept(this);

        if (node.prmt != null){
            System.out.print(", ");
            node.prmt.Accept(this);
        }
        return null;
    }

    @Override
    public Void Visit(PlusNode node) {
        node.left.Accept(this);
        System.out.print(" + ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(ProgramNode node) {
        System.out.println("main {");
        node.mainBlock.Accept(this);

        System.out.println("}");

        for (Node item : node.methods)
        {
            System.out.println();
            item.Accept(this);
        }
        return null;
    }

    @Override
    public Void Visit(ReturnValNode node) {
        System.out.printf("return ");
        node.returnvalue.Accept(this);
        return null;
    }
    //TODO
    /*
    @Override
    public Void Visit(StatIdNode node) {
        node.instance.Accept(this);
        return null;
    }

    @Override
    public Void Visit(StatListNode node) {
        System.out.printf(node.instance);
        return null;
    }

    @Override
    public Void Visit(StatMotorNode node) {
        System.out.printf(node.instance);
        return null;
    }

    @Override
    public Void Visit(StatSensorNode node) {
        System.out.printf(node.instance);
        return null;
    }
    */
    @Override
    public Void Visit(StmtNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(TermNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(TimesNode node) {
        node.left.Accept(this);
        System.out.print(" * ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(TypesNode node) {
        System.out.print(node.type + " ");
        return null;
    }

    @Override
    public Void Visit(UnaryMinusNode node) {
        System.out.print("- ");
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(ValueNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(WhileNode node) {
        System.out.print("While (");
        node.bool.Accept(this);
        System.out.println(")");
        Indend();
        System.out.println("{");
        node.block.Accept(this);
        Indend();
        System.out.println("}");
        return null;
    }

    private void Indend(){
        for (int i = 0; i <= tab; i++){
            System.out.print("\t");
        }
    }
}
