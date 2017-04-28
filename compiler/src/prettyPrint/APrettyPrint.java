package prettyPrint;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

public class APrettyPrint extends Visitor<Void, Void, Void> {
    @Override
    public Void Visit(AssignNode node) {
        node.left.Accept(this);
        System.out.printf(" = ");
        node.left.Accept(this);
        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        for (Node a: node.ChildrenList
             ) {
            a.Accept(this);
        }
        return null;
    }

    @Override
    public Void Visit(BodyNode node) {
        node.content.Accept(this);
        return null;
    }

    @Override
    public Void Visit(BoolExprNode node) {
        node.left.Accept(this);
        node.middle.Accept(this);
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(BoolNode node) {
        System.out.print(node.aBoolean);
        return null;
    }

    @Override
    public Void Visit(BoolOpNode node) {
        System.out.print(" " + node.child + " ");
        return null;
    }

    @Override
    public Void Visit(BoolValOpNode node) {
        System.out.print(" " + node.boolValOperator + " ");
        return null;
    }

    @Override
    public Void Visit(CallNode node) {
        node.id.Accept(this);
        System.out.print("(");
        node.parameter.Accept(this);
        System.out.println(") ;");
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
        System.out.print(" else if(");
        node.bool.Accept(this);
        System.out.print(")\n{");
        node.block.Accept(this);
        System.out.println("}");

        return null;
    }

    @Override
    public Void Visit(ElseNode node) {
        System.out.println("else\n{");
        node.block.Accept(this);
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
        System.out.println(" )\n{");
        node.block.Accept(this);
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
        System.out.println(")\n{");
        node.block.Accept(this);
        System.out.println("}");

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
    public Void Visit(InstanceNode node) {
        System.out.print(node.instance + " ");
        return null;
    }

    @Override
    public Void Visit(MethodNode node) {
        node.type.Accept(this);
        System.out.print("Method ");
        node.id.Accept(this);
        System.out.print("(");
        node.fprmt.Accept(this);
        System.out.print(")");
        System.out.println("{");
        node.block.Accept(this);
        node.returnval.Accept(this);
        System.out.println(";");
        System.out.println("}");

        return null;
    }

    @Override
    public Void Visit(MinusNode node) {
        node.left.Accept(this);
        System.out.print("-");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(NegatedBoolNode node) {
        System.out.printf("not ");
        node.left.Accept(this);
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
        System.out.print("+");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Void Visit(ProgramNode node) {
        System.out.println("main {");
        node.leftMain.Accept(this);
        System.out.println("}");

        for (Node item : node.methods)
        {
            item.Accept(this);
        }
        return null;
    }

    @Override
    public Void Visit(RBooleanNode node) {
        node.left.Accept(this);

        if (node.middle != null) {
            node.middle.Accept(this);
        }
        if (node.right != null) {
            node.right.Accept(this);
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
        System.out.print("*");
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
        System.out.print(") \n{ \n");
        node.block.Accept(this);
        System.out.println("}");
        return null;
    }
}
