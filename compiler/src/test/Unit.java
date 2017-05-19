package test;

import org.junit.*;
import abstractSyntaxTree.nodes.*;
import typeChecker.ATypeChecker;
import static junit.framework.Assert.assertEquals;

public class Unit {
    private ATypeChecker typeChecker = new ATypeChecker();
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
}
