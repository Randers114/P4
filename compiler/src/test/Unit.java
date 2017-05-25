package test;

import codeGenerator.CodeGenerator;
import org.junit.*;
import abstractSyntaxTree.nodes.*;
import typeChecker.TypeChecker;
import static junit.framework.Assert.assertEquals;

public class Unit {
    private TypeChecker.typeChecker typeChecker = new TypeChecker.typeChecker();
    private CodeGenerator codeGenerator = new CodeGenerator();
    @Test
    public void EvaluateTypeCheckerDividePlus(){
        PlusNode plusNode = new PlusNode(){{left = new NumberNode(){{value = 10;}}; right = new NumberNode(){{value = 66;}};}};
        NumberNode numberNode = new NumberNode(){{value = 73;}};
        DivideNode divideNode = new DivideNode(){{left = plusNode; right = numberNode;}};

        assertEquals("number", typeChecker.Visit(divideNode));
    }

    @Test
    public void EvaluateTypeCheckerEqualGreaterThan(){
        GreaterThanNode greaterThanNode = new GreaterThanNode(){{left = new NumberNode(){{value = 20;}}; right = new NumberNode(){{value = 90;}};}};
        BoolNode boolNode = new BoolNode(){{aBoolean = true;}};
        EqualNode equalNode = new EqualNode(){{left = greaterThanNode; right = boolNode;}};

        assertEquals("bool", typeChecker.Visit(equalNode));
    }

    @Test
    public void EvaluateCodeGenInvokeNode(){
        MotorInvokeNode motorInvokeNode = new MotorInvokeNode(){{speed = new NumberNode(){{value = 10;}}; method = "Forward";}};
        InvokeNode invokeNode = new InvokeNode(){{child = motorInvokeNode;}};

        assertEquals("F", codeGenerator.Visit(invokeNode).toString());
    }

    @Test
    public void EvaluateCodeGenInvokeNodeSec(){
        MotorInvokeNode motorInvokeNode = new MotorInvokeNode(){{speed = new NumberNode(){{value = 10;}}; time = new NumberNode(){{value = 100;}}; method = "ForwardSeconds";}};
        InvokeNode invokeNode = new InvokeNode(){{child = motorInvokeNode;}};

        assertEquals("FS", codeGenerator.Visit(invokeNode).toString());
    }

}
