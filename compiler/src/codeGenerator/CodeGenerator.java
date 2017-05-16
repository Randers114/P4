package codeGenerator;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class CodeGenerator extends Visitor {
    private List<String> Targetcode = new ArrayList<>();
    private List<String> CodeParameters = new ArrayList<>();
    private int tab = 0;
    private boolean isParameter = false;

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

    private void WriteToFile(PrintWriter writer)
    {
        writer.println("#include <stdio.h> \n");

        for (String parameter: CodeParameters)
        {
            writer.print(parameter);
        }

        writer.println();

        for (String content: Targetcode)
        {
            writer.print(content);
        }

    }


    @Override
    public Void Visit(AndNode node) {
        node.left.Accept(this);
        Targetcode.add(" && ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(AssignNode node) {
        Indend();
        node.left.Accept(this);
        Targetcode.add(" = ");
        node.right.Accept(this);

        Targetcode.add("; \n");

        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        tab++;
        for (Node a : node.ChildrenList)
        {
            a.Accept(this);
        }
        tab--;

        return null;
    }

    @Override
    public Void Visit(BodyNode node) {
        node.content.Accept(this);

        return null;
    }

    @Override
    public Void Visit(BoolNode node) {
        boolean b = node.aBoolean;
        if(b)
        {
            Targetcode.add("true");
        }
        else
        {
            Targetcode.add("false");
        }

        return null;
    }

    @Override
    public Void Visit(CallNode node) {
        Boolean allowSemicolon = false;
        String s = Targetcode.get(Targetcode.size()-1);
        if(s == ";" || s == "{" || s == "}")
        {
            allowSemicolon = true;
        }
        node.id.Accept(this);
        Targetcode.add("(");
        if (node.parameter != null) {
            node.parameter.Accept(this);
        }
        Targetcode.add(")");
        if(allowSemicolon == true) {
            Targetcode.add(";");
        }

        return null;
    }

    @Override
    public Void Visit(DclNode node) {
        Indend();
        node.left.Accept(this);
        node.middle.Accept(this);
        if(node.right != null)
        {
            Targetcode.add(" = ");
            node.right.Accept(this);
        }

        Targetcode.add("; \n");

        return null;
    }

    @Override
    public Void Visit(DivideNode node) {
        node.left.Accept(this);
        Targetcode.add("/");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(ElseIfNode node) {
        Indend();
        Targetcode.add("else if(");
        node.bool.Accept(this);
        Targetcode.add(")\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(this);
        Indend();
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Void Visit(ElseNode node) {
        Indend();
        Targetcode.add("else\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(this);
        Indend();
        Targetcode.add("} \n");

        return null;
    }

    @Override
    public Void Visit(EqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" == ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(FormalParameterNode node) {
        node.type.Accept(this);
        node.id.Accept(this);
        if (node.fprmt != null)
        {
            CodeParameters.add(", ");
            Targetcode.add(", ");
            node.fprmt.Accept(this);
        }

        return null;
    }

    @Override
    public Void Visit(ForNode node) {
        Indend();
        Targetcode.add("for ( int i = ");
        node.startNumber.Accept(this);
        Targetcode.add(" ; i <");
        node.endNumber.Accept(this);
        Targetcode.add(" ; i++");
        Targetcode.add(" )\n");
        Indend();
        Targetcode.add("{ \n");
        node.block.Accept(this);
        Indend();
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Void Visit(GreaterThanNode node) {
        node.left.Accept(this);
        Targetcode.add(" > ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(GreaterThanOrEqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" >= ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(IdentifierNode node) {
        Targetcode.add(node.name);
        if(isParameter)
        {
            CodeParameters.add(node.name);
        }

        return null;
    }

    @Override
    public Void Visit(IfNode node) {
        Indend();
        Targetcode.add("if(");
        node.bool.Accept(this);
        Targetcode.add(")\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(this);
        Indend();
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
    public Void Visit(InstanceNode node) {
        Targetcode.add(node.instance + " ");
        return null;
    }

    @Override
    public Void Visit(LessThanNode node) {
        node.left.Accept(this);
        Targetcode.add(" < ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(LessThanOrEqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" <= ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(MethodNode node) {
        Targetcode.add("\n");
        isParameter = true;
        node.type.Accept(this);
        node.id.Accept(this);
        Targetcode.add("(");
        CodeParameters.add("(");
        if(node.fprmt != null) {
            node.fprmt.Accept(this);
        }
        isParameter = false;
        CodeParameters.add("); \n");
        Targetcode.add(")\n");
        Targetcode.add("{\n");
        node.block.Accept(this);
        tab++;
        node.returnval.Accept(this);
        Targetcode.add(";\n");
        tab--;
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Void Visit(MinusNode node) {
        node.left.Accept(this);
        Targetcode.add(" - ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(NotBoolNode node) {
        Targetcode.add(" ! ");
        node.child.Accept(this);

        return null;
    }

    @Override
    public Void Visit(NotEqualNode node) {
        node.left.Accept(this);
        Targetcode.add(" != ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(NumberNode node) {
        Targetcode.add(Double.toString(node.value));

        return null;
    }

    @Override
    public Void Visit(OrNode node) {
        node.left.Accept(this);
        Targetcode.add(" || ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(ParameterNode node) {
        node.Parameter.Accept(this);

        if (node.prmt != null){
            Targetcode.add(", ");
            node.prmt.Accept(this);
        }

        return null;
    }

    @Override
    public Void Visit(PlusNode node) {
        node.left.Accept(this);
        Targetcode.add(" + ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(ProgramNode node) {
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
    public Void Visit(ReturnValNode node) {
        Targetcode.add("\n");
        Indend();
        Targetcode.add("return ");
        node.returnvalue.Accept(this);

        return null;
    }

    @Override
    public Void Visit(StatIdNode node) {
        node.instance.Accept(this );

        return null;
    }

    @Override
    public Void Visit(StatListNode node) {

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
        Targetcode.add(" * ");
        node.right.Accept(this);

        return null;
    }

    @Override
    public Void Visit(TypesNode node) {
        String s = (node.type);
        if(s.contains("number"))
        {
            Targetcode.add("double ");
        }
        else
        {
            Targetcode.add("bool ");
        }

        if(isParameter)
        {
            if(s.contains("number"))
            {
                CodeParameters.add("double ");
            }
            else
            {
                CodeParameters.add("bool ");
            }
        }

        return null;
    }

    @Override
    public Void Visit(UnaryMinusNode node) {
        Targetcode.add("- ");
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
        Indend();
        Targetcode.add("While (");
        node.bool.Accept(this);
        Targetcode.add(")\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(this);
        Indend();
        Targetcode.add("}\n");

        return null;
    }


    private void Indend(){
        for (int i = 0; i < tab; ++i){
            Targetcode.add("\t");
        }
    }
}




