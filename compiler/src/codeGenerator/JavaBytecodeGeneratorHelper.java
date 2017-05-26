package codeGenerator;

import abstractSyntaxTree.nodes.*;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JavaBytecodeGeneratorHelper  {
    JavaBytecodeGeneratorHelper(JavaBytecodeGenerator javaBytecodeGenerator){ CodeGen = javaBytecodeGenerator; }
    private JavaBytecodeGenerator CodeGen;
    private List<String> Targetcode = new ArrayList<>();

    private int StoreNumber = 1;

    void WriteToFile(PrintWriter writer) {
        for (String content : Targetcode) {
            writer.print(content);
        }
    }

    void GenerateAssignCode(AssignNode node){

        Targetcode.add(Push() + " ");

        if (node.right.Accept(CodeGen) != null){
            Targetcode.add(node.right.Accept(CodeGen).toString());
        }
        Targetcode.add("\n");
        Targetcode.add(Store());
        Targetcode.add("\n");
        StoreNumber = StoreNumber + 2;
    }

    void GenerateDclCode(DclNode node){

        if (node.right != null) {
            Targetcode.add(Push());
            if (node.right.Accept(CodeGen) != null){
                Targetcode.add(node.right.Accept(CodeGen).toString());
                Targetcode.add("\n");
                Targetcode.add(Store());
                StoreNumber = StoreNumber + 2;
            }
        } else{
            StoreNumber = StoreNumber + 2;
        }
        Targetcode.add("\n");
    }

    void GenerateIfCode(IfNode node){
        Targetcode.add("if(");
        if (node.bool.Accept(CodeGen) != null){
            Targetcode.add(node.bool.Accept(CodeGen).toString());
        }

        Targetcode.add( ")\n");
        Targetcode.add("{\n");
        node.block.Accept(CodeGen);
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

    void GenerateNumberCode(NumberNode node){
        Targetcode.add(Double.toString(node.value));
    }

    void GenerateProgramMainCode(ProgramNode node){
        node.mainBlock.Accept(CodeGen);

    }

    void GenerateValueCode(ValueNode node){
        if (node.child.Accept(CodeGen) != null) {
            Targetcode.add(node.child.Accept(CodeGen).toString());
        }
    }

    private String Push(){
        return "ldc2_w ";
    }

    private String Store(){
        return "dstore_" + StoreNumber;
    }

    private String Load(){
        return "dstore_" + 1;
    }
}

