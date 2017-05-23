package codeGenerator;

import abstractSyntaxTree.nodes.CallNode;
import abstractSyntaxTree.nodes.IdentifierNode;

final class CodeGeneratorHelper {
    CodeGeneratorHelper(CodeGenerator codeGenerator) {
        CodeGen = codeGenerator;
    }

    private CodeGenerator CodeGen;

    void ChooseInstance(CallNode node){
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
                CodeGenerator.Targetcode.add(";\n");
                break;
        }
    }

    private void Forward(IdentifierNode node, Boolean isTimed, Boolean isBackwards){
        CodeGenerator.Targetcode.add("motor[" + CodeGenerator.matchMotorsAndSensors.get(node.Accept(CodeGen).toString()) + "] = ");
        if (isBackwards){
            CodeGenerator.Targetcode.add("- (");
        }
        CodeGenerator.speed.Accept(CodeGen);
        if (isBackwards){
            CodeGenerator.Targetcode.add(")");
        }
        if (CheckForSync(node)){
            CodeGenerator.Targetcode.add(";\n");
            Indend();
            CodeGenerator.Targetcode.add("motor[" + CodeGenerator.matchMotorsAndSensors.get(FindSyncedMotor(node).motor2.name) + "] = ");
            if (isBackwards){
                CodeGenerator.Targetcode.add("- (");
            }
            if (FindSyncedMotor(node).value != null){
                CodeGenerator.Targetcode.add(Double.toString((FindSyncedMotor(node).value / 100)) + " * (");
                CodeGenerator.speed.Accept(CodeGen);
                CodeGenerator.Targetcode.add(")");
            } else {
                CodeGenerator.speed.Accept(CodeGen);
            }
            if (isBackwards){
                CodeGenerator.Targetcode.add(")");
            }
            if (isTimed){
                CodeGenerator.Targetcode.add(";\n ");
            }
        }
    }

    private void StopInvoke(IdentifierNode node){
        CodeGenerator.Targetcode.add("stopMotor(" + CodeGenerator.matchMotorsAndSensors.get(node.Accept(CodeGen).toString()) + ")");
        if (CheckForSync(node)){
            CodeGenerator.Targetcode.add(";\n");
            Indend();
            CodeGenerator.Targetcode.add("stopMotor(" + CodeGenerator.matchMotorsAndSensors.get(FindSyncedMotor(node).motor2.name) + ")");
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
        CodeGenerator.Targetcode.add("sleep(");
        CodeGenerator.time.Accept(CodeGen);
        CodeGenerator.Targetcode.add(" * 1000)");
        CodeGenerator.Targetcode.add(";\n");
        Indend();
    }

    void Indend(){
        for (int i = 0; i < CodeGenerator.tab; ++i){
            CodeGenerator.Targetcode.add("\t");
        }
    }
}
