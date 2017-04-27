package prettyPrint;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

public class APrettyPrint extends Visitor {
    @Override
    public void Visit(AssignNode node) {
        node.left.Accept(this);
        System.out.printf(" = ");
        node.left.Accept(this);
    }

    @Override
    public void Visit(BlockNode node) {
        for (Node a: node.ChildrenList
             ) {
            a.Accept(this);
        }
    }

    @Override
    public void Visit(BodyNode node) {
        node.content.Accept(this);
    }

    @Override
    public void Visit(BoolExprNode node) {
        node.left.Accept(this);
        node.middle.Accept(this);
        node.right.Accept(this);
    }

    @Override
    public void Visit(BoolNode node) {
        System.out.print(node.aBoolean);
    }

    @Override
    public void Visit(BoolOpNode node) {
        System.out.print(" " + node.child + " ");
    }

    @Override
    public void Visit(BoolValOpNode node) {
        System.out.print(" " + node.boolValOperator + " ");
    }

    @Override
    public void Visit(CallNode node) {
        node.id.Accept(this);
        System.out.print("(");
        node.parameter.Accept(this);
        System.out.println(") ;");
    }

    @Override
    public void Visit(DclNode node) {
        node.left.Accept(this);
        node.middle.Accept(this);
        if (node.right != null) {
            System.out.print(" = ");
            node.right.Accept(this);
        }
        System.out.println(";");
    }

    @Override
    public void Visit(DivideNode node) {
        node.left.Accept(this);
        System.out.print("/");
        node.right.Accept(this);
    }

    @Override
    public void Visit(ElseIfNode node) {
        System.out.print(" else if(");
        node.bool.Accept(this);
        System.out.print(")\n{");
        node.block.Accept(this);
        System.out.println("}");
    }

    @Override
    public void Visit(ElseNode node) {
        System.out.println("else\n{");
        node.block.Accept(this);
        System.out.println("}");
    }

    @Override
    public void Visit(FormalParameterNode node) {
        node.type.Accept(this);
        node.id.Accept(this);
        if (node.fprmt != null){
            System.out.print(", ");
            node.fprmt.Accept(this);
        }
    }

    @Override
    public void Visit(ForNode node) {
        System.out.print("for ( ");
        node.startNumber.Accept(this);
        System.out.print(" to ");
        node.endNumber.Accept(this);
        System.out.println(" )\n{");
        node.block.Accept(this);
        System.out.println("}");
    }

    @Override
    public void Visit(IdentifierNode node) {
        System.out.print(node.name);
    }

    @Override
    public void Visit(IfNode node) {
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
        node.el.Accept(this);
    }

    @Override
    public void Visit(InstanceNode node) {
        System.out.print(node.instance + " ");
    }

    @Override
    public void Visit(MethodNode node) {
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
    }

    @Override
    public void Visit(MinusNode node) {
        node.left.Accept(this);
        System.out.print("-");
        node.right.Accept(this);
    }

    @Override
    public void Visit(NegatedBoolNode node) {
        System.out.printf("not ");
        node.left.Accept(this);

    }

    @Override
    public void Visit(NotBoolNode node) {
        System.out.printf("not ");
        node.child.Accept(this);
    }

    @Override
    public void Visit(NumberNode node) {
        System.out.print(node.value);
    }

    @Override
    public void Visit(ParameterNode node) {
        System.out.print(node.Parameter);

        if (node.prmt != null){
            System.out.print(", ");
            node.prmt.Accept(this);
        }
    }

    @Override
    public void Visit(PlusNode node) {
        node.left.Accept(this);
        System.out.print("+");
        node.right.Accept(this);
    }

    @Override
    public void Visit(ProgramNode node) {
        System.out.println("main {");
        node.leftMain.Accept(this);
        System.out.println("}");

        for (Node item : node.methods)
        {
            item.Accept(this);
        }
    }

    @Override
    public void Visit(RBooleanNode node) {
        node.left.Accept(this);

        if (node.middle != null) {
            node.middle.Accept(this);
        }
        if (node.right != null) {
            node.right.Accept(this);
        }
    }

    @Override
    public void Visit(ReturnValNode node) {
        System.out.printf("return ");
        node.returnvalue.Accept(this);
    }

    @Override
    public void Visit(StatIdNode node) {
        node.instance.Accept(this);
    }

    @Override
    public void Visit(StatListNode node) {
        System.out.printf(node.instance);
    }

    @Override
    public void Visit(StatMotorNode node) {
        System.out.printf(node.instance);
    }

    @Override
    public void Visit(StatSensorNode node) {
        System.out.printf(node.instance);
    }

    @Override
    public void Visit(StmtNode node) {
        node.child.Accept(this);
    }

    @Override
    public void Visit(TermNode node) {
        node.child.Accept(this);
    }

    @Override
    public void Visit(TimesNode node) {
        node.left.Accept(this);
        System.out.print("*");
        node.right.Accept(this);
    }

    @Override
    public void Visit(TypesNode node) {
        System.out.print(node.type + " ");
    }

    @Override
    public void Visit(UnaryMinusNode node) {
        System.out.print("- ");
        node.child.Accept(this);
    }

    @Override
    public void Visit(ValueNode node) {
        node.child.Accept(this);
    }

    @Override
    public void Visit(WhileNode node) {
        System.out.print("While (");
        node.bool.Accept(this);
        System.out.print(") \n{ \n");
        node.block.Accept(this);
        System.out.println("}");
    }
}
