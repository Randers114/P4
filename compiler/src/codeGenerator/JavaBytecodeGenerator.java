package codeGenerator;

import visitor.Visitor;
import abstractSyntaxTree.nodes.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class JavaBytecodeGenerator implements Visitor {
    private JavaBytecodeGeneratorHelper javaBytecodeGenerator = new JavaBytecodeGeneratorHelper(this);

    public void openfile() {
        File file = new File("JavaByte.txt");

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.flush();
            javaBytecodeGenerator.WriteToFile(writer);

            writer.close();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
    }

    @Override
    public Object Visit(SynchronizationNode node) {
        return null;
    }

    @Override
    public Object Visit(SleepNode node) {
        return null;
    }

    @Override
    public Object Visit(AndNode node) {
        return null;
    }

    @Override
    public Void Visit(AssignNode node) {
        javaBytecodeGenerator.GenerateAssignCode(node);
        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        JavaBytecodeGeneratorHelper.symbolTable = node.symbolTable;
        for (Node a : node.ChildrenList)
        {
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
    public String Visit(BoolNode node) {
        javaBytecodeGenerator.GenerateBoolCode(node);
        return "bool";
    }

    @Override
    public Object Visit(CallNode node) {
        return null;
    }

    @Override
    public Void Visit(DclNode node) {
        javaBytecodeGenerator.GenerateDclCode(node);
        return null;
    }

    @Override
    public Object Visit(DesignSpecificDclNode node) {
        return null;
    }

    @Override
    public Object Visit(DesynchronizeNode node) {
        return null;
    }

    @Override
    public Object Visit(DivideNode node) {
        return null;
    }

    @Override
    public Object Visit(ElseIfNode node) {
        return null;
    }

    @Override
    public Object Visit(ElseNode node) {
        return null;
    }

    @Override
    public Object Visit(EqualNode node) {
        return null;
    }

    @Override
    public Object Visit(FormalParameterNode node) {
        return null;
    }

    @Override
    public Object Visit(ForNode node) {
        return null;
    }

    @Override
    public Object Visit(GreaterThanNode node) {
        return null;
    }

    @Override
    public Object Visit(GreaterThanOrEqualNode node) {
        return null;
    }

    @Override
    public String Visit(IdentifierNode node) {
        return node.name;
    }

    @Override
    public Void Visit(IfNode node) {
        javaBytecodeGenerator.GenerateIfCode(node);
        return null;
    }

    @Override
    public Object Visit(InvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(LessThanNode node) {
        return null;
    }

    @Override
    public Object Visit(LessThanOrEqualNode node) {
        return null;
    }

    @Override
    public Object Visit(MethodNode node) {
        return null;
    }

    @Override
    public Object Visit(MotorNode node) {
        return null;
    }

    @Override
    public Object Visit(MinusNode node) {
        return null;
    }

    @Override
    public Object Visit(MotorInvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(NotBoolNode node) {
        return null;
    }

    @Override
    public Object Visit(NotEqualNode node) {
        return null;
    }

    @Override
    public String Visit(NumberNode node) {
        javaBytecodeGenerator.GenerateNumberCode(node);
        return "number";
    }

    @Override
    public Object Visit(OrNode node) {
        return null;
    }

    @Override
    public Object Visit(ParameterNode node) {
        return null;
    }

    @Override
    public Object Visit(PlusNode node) {
        return null;
    }

    @Override
    public Void Visit(ProgramNode node) {
        node.mainBlock.Accept(this);
        return null;
    }

    @Override
    public Object Visit(ReturnValNode node) {
        return null;
    }

    @Override
    public Object Visit(SensorInvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(StmtNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(TermNode node) {
        return node.child.Accept(this);
    }

    @Override
    public Object Visit(TimesNode node) {
        return null;
    }

    @Override
    public Object Visit(TouchSensorNode node) {
        return null;
    }

    @Override
    public String Visit(TypesNode node) {
        javaBytecodeGenerator.GenerateTypesCode(node);
        return node.type;
    }

    @Override
    public Object Visit(UltraSoundSensorNode node) {
        return null;
    }

    @Override
    public Object Visit(UnaryMinusNode node) {
        return null;
    }

    @Override
    public Object Visit(ValueNode node) {
        return node.child.Accept(this);
    }

    @Override
    public Object Visit(WhileNode node) {
        return null;
    }
}
