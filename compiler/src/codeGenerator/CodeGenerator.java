package codeGenerator;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class CodeGenerator extends Visitor {
    private List<String> Targetcode = new ArrayList<>();
    private List<String> CodePrototypes = new ArrayList<>();
    private List<SyncMotor> syncMotors = new ArrayList<>();
    private List<String> MotorOrSensordcl = new ArrayList<>();
    private int tab = 0;
    private Map<String, String> matchMotorsAndSensors = new HashMap<>();
    private Node speed;
    private Node time;


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
            WriteToFile(writer);

            writer.close();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
    }

    private void WriteToFile(PrintWriter writer)
    {
        for (String motorOrSensor: MotorOrSensordcl)
        {
            writer.print(motorOrSensor);
        }
        writer.print("\n");
        for (String prototype: CodePrototypes)
        {
            writer.print(prototype);
        }

        writer.println();

        for (String content: Targetcode)
        {
            writer.print(content);
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
        MotorOrSensordcl.add("#pragma config(Motor, motor");
        switch (node.symbol){
            case "A":
                MotorOrSensordcl.add("A, ");
                matchMotorsAndSensors.put(node.id.Accept(this).toString(), "motorA");
                break;
            case "B":
                MotorOrSensordcl.add("B, ");
                matchMotorsAndSensors.put(node.id.Accept(this).toString(), "motorB");
                break;
            case "C":
                MotorOrSensordcl.add("C, ");
                matchMotorsAndSensors.put(node.id.Accept(this).toString(), "motorC");
                break;
            case "D":
                MotorOrSensordcl.add("D, ");
                matchMotorsAndSensors.put(node.id.Accept(this).toString(), "motorD");
                break;
        }
        MotorOrSensordcl.add(node.id.Accept(this).toString() + ", tmotorEV3_Large)\n");
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
        switch (node.method){
            case "isPressed":
                Targetcode.add("getTouchValue(");
                break;
            case "distance":
                Targetcode.add("getUSDistance(");
                break;
        }

        return null;
    }

    @Override
    public Object Visit(TouchSensorNode node) {
        MotorOrSensordcl.add("#pragma config(Sensor, S" + node.symbol + ", " + node.id.Accept(this).toString() + ", sensorEV3_Touch)\n");

        matchMotorsAndSensors.put(node.id.Accept(this).toString(), "S" + node.symbol);
        return null;
    }

    @Override
    public Object Visit(UltraSoundSensorNode node) {
        MotorOrSensordcl.add("#pragma config(Sensor, S" + node.symbol + ", " + node.id.Accept(this).toString() + ", sensorEV3_Ultrasonic)\n");

        matchMotorsAndSensors.put(node.id.Accept(this).toString(), "S" + node.symbol);
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
        Indend();
        Targetcode.add("sleep(");
        node.child.Accept(this);
        Targetcode.add(");\n");
        return null;
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
        Targetcode.add(node.left.Accept(this).toString());
        Targetcode.add(" = ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }


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
        boolean allowSemicolon = false;
        String s = Targetcode.get(Targetcode.size()-1);
        if(s.equals(";\n") || s.equals("{\n") || s.equals("}\n")) {
            allowSemicolon = true;
        }

        if (node.invoke != null){

            if (node.invoke.Accept(this) != null){
                Indend();
                ChooseInstance(node);
                allowSemicolon = true;
            } else {
                Targetcode.add(matchMotorsAndSensors.get(node.id.Accept(this).toString()) + ")");
            }

        } else {
            Indend();
            Targetcode.add(node.id.Accept(this).toString() + "(");
            if (node.parameter != null) {
                node.parameter.Accept(this);
            }
            Targetcode.add(")");
        }


        if(allowSemicolon) {
            Targetcode.add(";\n");
        }

        return null;
    }

    private void ChooseInstance(CallNode node){

        boolean isSynced = false;
        switch (node.invoke.Accept(this).toString()) {
            case "F":
                Targetcode.add("motor[" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + "] = ");
                speed.Accept(this);
                if (CheckForSync((IdentifierNode) node.id)){
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("motor[" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + "] = ");
                    if (FindSyncedMotor((IdentifierNode) node.id).value != null){
                        Targetcode.add(Double.toString((FindSyncedMotor((IdentifierNode) node.id).value / 100)) + " * (");
                        speed.Accept(this);
                        Targetcode.add(")");
                    } else {
                        speed.Accept(this);
                    }
                }
                break;
            case "FS":
                Targetcode.add("motor[" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + "] = ");
                speed.Accept(this);

                if (CheckForSync((IdentifierNode) node.id)){
                    isSynced = true;
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("motor[" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + "] = ");
                    if (FindSyncedMotor((IdentifierNode) node.id).value != null){
                        Targetcode.add(Double.toString(FindSyncedMotor((IdentifierNode) node.id).value / 100) + " * (");
                        speed.Accept(this);
                        Targetcode.add(")");
                    } else {
                        speed.Accept(this);
                    }
                    Targetcode.add(";\n ");

                }
                Indend();
                Targetcode.add("sleep(");
                time.Accept(this);
                Targetcode.add(" * 1000)");
                Targetcode.add(";\n");
                Indend();
                Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + ")");
                if (isSynced){
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + ")");
                }

                break;
            case "B":
                Targetcode.add("motor[" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + "] = - (");
                speed.Accept(this);
                Targetcode.add(")");
                if (CheckForSync((IdentifierNode) node.id)){
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("motor[" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + "] = - (");
                    if (FindSyncedMotor((IdentifierNode) node.id).value != null){
                        Targetcode.add(Double.toString(FindSyncedMotor((IdentifierNode) node.id).value / 100) + " * (");
                        speed.Accept(this);
                        Targetcode.add(")");
                    } else {
                        speed.Accept(this);
                    }
                    Targetcode.add(")");
                }
                break;
            case "BS":
                Targetcode.add("motor[" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + "] = - (");
                speed.Accept(this);
                Targetcode.add(")");
                if (CheckForSync((IdentifierNode) node.id)){
                    isSynced = true;
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("motor[" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + "] = - (");
                    if (FindSyncedMotor((IdentifierNode) node.id).value != null){
                        Targetcode.add(Double.toString(FindSyncedMotor((IdentifierNode) node.id).value / 100) + " * (");
                        speed.Accept(this);
                        Targetcode.add(")");
                    } else {
                        speed.Accept(this);
                    }
                    Targetcode.add(")");
                    Targetcode.add(";\n ");
                }
                Indend();
                Targetcode.add("sleep(");
                time.Accept(this);
                Targetcode.add(" * 1000)");
                Targetcode.add(";\n");
                Indend();
                Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + ")");
                if (isSynced){
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + ")");
                }
                break;
            case "S":
                Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(node.id.Accept(this).toString()) + ")");
                if (CheckForSync((IdentifierNode) node.id)){
                    Targetcode.add(";\n");
                    Indend();
                    Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(FindSyncedMotor((IdentifierNode) node.id).motor2.name) + ")");
                }
                Targetcode.add(";\n");
                break;
        }
    }

    private Boolean CheckForSync(IdentifierNode node){
        for (SyncMotor sync: syncMotors
             ) {
            if (node.name.equals(sync.motor1.name)){
                return true;
            }
        }
        return false;
    }

    private SyncMotor FindSyncedMotor(IdentifierNode node){
        for (SyncMotor sync: syncMotors
             ) {
            if (node.name.equals(sync.motor1.name)){
                return sync;
            }
        }
        return null;
    }

    @Override
    public Void Visit(DclNode node) {
        Indend();

        Targetcode.add(node.left.Accept(this).toString() + node.middle.Accept(this).toString());

        if (node.right != null) {
            Targetcode.add(" = ");
            if (node.right.Accept(this) != null){
                Targetcode.add(node.right.Accept(this).toString());
            }
        }

        Targetcode.add(";\n");

        return null;
    }

    @Override
    public Void Visit(DivideNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }
        Targetcode.add(" / ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

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
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" == ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(FormalParameterNode node) {

        Targetcode.add(node.type.Accept(this).toString() + node.id.Accept(this).toString());
        CodePrototypes.add(node.type.Accept(this).toString() + node.id.Accept(this).toString());

        if (node.fprmt != null)
        {
            CodePrototypes.add(", ");
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
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" > ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(GreaterThanOrEqualNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" >= ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public String Visit(IdentifierNode node) {
        return node.name;
    }

    @Override
    public Void Visit(IfNode node) {
        Indend();
        Targetcode.add("if(");
        if (node.bool.Accept(this) != null){
            Targetcode.add(node.bool.Accept(this).toString());
        }

        Targetcode.add( ")\n");
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
    public Void Visit(LessThanNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" < ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(LessThanOrEqualNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" <= ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(MethodNode node) {
        Targetcode.add("\n");

        Targetcode.add(node.type.Accept(this).toString() + node.id.Accept(this).toString() + "(");
        CodePrototypes.add(node.type.Accept(this).toString() + node.id.Accept(this).toString() + "(");

        if(node.fprmt != null) {
            node.fprmt.Accept(this);
        }

        CodePrototypes.add("); \n");

        Targetcode.add(")\n" + "{\n");
        node.block.Accept(this);
        tab++;
        if (node.returnval != null){
            node.returnval.Accept(this);
        }

        Targetcode.add(";\n");
        tab--;
        Targetcode.add("}\n");

        return null;
    }

    @Override
    public Void Visit(MinusNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }
        Targetcode.add(" - ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Object Visit(NotBoolNode node) {
        Targetcode.add("! ");
        if (node.child.Accept(this) != null){
            Targetcode.add(node.child.Accept(this).toString());
        }
        return null;
    }

    @Override
    public Void Visit(NotEqualNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" != ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(NumberNode node) {
        Targetcode.add(Double.toString(node.value));

        return null;
    }

    @Override
    public Void Visit(OrNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }

        Targetcode.add(" || ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(ParameterNode node) {

        if (node.Parameter.Accept(this) != null){
            Targetcode.add(node.Parameter.Accept(this).toString());
        }

        if (node.prmt != null){
            Targetcode.add(", ");
            node.prmt.Accept(this);
        }

        return null;
    }

    @Override
    public Void Visit(PlusNode node) {
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }
        Targetcode.add(" + ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public Void Visit(ProgramNode node) {
        for (Node motorSensor: node.designSpecificInvokes
             ) {
            motorSensor.Accept(this);
        }
        Targetcode.add("task main() \n{\n");
        node.mainBlock.Accept(this);
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
        if (node.returnvalue.Accept(this) != null){
            Targetcode.add(node.returnvalue.Accept(this).toString());
        }

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
        if (node.left.Accept(this) != null){
            Targetcode.add(node.left.Accept(this).toString());
        }
        Targetcode.add(" * ");

        if (node.right.Accept(this) != null){
            Targetcode.add(node.right.Accept(this).toString());
        }

        return null;
    }

    @Override
    public String Visit(TypesNode node) {
        if(node.type.contains("number"))
        {
            return "float ";
        }
        else if (node.type.contains("bool"))
        {
            return "bool ";
        } else {
            return "void ";
        }
    }

    @Override
    public Void Visit(UnaryMinusNode node) {
        Targetcode.add("- ");
        if (node.child.Accept(this) != null){
            Targetcode.add(node.child.Accept(this).toString());
        }


        return null;
    }

    @Override
    public Object Visit(ValueNode node) {
        if (node.paren){
            Targetcode.add("(");
        }
        if (node.child.Accept(this) != null) {
            Targetcode.add(node.child.Accept(this).toString());
        }
        //Object returns = node.child.Accept(this);

        if (node.paren){
            Targetcode.add(")");
        }

        return null;
    }

    @Override
    public Void Visit(WhileNode node) {
        Indend();
        Targetcode.add("while (");
        if (node.bool.Accept(this) != null){
            Targetcode.add(node.bool.Accept(this).toString());
        }

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
