package codeGenerator;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class CodeGenerator extends Visitor {
    private List<String> Targetcode = new ArrayList();

    public void openfile() {
        try {

            File file = new File("/Users/lassekristensen/P4/compiler/src/codeGenerator/newfile.txt");
            if (file.createNewFile())
            {
                System.out.println("File is created!");
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter("/Users/lassekristensen/P4/compiler/src/codeGenerator/newfile.txt", "UTF-8");
            writer.flush();
            WriteToFile(writer);

            writer.close();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public void WriteToFile(PrintWriter writer)
    {
        writer.println("#include <stdio.h>");

        for (String content: Targetcode)
        {
            writer.print(content);
        }

    }


    @Override
    public Object Visit(AndNode node) {
        node.left.Accept(this);
        Targetcode.add(" && ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(AssignNode node) {
        node.left.Accept(this);
        Targetcode.add(" = ");
        node.right.Accept(this);
        Targetcode.add(" ; \n");

        return null;
    }

    @Override
    public Object Visit(BlockNode node) {
        for (Node a : node.ChildrenList)
        {
            a.Accept(this);
        }
        return null;
    }

    @Override
    public Object Visit(BodyNode node) {
        node.content.Accept(this);
        return null;
    }

    @Override
    public Object Visit(BoolNode node) {
        String aboolean = node.toString();

        if(aboolean == "true")
        {
            Targetcode.add("1");
        }
        else
        {
            Targetcode.add("0");
        }
        return null;
    }

    @Override
    public Object Visit(CallNode node) {
        node.id.Accept(this);
        Targetcode.add("(");
        if (node.parameter != null) {
            node.parameter.Accept(this);
        }
        Targetcode.add("); \n");
        return null;
    }

    @Override
    public Object Visit(DclNode node) {
        node.left.Accept(this);
        node.middle.Accept(this);
        if(node.right != null)
        {
            node.right.Accept(this);
        }
        Targetcode.add("; \n");

        return null;
    }

    @Override
    public Object Visit(DivideNode node) {
        node.left.Accept(this);
        Targetcode.add("/");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Object Visit(ElseIfNode node) {
        Targetcode.add("else if(");
        node.bool.Accept(this);
        Targetcode.add(")\n{");
        node.block.Accept(this);
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Object Visit(ElseNode node) {
        Targetcode.add("else{ \n");
        node.block.Accept(this);
        Targetcode.add("} \n");


        return null;
    }

    @Override
    public Object Visit(EqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" == ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Object Visit(FormalParameterNode node) {
        node.type.Accept(this);
        node.id.Accept(this);
        if (node.fprmt != null)
        {
            Targetcode.add(", ");
            node.fprmt.Accept(this);
        }

        return null;
    }

    @Override
    public Object Visit(ForNode node) {
        Targetcode.add("for ( int i = ");
        node.startNumber.Accept(this);
        Targetcode.add(" ; i <");
        node.endNumber.Accept(this);
        Targetcode.add(" ; i++");

        Targetcode.add(" )\n{ \n");
        node.block.Accept(this);
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Object Visit(GreaterThanNode node) {
        node.left.Accept(this);
        Targetcode.add(" > ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(GreaterThanOrEqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" >= ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Object Visit(IdentifierNode node) {
        Targetcode.add(node.name);

        return null;
    }

    @Override
    public Object Visit(IfNode node) {
        Targetcode.add("if(");
        node.bool.Accept(this);
        Targetcode.add(")\n{\n");
        node.block.Accept(this);
        Targetcode.add("}\n");

        if (node.elseif != null) {
            for (Node a : node.elseif
                    ) {
                a.Accept(this);
            }
        }
        if(node.el != null){
            node.el.Accept(this);
        }
        return null;
    }

    @Override
    public Object Visit(InstanceNode node) {
        Targetcode.add(node.instance.toString() + " ");
        return null;
    }

    @Override
    public Object Visit(LessThanNode node) {
        node.left.Accept(this);
        Targetcode.add("<");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Object Visit(LessThanOrEqualNode node) {
        node.left.Accept(this);
        Targetcode.add("<=");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Object Visit(MethodNode node) {
        node.type.Accept(this);
        node.id.Accept(this);
        Targetcode.add("(");
        if(node.fprmt != null) {
            node.fprmt.Accept(this);
        }
        Targetcode.add(")\n");
        Targetcode.add("{\n");
        node.block.Accept(this);
        node.returnval.Accept(this);
        Targetcode.add(";\n");
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Object Visit(MinusNode node) {
        node.left.Accept(this);
        Targetcode.add(" - ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Object Visit(NotBoolNode node) {
        Targetcode.add(" ! ");
        node.child.Accept(this);

        return null;
    }

    @Override
    public Object Visit(NotEqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" != ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(NumberNode node) {
        Targetcode.add(" ");
        Targetcode.add(Double.toString(node.value));
        return null;
    }

    @Override
    public Object Visit(OrNode node) {
        node.left.Accept(this);
        Targetcode.add(" || ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(ParameterNode node) {
        node.Parameter.Accept(this);

        if (node.prmt != null){
            Targetcode.add(", ");
            node.prmt.Accept(this);
        }
        return null;
    }

    @Override
    public Object Visit(PlusNode node) {
        node.left.Accept(this);
        Targetcode.add(" + ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(ProgramNode node) {
        Targetcode.add("main() \n{\n");
        node.leftMain.Accept(this);
        Targetcode.add("} \n");

        for (Node item : node.methods)
        {
            item.Accept(this);
        }
        return null;
    }

    @Override
    public Object Visit(ReturnValNode node) {
        Targetcode.add("Return ");
        node.returnvalue.Accept(this);
        Targetcode.add("\n");
        return null;
    }

    @Override
    public Object Visit(StatIdNode node) {
        node.instance.Accept(this );

        return null;
    }

    @Override
    public Object Visit(StatListNode node) {

        return null;
    }

    @Override
    public Object Visit(StatMotorNode node) {
        return null;
    }

    @Override
    public Object Visit(StatSensorNode node) {
        return null;
    }

    @Override
    public Object Visit(StmtNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(TermNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(TimesNode node) {
        node.left.Accept(this);
        Targetcode.add(" * ");
        node.right.Accept(this);
        return null;
    }

    @Override
    public Object Visit(TypesNode node) {
        String s = (node.type.toString());
        if(s.contains("number"))
        {
            Targetcode.add("double ");
        }

        return null;
    }

    @Override
    public Object Visit(UnaryMinusNode node) {
        Targetcode.add("- ");
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(ValueNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(WhileNode node) {
        Targetcode.add("While (");
        node.bool.Accept(this);
        Targetcode.add(") \n{ \n");
        node.block.Accept(this);
        Targetcode.add("}\n");
        return null;
    }
}




