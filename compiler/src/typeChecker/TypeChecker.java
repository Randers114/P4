package typeChecker;

import visitor.Visitor;
import abstractSyntaxTree.nodes.*;
import event.ErrorEvent;
import errorHandling.FireableError;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TypeChecker extends FireableError implements Visitor {
    private Stack<SymbolTable> CurrentSymbolTable = new Stack<>();
    private ProgramNode Root;

    @Override
    public Void Visit(DesignSpecificDclNode node) {
        return null;
    }

    @Override
    public String Visit(InvokeNode node) {
        return node.child.Accept(this).toString();
    }

    @Override
    public Void Visit(MotorNode node) {
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
            FireError(new ErrorEvent("Wrong type used in motorinvoke, line: " + node.LineNumber));
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
    public Void Visit(TouchSensorNode node) {
        return null;
    }

    @Override
    public Void Visit(UltraSoundSensorNode node) {
        return null;
    }

    @Override
    public Void Visit(SynchronizationNode node)
    {
        if (!(node.right != null && node.left != null && SymbolTable.GetTypeByID(((IdentifierNode)node.left).name, CurrentSymbolTable.peek()).equals("Motor")
                && SymbolTable.GetTypeByID(((IdentifierNode)node.right).name, CurrentSymbolTable.peek()).equals("Motor"))){
            FireError(new ErrorEvent("Synchronization node failed one identifier is not Motor at line: " + node.LineNumber));
        }

        if (node.relativeSpeed != null){
            if (!node.relativeSpeed.Accept(this).toString().equals("number")){
                FireError(new ErrorEvent("Synchronization node failed speed out of bounds at line: " + node.LineNumber));
            }
        }

        return null;
    }

    @Override
    public Void Visit(SleepNode node)
    {
        if (!CheckForNumber(node).equals("number")){
            FireError(new ErrorEvent("The object inserted in sleep is not a number, error at line: " + node.LineNumber));
        }
        return null;

    }

    @Override
    public String Visit(AndNode node) {
        if (CheckForBool(node).equals("bool")){
            return "bool";
        } else {
            FireError(new ErrorEvent("And expression fail, line: " + node.LineNumber));
        }

        return "";
    }

    @Override
    public String Visit(EqualNode node) {
        if (CheckForBool(node).equals("bool") || CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            FireError(new ErrorEvent("Equal expression fail, line:  " + node.LineNumber));
        }

        return "";
    }

    @Override
    public String Visit(GreaterThanNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            FireError(new ErrorEvent("greaterThan expression fail, line: " + node.LineNumber));
        }

        return "";
    }

    @Override
    public String Visit(GreaterThanOrEqualNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            FireError(new ErrorEvent("greaterThanEqual expression fail, line: " + node.LineNumber));
        }

        return "";
    }

    @Override
    public String Visit(LessThanNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            FireError(new ErrorEvent("lessThan expression fail, line: " + node.LineNumber));
        }

        return "";
    }

    @Override
    public String Visit(LessThanOrEqualNode node) {
        if (CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            FireError(new ErrorEvent("lessThanEqual expression fail, line: " + node.LineNumber));
        }

        return "";
    }

    @Override
    public String Visit(NotEqualNode node) {
        if (CheckForBool(node).equals("bool") || CheckForNumber(node).equals("number")){
            return "bool";
        } else {
            FireError(new ErrorEvent("notEqual expression fail, line: " + node.LineNumber));
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
            FireError(new ErrorEvent("The types of the assign are not compatible, error at line: " + node.LineNumber));
        }

        return null;
    }

    @Override
    public Void Visit(BlockNode node) {
        CurrentSymbolTable.push(node.symbolTable);
        node.ChildrenList.forEach(n -> n.Accept(this));

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
                            FireError(new ErrorEvent("Wrong type at parameter: " + (i + 1)));
                        }
                    }
                } else {
                    FireError(new ErrorEvent("Too many actual parameters in callnode, line: " + node.LineNumber));
                }
            }
        }

        if(node.invoke != null) {
            String type = node.invoke.Accept(this).toString();
            if (type.equals("GetIndex")){
                type = node.id.Accept(this).toString();
            }
            return type;
        }


        return node.id.Accept(this).toString();
    }

    @Override
    public Object Visit(ListNode node) {
        return null;
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
                        FireError(new ErrorEvent("Wrong motor instantiation symbol, line: " + node.LineNumber));
                    }
                } else {
                    FireError(new ErrorEvent("Wrong motor instantiation symbol, line: " + node.LineNumber));
                }
            }
            else if(rightNode.equals("UltrasoundSensor")){
                type2 = "UltrasoundSensor";
            } else if(rightNode.equals("TouchSensor")){
                type2 = "TouchSensor";
            }
            else {
                type2 = "number";
            }

            if (!type.equals(type2)){
                FireError(new ErrorEvent("It is illegal to declare a " + type + " as a " + type2 + ", error at line: " + node.LineNumber));
            }
        }
        return null;
    }

    @Override
    public Object Visit(ListInvokeNode node) {
        switch (node.method){
            case "Add":
                return node.input.Accept(this);
            case "GetIndex":
                if (!node.input.Accept(this).equals("number")){
                    FireError(new ErrorEvent("Index can only be numbers, error at line: " + node.LineNumber));
                }
                return "GetIndex";
            default: return "";
        }

    }

    @Override
    public Void Visit(DesynchronizeNode node) {
        if (!(node.right != null && node.left != null && SymbolTable.GetTypeByID(((IdentifierNode)node.left).name, CurrentSymbolTable.peek()).equals("Motor")
                && SymbolTable.GetTypeByID(((IdentifierNode)node.right).name, CurrentSymbolTable.peek()).equals("Motor"))){
            FireError(new ErrorEvent("Desynchronization failed one identifier is not Motor at line: " + node.LineNumber));
        }
        return null;
    }

    @Override
    public String Visit(DivideNode node) {
        if (CheckForNumber(node).equals("number")){
            return "number";
        } else {
            FireError(new ErrorEvent("Divide error, error at line: " + node.LineNumber));
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
            FireError(new ErrorEvent("Wrong bool in the if statement, error at line: " + node.LineNumber));
        }
        node.block.Accept(this);
        if (node.elseif != null) {
            node.elseif.forEach(n -> n.Accept(this));
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
                FireError(new ErrorEvent("Wrong returnvalue in method, error at line: " + node.LineNumber));
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
            FireError(new ErrorEvent("Minus expression error, error at line: " + node.LineNumber));
        }
        return "";
    }

    @Override
    public String Visit(NotBoolNode node) {
        if (CheckForBool(node).equals("bool")){
            return "bool";
        } else {
            FireError(new ErrorEvent("Not bool expression error, error at line: " + node.LineNumber));
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
            FireError(new ErrorEvent("Plus expression error, error at line: " + node.LineNumber));
        }
        return "";
    }

    @Override
    public Void Visit(ProgramNode node) {
        CurrentSymbolTable.push(node.symbolTable);
        Root = node;

        node.ChildrenList.forEach(n -> n.Accept(this));

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
            FireError(new ErrorEvent("Times expression error at line: " + node.LineNumber));
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
            FireError(new ErrorEvent("bool error in while statement, error at line: " + node.LineNumber));
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