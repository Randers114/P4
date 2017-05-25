package prettyPrint;

import visitor.Visitor;
import abstractSyntaxTree.nodes.*;

public class PrettyPrint implements Visitor {

    private int tab = 0;

    @Override
    public Void Visit(DesynchronizeNode node) {
        return null;
    }

    @Override
    public Void Visit(DesignSpecificDclNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(InvokeNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Void Visit(ListInvokeNode node) {

        return null;
    }

    @Override
    public Void Visit(MotorNode node) {
        System.out.print("Motor[" + node.symbol + "]");
        node.id.Accept(this);
        System.out.print("\n");
        return null;
    }

    @Override
    public Void Visit(MotorInvokeNode node) {
        switch (node.method) {
            case "Forward":
                System.out.print(node.method + "(");
                node.speed.Accept(this);
                System.out.print(");\n");
                break;
            case "ForwardSeconds":
                System.out.print(node.method + "(");
                node.speed.Accept(this);
                System.out.print(",");
                node.time.Accept(this);
                System.out.print(");\n");
                break;
            case "Backward":
                System.out.print(node.method + "(-");
                node.speed.Accept(this);
                System.out.print (");\n");
                break;
            case "BackwardSeconds":
                System.out.print(node.method);
                System.out.print("(-");
                node.speed.Accept(this);
                System.out.print(",");
                node.time.Accept(this);
                System.out.print(");\n");
                break;
            default:
                break;

        }
        return null;
    }

    @Override
    public Void Visit(SensorInvokeNode node) {
        System.out.print(node.method);
        return null;
    }

    @Override
    public Void Visit(TouchSensorNode node) {
        System.out.print("TouchSensor[" + node.symbol + "]");
        node.id.Accept(this);
        System.out.print("\n");
        return null;
    }

    @Override
    public Void Visit(UltraSoundSensorNode node) {
        System.out.print("UltrasoundSensor[" + node.symbol + "]");
        node.id.Accept(this);
        System.out.print("\n");
        return null;
    }

    @Override
    public Void Visit (SynchronizationNode node)
    {
         node.right.Accept(this);
         System.out.print(" Synchronize ");
         node.left.Accept(this);
         System.out.print(";\n");
         return null;
    }

    @Override
    public Void Visit (SleepNode node)
    {
        System.out.print("Sleep (");
        node.child.Accept(this);
        System.out.print(");\n");
        return null;
    }

    @Override
    public Void Visit(AndNode node) {
        node.left.Accept(this);
        System.out.print(" and ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(EqualNode node) {
        node.left.Accept(this);
        System.out.print(" equal ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(GreaterThanNode node) {
        node.left.Accept(this);
        System.out.print(" greaterThan ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(GreaterThanOrEqualNode node) {
        node.left.Accept(this);
        System.out.print(" greaterThanOrEqual ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(LessThanNode node) {
        node.left.Accept(this);
        System.out.print(" lessThan ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(LessThanOrEqualNode node) {
        node.left.Accept(this);
        System.out.print(" lessThanOrEqual ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(NotEqualNode node) {
        node.left.Accept(this);
        System.out.print(" notEqual ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(OrNode node) {
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

            if(node.invoke != null)
            {
                node.id.Accept(this);
                System.out.print(".");
                node.invoke.Accept(this);
            }
            else {
                node.id.Accept(this);
                System.out.print("(");
                if (node.parameter != null)
                    node.parameter.Accept(this);
                System.out.print(")");
            }

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
        if (node.returnval != null) {
            node.returnval.Accept(this);
        }
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
        for (Node motorSensor: node.designSpecificInvokes
                ) {
            motorSensor.Accept(this);
        }
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
