package codeGenerator;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class CodeGenerator extends Visitor {
    static List<SyncMotor> syncMotors = new ArrayList<>();
    static int tab = 0;
    static Node speed;
    static Node time;
    private CodeGeneratorHelper codeGeneratorHelper = new CodeGeneratorHelper(this);


    public void openfile() {
        try {

            File file = new File("C:\\Users\\Simon\\Documents\\P4\\compiler\\src\\codeGenerator");
            if (file.createNewFile())
            {
                System.out.println("File is created!");
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\Simon\\Documents\\P4\\compiler\\src\\codeGenerator/newfile.c", "UTF-8");
            writer.flush();
            codeGeneratorHelper.WriteToFile(writer);

            writer.close();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
    }

    @Override
    public Object Visit(DesynchronizeNode node) {
        for (SyncMotor sync: syncMotors
             ) {
            if (((IdentifierNode) node.left).name.equals(sync.motor1.name) && ((IdentifierNode) node.right).name.equals(sync.motor2.name)){
                syncMotors.remove(sync);
                break;
            }
        }
        return null;
    }

    @Override
    public Object Visit(DesignSpecificDclNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(InvokeNode node) {
        return node.child.Accept(this);
    }

    @Override
    public Object Visit(ListInvokeNode node) {
        return null;
    }

    @Override
    public Object Visit(MotorNode node) {
        codeGeneratorHelper.GenerateMotorDclCode(node);
        return null;
    }

    @Override
    public String Visit(MotorInvokeNode node) {
        speed = node.speed;
        switch (node.method){
            case "Forward":
                return "F";
            case "ForwardSeconds":
                time = node.time;
                return "FS";
            case "Backward":
                return "B";
            case "BackwardSeconds":
                time = node.time;
                return "BS";
            case "Stop()":
                return "S";

        }
        return null;
    }

    @Override
    public Object Visit(SensorInvokeNode node) {
        codeGeneratorHelper.GenerateSensorInvokeCode(node);
        return null;
    }

    @Override
    public Object Visit(TouchSensorNode node) {
        codeGeneratorHelper.GenerateTouchSensorCode(node);
        return null;
    }

    @Override
    public Object Visit(UltraSoundSensorNode node) {
        codeGeneratorHelper.GenerateUltraSoundCode(node);
        return null;
    }

    @Override
    public Void Visit(SynchronizationNode node) {
        if (node.relativeSpeed != null){
            syncMotors.add(new SyncMotor((IdentifierNode) node.left, (IdentifierNode) node.right, node.relativeSpeed));
        } else {
            syncMotors.add(new SyncMotor((IdentifierNode) node.left, (IdentifierNode) node.right));
        }
        return null;
    }

    @Override
    public Object Visit(SleepNode node) {
        codeGeneratorHelper.GenerateSleepCode(node);
        return null;
    }

    @Override
    public Void Visit(AndNode node) {
        codeGeneratorHelper.GenerateAndCode(node);
        return null;
    }

    @Override
    public Void Visit(AssignNode node) {
        codeGeneratorHelper.GenerateAssignCode(node);
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
        codeGeneratorHelper.GenerateBoolCode(node);
        return null;
    }

    @Override
    public Void Visit(CallNode node) {
        codeGeneratorHelper.GenerateCallCode(node);
        return null;
    }

    @Override
    public Void Visit(DclNode node) {
        codeGeneratorHelper.GenerateDclCode(node);
        return null;
    }

    @Override
    public Void Visit(DivideNode node) {
        codeGeneratorHelper.GenerateDivideCode(node);
        return null;
    }

    @Override
    public Void Visit(ElseIfNode node) {
        codeGeneratorHelper.GenerateElseIfCode(node);
        return null;
    }

    @Override
    public Void Visit(ElseNode node) {
        codeGeneratorHelper.GenerateElseCode(node);
        return null;
    }

    @Override
    public Void Visit(EqualNode node) {
        codeGeneratorHelper.GenerateEqualsCode(node);
        return null;
    }

    @Override
    public Void Visit(FormalParameterNode node) {
        codeGeneratorHelper.GenerateFormalPrmtCode(node);
        return null;
    }

    @Override
    public Void Visit(ForNode node) {
        codeGeneratorHelper.GenerateForloopCode(node);
        return null;
    }

    @Override
    public Void Visit(GreaterThanNode node) {
        codeGeneratorHelper.GenerateGreaterThanCode(node);
        return null;
    }

    @Override
    public Void Visit(GreaterThanOrEqualNode node) {
        codeGeneratorHelper.GenerateGreaterThanOrEqualCode(node);
        return null;
    }

    @Override
    public String Visit(IdentifierNode node) {
        return node.name;
    }

    @Override
    public Void Visit(IfNode node) {
        codeGeneratorHelper.GenerateIfCode(node);
        return null;
    }

    @Override
    public Void Visit(LessThanNode node) {
        codeGeneratorHelper.GenerateLessThanCode(node);
        return null;
    }

    @Override
    public Void Visit(LessThanOrEqualNode node) {
        codeGeneratorHelper.GenerateLessThanOrEqualCode(node);
        return null;
    }

    @Override
    public Void Visit(MethodNode node) {
        codeGeneratorHelper.GenerateMethodCode(node);
        return null;
    }

    @Override
    public Void Visit(MinusNode node) {
        codeGeneratorHelper.GenerateMinusCode(node);
        return null;
    }

    @Override
    public Object Visit(NotBoolNode node) {
        codeGeneratorHelper.GenerateNotBoolCode(node);
        return null;
    }

    @Override
    public Void Visit(NotEqualNode node) {
        codeGeneratorHelper.GenerateNotEqualCode(node);
        return null;
    }

    @Override
    public Void Visit(NumberNode node) {
        codeGeneratorHelper.GenerateNumberCode(node);
        return null;
    }

    @Override
    public Void Visit(OrNode node) {
        codeGeneratorHelper.GenerateOrCode(node);
        return null;
    }

    @Override
    public Void Visit(ParameterNode node) {
        codeGeneratorHelper.GenerateParameterCode(node);
        return null;
    }

    @Override
    public Void Visit(PlusNode node) {
        codeGeneratorHelper.GeneratePlusCode(node);
        return null;
    }

    @Override
    public Void Visit(ProgramNode node) {
        codeGeneratorHelper.GenerateProgramMainCode(node);
        return null;
    }

    @Override
    public Void Visit(ReturnValNode node) {
        codeGeneratorHelper.GenerateReturnValCode(node);
        return null;
    }

    @Override
    public Void Visit(StmtNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public Object Visit(TermNode node) {
        return node.child.Accept(this);
    }

    @Override
    public Void Visit(TimesNode node) {
        codeGeneratorHelper.GenerateTimesCode(node);
        return null;
    }

    @Override
    public String Visit(TypesNode node) {
        return codeGeneratorHelper.GenerateTypesCode(node);
    }

    @Override
    public Void Visit(UnaryMinusNode node) {
        codeGeneratorHelper.GenerateUnaryCode(node);
        return null;
    }

    @Override
    public Object Visit(ValueNode node) {
        codeGeneratorHelper.GenerateValueCode(node);
        return null;
    }

    @Override
    public Void Visit(WhileNode node) {
        codeGeneratorHelper.GenerateWhileCode(node);
        return null;
    }
}
