package codeGenerator;

import abstractSyntaxTree.nodes.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class CodeGeneratorHelper {
    CodeGeneratorHelper(CodeGenerator codeGenerator) {
        CodeGen = codeGenerator;
    }

    private CodeGenerator CodeGen;
    private List<String> Targetcode = new ArrayList<>();
    private List<String> CodePrototypes = new ArrayList<>();
    private List<String> MotorOrSensordcl = new ArrayList<>();

    private Map<String, String> matchMotorsAndSensors = new HashMap<>();

    void WriteToFile(PrintWriter writer)
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

    void GenerateAndCode(AndNode node){
        node.left.Accept(CodeGen);
        Targetcode.add(" && ");
        node.right.Accept(CodeGen);
    }

    void GenerateAssignCode(AssignNode node){
        Indend();
        Targetcode.add(node.left.Accept(CodeGen).toString());
        Targetcode.add(" = ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }

        Targetcode.add("; \n");
    }

    void GenerateBoolCode(BoolNode node){
        boolean b = node.aBoolean;
        if(b)
        {
            Targetcode.add("true");
        }
        else
        {
            Targetcode.add("false");
        }
    }

    void GenerateCallCode(CallNode node){
        boolean allowSemicolon = false;
        String s = Targetcode.get(Targetcode.size()-1);
        if(s.equals(";\n") || s.equals("{\n") || s.equals("}\n")) {
            allowSemicolon = true;
        }

        if (node.invoke != null){

            if (node.invoke.Accept(CodeGen) != null){
                Indend();
                ChooseInstance(node);
                allowSemicolon = true;
            } else {
                Targetcode.add(matchMotorsAndSensors.get(node.id.Accept(CodeGen).toString()) + ")");
            }

        } else {
            Indend();
            Targetcode.add(node.id.Accept(CodeGen).toString() + "(");
            if (node.parameter != null) {
                node.parameter.Accept(CodeGen);
            }
            Targetcode.add(")");
        }

        if(allowSemicolon) {
            Targetcode.add(";\n");
        }
    }

    void GenerateDclCode(DclNode node){
        Indend();

        Targetcode.add(node.left.Accept(CodeGen).toString() + node.middle.Accept(CodeGen).toString());

        if (node.right != null) {
            Targetcode.add(" = ");
            if (node.right.Accept(CodeGen) != null){
                Targetcode.add(node.right.Accept(CodeGen).toString());
            }
        }

        Targetcode.add(";\n");
    }

    void GenerateDivideCode(DivideNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }
        Targetcode.add(" / ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateElseIfCode(ElseIfNode node){
        Indend();
        Targetcode.add("else if(");
        node.bool.Accept(CodeGen);
        Targetcode.add(")\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(CodeGen);
        Indend();
        Targetcode.add("}\n");
    }

    void GenerateElseCode(ElseNode node){
        Indend();
        Targetcode.add("else\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(CodeGen);
        Indend();
        Targetcode.add("} \n");
    }

    void GenerateEqualsCode(EqualNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" == ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateFormalPrmtCode(FormalParameterNode node){
        Targetcode.add(node.type.Accept(CodeGen).toString() + node.id.Accept(CodeGen).toString());
        CodePrototypes.add(node.type.Accept(CodeGen).toString() + node.id.Accept(CodeGen).toString());

        if (node.fprmt != null)
        {
            CodePrototypes.add(", ");
            Targetcode.add(", ");
            node.fprmt.Accept(CodeGen);
        }
    }

    void GenerateForloopCode(ForNode node){
        Indend();
        Targetcode.add("for ( int i = ");
        node.startNumber.Accept(CodeGen);
        Targetcode.add(" ; i <");
        node.endNumber.Accept(CodeGen);
        Targetcode.add(" ; i++");
        Targetcode.add(" )\n");
        Indend();
        Targetcode.add("{ \n");
        node.block.Accept(CodeGen);
        Indend();
        Targetcode.add("}\n");
    }

    void GenerateGreaterThanCode(GreaterThanNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" > ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateGreaterThanOrEqualCode(GreaterThanOrEqualNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" >= ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateIfCode(IfNode node){
        Indend();
        Targetcode.add("if(");
        if (node.bool.Accept(CodeGen) != null){
            Targetcode.add(node.bool.Accept(CodeGen).toString());
        }

        Targetcode.add( ")\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(CodeGen);
        Indend();
        Targetcode.add("}\n");

        if (node.elseif != null) {
            for (Node a : node.elseif
                    ) {
                a.Accept(CodeGen);
            }
        }
        if(node.el != null){
            node.el.Accept(CodeGen);
        }

    }

    void GenerateLessThanCode(LessThanNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" < ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateLessThanOrEqualCode(LessThanOrEqualNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" <= ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateMethodCode(MethodNode node){
        Targetcode.add("\n");

        Targetcode.add(node.type.Accept(CodeGen).toString() + node.id.Accept(CodeGen).toString() + "(");
        CodePrototypes.add(node.type.Accept(CodeGen).toString() + node.id.Accept(CodeGen).toString() + "(");

        if(node.fprmt != null) {
            node.fprmt.Accept(CodeGen);
        }

        CodePrototypes.add("); \n");

        Targetcode.add(")\n" + "{\n");
        node.block.Accept(CodeGen);
        CodeGenerator.tab++;
        if (node.returnval != null){
            node.returnval.Accept(CodeGen);
        }

        Targetcode.add(";\n");
        CodeGenerator.tab--;
        Targetcode.add("}\n");
    }

    void GenerateMinusCode(MinusNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }
        Targetcode.add(" - ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateMotorDclCode(MotorNode node){
        MotorOrSensordcl.add("#pragma config(Motor, motor");
        switch (node.symbol){
            case "A":
                MotorOrSensordcl.add("A, ");
                matchMotorsAndSensors.put(node.id.Accept(CodeGen).toString(), "motorA");
                break;
            case "B":
                MotorOrSensordcl.add("B, ");
                matchMotorsAndSensors.put(node.id.Accept(CodeGen).toString(), "motorB");
                break;
            case "C":
                MotorOrSensordcl.add("C, ");
                matchMotorsAndSensors.put(node.id.Accept(CodeGen).toString(), "motorC");
                break;
            case "D":
                MotorOrSensordcl.add("D, ");
                matchMotorsAndSensors.put(node.id.Accept(CodeGen).toString(), "motorD");
                break;
        }
        MotorOrSensordcl.add(node.id.Accept(CodeGen).toString() + ", tmotorEV3_Large)\n");
    }

    void GenerateNotBoolCode(NotBoolNode node){
        Targetcode.add("! ");
        if (node.child.Accept(CodeGen) != null){
            Targetcode.add(node.child.Accept(CodeGen).toString());
        }
    }

    void GenerateNotEqualCode(NotEqualNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" != ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateNumberCode(NumberNode node){
        Targetcode.add(Double.toString(node.value));
    }

    void GenerateOrCode(OrNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }

        Targetcode.add(" || ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateParameterCode(ParameterNode node){
        if (node.Parameter.Accept(CodeGen) != null){
            Targetcode.add(node.Parameter.Accept(CodeGen).toString());
        }

        if (node.prmt != null){
            Targetcode.add(", ");
            node.prmt.Accept(CodeGen);
        }
    }

    void GeneratePlusCode(PlusNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }
        Targetcode.add(" + ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateProgramMainCode(ProgramNode node){
        for (Node motorSensor: node.designSpecificInvokes
                ) {
            motorSensor.Accept(CodeGen);
        }
        Targetcode.add("task main() \n{\n");
        node.mainBlock.Accept(CodeGen);
        Targetcode.add("} \n");

        for (Node item : node.methods)
        {
            item.Accept(CodeGen);
        }
    }

    void GenerateReturnValCode(ReturnValNode node){
        Targetcode.add("\n");
        Indend();
        Targetcode.add("return ");
        if (node.returnvalue.Accept(CodeGen) != null){
            Targetcode.add(node.returnvalue.Accept(CodeGen).toString());
        }
    }

    void GenerateSensorInvokeCode(SensorInvokeNode node){
        switch (node.method){
            case "isPressed":
                Targetcode.add("getTouchValue(");
                break;
            case "distance":
                Targetcode.add("getUSDistance(");
                break;
        }
    }

    void GenerateSleepCode(SleepNode node){
        Indend();
        Targetcode.add("sleep(");
        node.child.Accept(CodeGen);
        Targetcode.add(");\n");
    }

    void GenerateTimesCode(TimesNode node){
        if (node.left.Accept(CodeGen) != null){
            Targetcode.add(node.left.Accept(CodeGen).toString());
        }
        Targetcode.add(" * ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
    }

    void GenerateTouchSensorCode(TouchSensorNode node){
        MotorOrSensordcl.add("#pragma config(Sensor, S" + node.symbol + ", " + node.id.Accept(CodeGen).toString() + ", sensorEV3_Touch)\n");

        matchMotorsAndSensors.put(node.id.Accept(CodeGen).toString(), "S" + node.symbol);
    }

    String GenerateTypesCode(TypesNode node){
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

    void GenerateUltraSoundCode(UltraSoundSensorNode node){
        MotorOrSensordcl.add("#pragma config(Sensor, S" + node.symbol + ", " + node.id.Accept(CodeGen).toString() + ", sensorEV3_Ultrasonic)\n");

        matchMotorsAndSensors.put(node.id.Accept(CodeGen).toString(), "S" + node.symbol);
    }

    void GenerateUnaryCode(UnaryMinusNode node){
        Targetcode.add("- ");
        if (node.child.Accept(CodeGen) != null){
            Targetcode.add(node.child.Accept(CodeGen).toString());
        }
    }

    void GenerateValueCode(ValueNode node){
        if (node.paren){
            Targetcode.add("(");
        }
        if (node.child.Accept(CodeGen) != null) {
            Targetcode.add(node.child.Accept(CodeGen).toString());
        }
        if (node.paren){
            Targetcode.add(")");
        }
    }

    void GenerateWhileCode(WhileNode node){
        Indend();
        Targetcode.add("while (");

        if (node.bool.Accept(CodeGen) != null){
            Targetcode.add(node.bool.Accept(CodeGen).toString());
        }

        Targetcode.add(")\n");
        Indend();
        Targetcode.add("{\n");
        node.block.Accept(CodeGen);
        Indend();
        Targetcode.add("}\n");
    }

    private void ChooseInstance(CallNode node){
        switch (node.invoke.Accept(CodeGen).toString()) {
            case "F":
                Forward((IdentifierNode) node.id, false, false);
                break;
            case "FS":
                Forward((IdentifierNode) node.id, true, false);
                SleepInInvokes();
                StopInvoke((IdentifierNode) node.id);
                break;
            case "B":
                Forward((IdentifierNode) node.id, false, true);
                break;
            case "BS":
                Forward((IdentifierNode) node.id, false, true);
                SleepInInvokes();
                StopInvoke((IdentifierNode) node.id);

                break;
            case "S":
                StopInvoke((IdentifierNode) node.id);
                Targetcode.add(";\n");
                break;
        }
    }

    private void Forward(IdentifierNode node, Boolean isTimed, Boolean isBackwards){
        Targetcode.add("motor[" + matchMotorsAndSensors.get(node.Accept(CodeGen).toString()) + "] = ");
        if (isBackwards){
            Targetcode.add("- (");
        }
        CodeGenerator.speed.Accept(CodeGen);
        if (isBackwards){
            Targetcode.add(")");
        }
        if (CheckForSync(node)){
            Targetcode.add(";\n");
            Indend();
            Targetcode.add("motor[" + matchMotorsAndSensors.get(FindSyncedMotor(node).motor2.name) + "] = ");
            if (isBackwards){
                Targetcode.add("- (");
            }
            if (FindSyncedMotor(node).value != null){
                Targetcode.add(Double.toString((FindSyncedMotor(node).value / 100)) + " * (");
                CodeGenerator.speed.Accept(CodeGen);
                Targetcode.add(")");
            } else {
                CodeGenerator.speed.Accept(CodeGen);
            }
            if (isBackwards){
                Targetcode.add(")");
            }
            if (isTimed){
                Targetcode.add(";\n ");
            }
        }
    }

    private void StopInvoke(IdentifierNode node){
        Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(node.Accept(CodeGen).toString()) + ")");
        if (CheckForSync(node)){
            Targetcode.add(";\n");
            Indend();
            Targetcode.add("stopMotor(" + matchMotorsAndSensors.get(FindSyncedMotor(node).motor2.name) + ")");
        }
    }

    private Boolean CheckForSync(IdentifierNode node){
        for (SyncMotor sync: CodeGenerator.syncMotors
                ) {
            if (node.name.equals(sync.motor1.name)){
                return true;
            }
        }
        return false;
    }

    private SyncMotor FindSyncedMotor(IdentifierNode node){
        for (SyncMotor sync: CodeGenerator.syncMotors
                ) {
            if (node.name.equals(sync.motor1.name)){
                return sync;
            }
        }
        return null;
    }

    private void SleepInInvokes(){
        Indend();
        Targetcode.add("sleep(");
        CodeGenerator.time.Accept(CodeGen);
        Targetcode.add(" * 1000)");
        Targetcode.add(";\n");
        Indend();
    }

    private void Indend(){
        for (int i = 0; i < CodeGenerator.tab; ++i){
            Targetcode.add("\t");
        }
    }
}
