package codeGenerator;

import abstractSyntaxTree.nodes.*;
import com.sun.org.apache.bcel.internal.classfile.Code;
import symbolTable.SymbolTable;

import java.io.PrintWriter;
import java.util.*;

public class JavaBytecodeGeneratorHelper  {
    JavaBytecodeGeneratorHelper(JavaBytecodeGenerator javaBytecodeGenerator){ CodeGen = javaBytecodeGenerator; }
    private JavaBytecodeGenerator CodeGen;
    private List<String> Targetcode = new ArrayList<>();
    private Map<String, String> StoreValue = new HashMap<>();
    static SymbolTable symbolTable;
    private Stack<Integer> indexQueue = new Stack<>();
    private int StoreNumber = 1;
    private int LineNumber = 1;

    void WriteToFile(PrintWriter writer) {
        for (String content : Targetcode) {
            writer.print(content);
        }
    }

    void GenerateAssignCode(AssignNode node){
        String type = node.right.Accept(CodeGen).toString();
        if (type.equals("bool")){
            Targetcode.add(Targetcode.size() - 2,"iconst_");
            GenerateNewline();
            Targetcode.add(IStore(node.left.Accept(CodeGen).toString()));
        } else if (type.equals("number")){
            GenerateNewline();
            Targetcode.add(Targetcode.size() - 2,"ldc2_w ");
            Targetcode.add(DStore(node.left.Accept(CodeGen).toString()));
        } else {
            String id = type;
            type = SymbolTable.GetTypeByID(type, symbolTable);

            if (type.equals("number")) {
                Targetcode.add(DLoad(id));
                GenerateNewline();
                Targetcode.add(DStore(node.left.Accept(CodeGen).toString()));
            } else {
                Targetcode.add(ILoad(id));
                GenerateNewline();
                Targetcode.add(IStore(node.left.Accept(CodeGen).toString()));
            }

        }
        GenerateNewline();
    }

    void GenerateDclCode(DclNode node) {
        if (node.left.Accept(CodeGen).toString().equals("number")) {
            if (node.right != null) {
                if (!(node.right.Accept(CodeGen).toString().equals("number") || node.right.Accept(CodeGen).toString().equals("bool"))) {
                    Targetcode.remove(Targetcode.size() - 1);
                    Targetcode.add(DLoad(node.right.Accept(CodeGen).toString()));
                }
                StoreValue.put(node.middle.Accept(CodeGen).toString(), Integer.toString(StoreNumber));
                GenerateNewline();
                Targetcode.add(DStore(node.middle.Accept(CodeGen).toString()));
                GenerateNewline();

            } else {
                Targetcode.remove(Targetcode.size() - 1);
                StoreValue.put(node.middle.Accept(CodeGen).toString(), Integer.toString(StoreNumber));
            }

        } else {
            if (node.right != null){
                if (!(node.right.Accept(CodeGen).toString().equals("number") || node.right.Accept(CodeGen).toString().equals("bool"))) {
                    Targetcode.remove(Targetcode.size() - 1);
                    Targetcode.add(ILoad(node.right.Accept(CodeGen).toString()));
                }

                Targetcode.remove(Targetcode.size() - 1);
                StoreValue.put(node.middle.Accept(CodeGen).toString(), Integer.toString(StoreNumber));
                GenerateNewline();
                Targetcode.add(IStore(node.middle.Accept(CodeGen).toString()));
                GenerateNewline();

            } else {
                Targetcode.remove(Targetcode.size() - 1);
                StoreValue.put(node.middle.Accept(CodeGen).toString(), Integer.toString(StoreNumber));
            }
            StoreNumber--;
        }

        StoreNumber += 2;
    }

    void GenerateIfCode(IfNode node){
        String type = node.bool.Accept(CodeGen).toString();
        int tempInt;
        if (type.equals("bool")){
            Targetcode.add(Targetcode.size() - 2,"iconst_");
        } else if (!type.equals("number")) {
            Targetcode.add(ILoad(type));
        }
        GenerateNewline();
        Targetcode.add("ifeq");
        indexQueue.push(Targetcode.size());
        GenerateNewline();
        tempInt = StoreNumber;
        node.block.Accept(CodeGen);

        Targetcode.add(indexQueue.pop()," " + Integer.toString(LineNumber));

        StoreNumber = tempInt;
    }

    void GenerateTypesCode(TypesNode node){
        switch (node.type){
            case "number":
                Targetcode.add("ldc2_w ");
                break;
            case "bool":
                Targetcode.add("iconst_");
        }
    }

    void GenerateBoolCode(BoolNode node){
        if (node.aBoolean){
            Targetcode.add("1");
        } else {
            Targetcode.add("0");
        }
    }

    void GenerateNumberCode(NumberNode node){
        Targetcode.add(Double.toString(node.value));
    }

    private void GenerateNewline(){
        Targetcode.add("\n");
        LineNumber++;
    }

    private String DStore(String id){
        return "dstore_" + StoreValue.get(id);
    }

    private String DLoad(String id){
        return "dload_" + StoreValue.get(id);
    }

    private String IStore(String id){
        return "istore_" + StoreValue.get(id);
    }

    private String ILoad(String id){
        return "iload_" + StoreValue.get(id);
    }

    void GenerateMethodCode(MethodNode node)
    {
        if(node.id.toString() != null && node.type != null)
            StoreValue.put(node.id.toString(),Integer.toString(StoreNumber));
            if (node.fprmt != null)
            {
                String TMP = "public " + ((TypesNode)(node.type)).type + " " + ((IdentifierNode)(node.id)).name + "(";
				TMP = TMP.concat(AddParameters((FormalParameterNode)(node.fprmt)) + ");");
				Targetcode.add(TMP);
				GenerateNewline();
				Targetcode.add("Code:");
				GenerateNewline();
                node.block.Accept(CodeGen);
                Targetcode.add(CorrectMethodReturn(node));
                GenerateNewline();
            }
            else
            {
                Targetcode.add("public " + ((TypesNode)(node.type)).type + " " + ((IdentifierNode)(node.id)).name + "();");
                GenerateNewline();
                Targetcode.add("Code:");
                GenerateNewline();
                node.block.Accept(CodeGen);
				Targetcode.add(CorrectMethodReturn(node));
                GenerateNewline();
            }
      //      StoreNumber += //TODO;

    }

    void GenerateCallCode(CallNode node)
    {
        Targetcode.add("InvokeStatic #"  + StoreValue.get(node.id));
    }

    String AddParameters (FormalParameterNode node)
    {
    	Class<?> classString = ((TypesNode)node.type).type.getClass();
    	String[] realstring = classString.toString().split(" ");
		if(node.fprmt != null)
        	return realstring[1] + node.fprmt.Accept(CodeGen);
		else return
				realstring[1];
    }

    String CorrectMethodReturn(MethodNode node)
	{
		if (node.returnval == null)
			return "return";
		else
		{
			return "dreturn";
		}
	}
}


