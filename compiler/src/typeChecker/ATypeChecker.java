package typeChecker;

import AVisitor.Visitor;
import abstractSyntaxTree.nodes.*;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ATypeChecker extends Visitor {
    private Stack<SymbolTable> CurrentSymbolTable = new Stack<>();
    private ProgramNode Root;

    @Override
    public Object Visit(DesignSpecificDclNode node) {
        return null;
    }

    @Override
    public String Visit(InvokeNode node) {
        return node.child.Accept(this).toString();
    }

    @Override
    public String Visit(ListInvokeNode node) {
        return "";
    }

    @Override
    public Object Visit(MotorNode node) {
        return null;
    }

    @Override
    public String Visit(MotorInvokeNode node) {

        String type = "";
        String type2 = "";
        if (node.speed != null){
            type = node.speed.Accept(this).toString();
        }
        if(node.time != null) {
            type2 = node.time.Accept(this).toString();
        }

        if(!(((node.method.equals("Forward") || node.method.equals("Backward")) && type.equals("number") && node.time == null || (node.time != null && type2.equals("number"))) || node.method.equals("Stop()"))) {
            System.out.println("Mistakes were made motorinvoke, line: " + node.LineNumber);
        }
        return "void";
    }

    @Override
    public String Visit(SensorInvokeNode node) {
        if (node.method.equals("isPressed")){
            return "bool";
        } else if (node.method.equals("distance")){
            return "number";
        }
        return null;
    }

    @Override
    public Object Visit(TouchSensorNode node) {
        return null;
    }

    @Override
    public Object Visit(UltraSoundSensorNode node) {
        return null;
    }

    @Override
    public Object Visit(SynchronizationNode node)
    {
        if (!(node.right != null && node.left != null && SymbolTable.GetTypeByID(((IdentifierNode)node.left).name, CurrentSymbolTable.peek()).equals("Motor")
            && SymbolTable.GetTypeByID(((IdentifierNode)node.right).name, CurrentSymbolTable.peek()).equals("Motor"))){

            System.out.println("Synchronization node failed one identifier is not Motor at line: " + node.LineNumber);
        }

        if (node.relativeSpeed != null){
            if (!(node.relativeSpeed < 101 && node.relativeSpeed > -100))
            System.out.println("Synchronization node failed speed out of bounds at line: " + node.LineNumber);
        }

        return null;
    }

    @Override
    public Object Visit(SleepNode node)
    {
		node.child.Accept(this);
    	return null;

    }

    @Override
    public String Visit(AndNode node) {
        if (CheckForBool(node).equals("bool")){
            return "bool";
        } else {
            System.out.println("And expression fail, line: " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(EqualNode node) {
        if (CheckForBool(node).equals("bool") || CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            System.out.println("Equal expression fail, line:  " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(GreaterThanNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            System.out.println("greaterThan expression fail, line: " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(GreaterThanOrEqualNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            System.out.println("greaterThanEqual expression fail, line: " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(LessThanNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            System.out.println("lessThan expression fail, line: " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(LessThanOrEqualNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            System.out.println("lessThanEqual expression fail, line: " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(NotEqualNode node) {
        if (CheckForBool(node).equals("bool") || CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            System.out.println("notEqual expression fail, line: " + node.LineNumber);
        }

        return "";
    }

    @Override
    public String Visit(OrNode node) {
        return CheckForBool(node);
    }

    @Override
    public Void Visit(AssignNode node){
        String type, type2;
        type = node.left.Accept(this).toString();
        type2 = node.right.Accept(this).toString();

        if (type2.equals("true") || type2.equals("false") || type2.equals("bool")) {
            type2 = "bool";
        } else {
            type2 = "number";
        }

        if (!type.equals(type2)){
            System.out.println("Mistakes have been made assignNode, line: " + node.LineNumber);
        }

        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        CurrentSymbolTable.push(node.symbolTable);

        for (Node n: node.ChildrenList
                ) {
            n.Accept(this);
        }

        CurrentSymbolTable.pop();
        return null;
    }

    @Override
    public Void Visit(BodyNode node) {
        node.content.Accept(this);

        return null;
    }

    @Override
    public String Visit(BoolNode node) {
        return "bool";
    }

    @Override
    public String Visit(CallNode node) {
        List<String> formal, actual = new ArrayList<>();

        if (node.parameter != null){
            formal = FindMethodFormalParameterTypes(((IdentifierNode) node.id).name);
            FindMethodParameterTypes((ParameterNode) node.parameter, actual);

            if (formal.size() != 0 || actual.size() != 0){
                if (formal.size() == actual.size()){
                    for (int i = 0; i < formal.size(); i++){
                        if (!formal.get(i).equals(actual.get(i))){
                            System.out.println("Mistake at parameter: " + (i + 1) );
                        }
                    }
                } else {
                    System.out.println("Mistakes have been made callnode, line: " + node.LineNumber);
                }
            }
        }

        if(node.invoke != null) {
            return node.invoke.Accept(this).toString();
        }


        return node.id.Accept(this).toString();
    }

    @Override
    public Void Visit(DclNode node) {
        String type = "", type2 = "", rightNode = "";
        if (node.left != null)
        type = node.left.Accept(this).toString();

        if (node.right != null){
            rightNode = node.right.Accept(this).toString();

            if (rightNode.equals("true") || rightNode.equals("false") || rightNode.equals("bool")) {
                type2 = "bool";
            }
            else if(rightNode.equals("Motor")) {
                type2 = "Motor";
                if (node.middle instanceof IdentifierNode) {
                    if (!((IdentifierNode) node.middle).name.matches("[A-D]")) {
                        System.out.println("Wrong motor instanciation symbol, line: " + node.LineNumber);
                    }
                } else {
                    System.out.println("Wrong motor instanciation symbol, line: " + node.LineNumber);
                }
            }
            else if(rightNode.equals("UltrasoundSensor")){
                type2 = "UltrasoundSensor";
            } else if(rightNode.equals("TouchSensor")){
                type2 = "TouchSensor";
            }
            else if (node.middle != null && node.isList)
            {
                node.middle.Accept(this);
            }
            else {
                type2 = "number";
            }

            if (!type.equals(type2)){
                System.out.println("Mistakes have been made dclNode, line: " + node.LineNumber);
            }
        }
        return null;
    }

    @Override
    public Object Visit(DesynchronizeNode node) {
        if (!(node.right != null && node.left != null && SymbolTable.GetTypeByID(((IdentifierNode)node.left).name, CurrentSymbolTable.peek()).equals("Motor")
                && SymbolTable.GetTypeByID(((IdentifierNode)node.right).name, CurrentSymbolTable.peek()).equals("Motor"))){

            System.out.println("Desynchronization node failed one identifier is not Motor at line: " + node.LineNumber);
        }
        return null;
    }

    @Override
    public String Visit(DivideNode node) {
        if (CheckForNumber(node).equals("number")){
            return "number";
        } else {
            System.out.println("Mistake at line: " + node.LineNumber);
        }
        return "";
    }

    @Override
    public Void Visit(ElseIfNode node) {
        node.bool.Accept(this);
        node.block.Accept(this);

        return null;
    }

    @Override
    public Void Visit(ElseNode node) {
        node.block.Accept(this);

        return null;
    }

    @Override
    public Void Visit(FormalParameterNode node) {
        return null;
    }

    @Override
    public Void Visit(ForNode node) {
        node.block.Accept(this);
        return null;
    }

    @Override
    public String Visit(IdentifierNode node) {
        return SymbolTable.GetTypeByID(node.name, CurrentSymbolTable.peek());
    }

    @Override
    public Void Visit(IfNode node) {
        if (!node.bool.Accept(this).toString().equals("bool")){
            System.out.println("if bool error, line: " + node.LineNumber);
        }
        node.block.Accept(this);
        if (node.elseif != null) {
            for (Node n: node.elseif
                    ) {
                n.Accept(this);
            }
        }

        if (node.el != null) {
            node.el.Accept(this);
        }

        return null;
    }

    @Override
    public Void Visit(MethodNode node) {
        String type, type2;
        type = node.type.Accept(this).toString();

        CurrentSymbolTable.push(((BlockNode) node.block).symbolTable);

        if (!type.equals("void")){
            type2 = node.returnval.Accept(this).toString();

            if (!type.equals(type2)){
                System.out.println("Mistakes have been made methodNode");
            }
        }

        CurrentSymbolTable.pop();

        node.block.Accept(this);



        return null;
    }

    @Override
    public String Visit(MinusNode node) {
        if (CheckForNumber(node).equals("number")){
            return "number";
        } else {
            System.out.println("Mistake at line: " + node.LineNumber);
        }
        return "";
    }

    @Override
    public String Visit(NotBoolNode node) {
        if (CheckForBool(node).equals("bool")){
            return "bool";
        } else {
            System.out.println("Mistake at line: " + node.LineNumber);
        }
        return "";
    }

    @Override
    public String Visit(NumberNode node) {
        return "number";
    }

    @Override
    public Void Visit(ParameterNode node) {
        return null;
    }

    @Override
    public String Visit(PlusNode node) {
        if (CheckForNumber(node).equals("number")){
            return "number";
        } else {
            System.out.println("Mistake at line: " + node.LineNumber);
        }
        return "";
    }

    @Override
    public Void Visit(ProgramNode node) {
        CurrentSymbolTable.push(node.symbolTable);
        Root = node;

        for (Node n: node.ChildrenList
                ) {
            n.Accept(this);
        }

        CurrentSymbolTable.pop();
        return null;
    }

    @Override
    public String Visit(ReturnValNode node) {
        String type = node.returnvalue.Accept(this).toString();

        if (type.equals("true") || type.equals("false") || type.equals("bool")) {
            type = "bool";
        } else {
            type = "number";
        }

        return type;
    }

    @Override
    public Void Visit(StmtNode node) {
        node.child.Accept(this);
        return null;
    }

    @Override
    public String Visit(TermNode node) {
        return node.child.Accept(this).toString();
    }

    @Override
    public String Visit(TimesNode node) {
        if (CheckForNumber(node).equals("number")){
            return "number";
        } else {
            System.out.println("Mistake at line: " + node.LineNumber);
        }
        return "";
    }

    @Override
    public String Visit(TypesNode node) {
        return node.type;
    }

    @Override
    public String Visit(UnaryMinusNode node) {
        return CheckForNumber(node);
    }

    @Override
    public Object Visit(ValueNode node) {
        return node.child.Accept(this);
    }

    @Override
    public Void Visit(WhileNode node) {
        if (!node.bool.Accept(this).toString().equals("bool")){
            System.out.println("while bool error " + node.LineNumber);
        }
        node.block.Accept(this);
        return null;
    }

    private List<String> FindMethodFormalParameterTypes(String id){
        MethodNode method = new MethodNode();
        List<String> typeList = new ArrayList<>();

        for (Node n: Root.methods
             ) {
            if (((IdentifierNode)((MethodNode) n).id).name.equals(id)){
                method = (MethodNode) n;
            }
        }

        if (method.fprmt != null){
            CurrentSymbolTable.push(((BlockNode) method.block).symbolTable);
            TraverseParameters((FormalParameterNode) method.fprmt, typeList);
            CurrentSymbolTable.pop();
        }

        return typeList;
    }

    private void FindMethodParameterTypes(ParameterNode node, List<String> parameterList){
        parameterList.add(node.Parameter.Accept(this).toString());

        if (node.prmt != null){
            FindMethodParameterTypes((ParameterNode) node.prmt, parameterList);
        }
    }

    private void TraverseParameters(FormalParameterNode node, List<String> list){
        list.add(node.id.Accept(this).toString());

        if (node.fprmt != null){
            TraverseParameters((FormalParameterNode) node.fprmt, list);
        }
    }

    private String CheckForNumber(OpNode node){
        String type, type2;

        type = node.left.Accept(this).toString();
        type2 = node.right.Accept(this).toString();

        if (type.equals("number") && type2.equals("number")){
            return "number";
        }

        return "";
    }

    private String CheckForNumber(Single node){
        String type;

        type = node.child.Accept(this).toString();

        if (type.equals("number")){
            return "number";
        }
        return "";
    }

    private String CheckForBool(OpNode node){
        String type, type2;

        type = node.left.Accept(this).toString();
        type2 = node.right.Accept(this).toString();

        if ((type.equals("bool") || type.equals("true") || type.equals("false")) && (type2.equals("bool") || type2.equals("true") || type2.equals("false"))){
            return "bool";
        }

        return "";
    }

    private String CheckForBool(Single node){
        String type;

        type = node.child.Accept(this).toString();

        if (type.equals("bool") || type.equals("true") || type.equals("false")) {
            return "bool";
        }

        return "";
    }
}





