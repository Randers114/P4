package prettyPrint;

import abstractSyntaxTree.nodes.*;
import abstractSyntaxTree.nodes.ProgramNode;

public class PrettyPrint
{
	public static void Init(ProgramNode node){
		VisitNode(node);
	}
	private static void VisitNode(ProgramNode node) {
		System.out.println("main {");
		for (Node item : node.leftMain)
		{
			VisitNode(item);
		}
		System.out.println("}");

		for (Node item : node.methods)
		{
			VisitNode(item);
		}
	}
	private static void VisitNode(MinusNode node) {
		VisitNode(node.left);
		System.out.print("-");
		VisitNode(node.right);
	}
	private static void VisitNode(PlusNode node) {
		VisitNode(node.right);
		System.out.print("+");
		VisitNode(node.left);
	}
	private static void VisitNode(TimesNode node) {
		VisitNode(node.right);
		System.out.print("*");
		VisitNode(node.left);
	}
	private static void VisitNode(DivideNode node) {
		VisitNode(node.right);
		System.out.print("/");
		VisitNode(node.left);
	}
	private static void VisitNode(UnaryMinusNode node) {
		System.out.print("-");
		VisitNode(node.child);
	}
	private static void VisitNode(MethodNode node) {
		VisitNode(node.type);
		System.out.print("Method ");
		VisitNode(node.id);
		System.out.print("(");
		VisitNode(node.fprmt);
		System.out.print(")");
		System.out.println("{");
		for (Node item: node.body
			 ) {
			VisitNode(item);
		}
		VisitNode(node.returnval);
		System.out.println(";");
		System.out.println("}");
	}
	private static void VisitNode(BodyNode node)
	{
		VisitNode(node.content);
	}
	private static void VisitNode(DclNode node){
		VisitNode(node.left);
		VisitNode(node.middle);
		if (node.right != null) {
			System.out.print(" = ");
			VisitNode(node.right);
		}
		System.out.println(";");

	}
	private static void VisitNode(StmtNode node){
		VisitNode(node.child);
	}
	private static void VisitNode(AssignNode node){
		VisitNode(node.left);
		System.out.print(" = ");
		VisitNode(node.right);
	}
	private static void VisitNode(WhileNode node){
		System.out.print("While (");
		VisitNode(node.bool);
		System.out.print(") \n{ \n");
		for (Node item: node.body
			 ) {
			VisitNode(item);
		}
		System.out.println("}");

	}
	private static void VisitNode(ForNode node){
		System.out.print("for ( ");
		VisitNode(node.startNumber);
		System.out.print(" to ");
		VisitNode(node.endNumber);
		System.out.println(" )\n{");

		for (Node item: node.body
			 ) {
			VisitNode(item);
		}
		System.out.println("}");
	}
	private static void VisitNode(IfNode node){
		System.out.print("if(");
		VisitNode(node.bool);
		System.out.println(")\n{");

		for (Node item: node.body
			 ) {
			VisitNode(item);
		}
		System.out.println("}");

		if (node.elseif != null) {
			for (Node item : node.elseif
					) {
				VisitNode(item);
			}
		}

		VisitNode(node.el);
	}
	private static void VisitNode(ElseNode node){
		System.out.println("else\n{");
		for (Node item: node.body
			 ) {
			VisitNode(item);
		}
		System.out.println("}");
	}
	private static void VisitNode(ElseIfNode node){
		System.out.print("else if(");
		VisitNode(node.bool);
		System.out.print(")\n{");
		for (Node item: node.body
			 ) {
			VisitNode(item);
		}
		System.out.println("}");
	}
	private static void VisitNode(TypesNode node){
		System.out.print(node.type + " ");
	}
	private static void VisitNode(ParameterNode node){
		System.out.print(node.Parameter);

		if (node.prmt != null){
			System.out.print(", ");

			VisitNode(node.prmt);
		}
	}
	private static void VisitNode(FormalParameterNode node){
		VisitNode(node.type);
		VisitNode(node.id);
		if (node.fprmt != null){
			System.out.print(", ");
			VisitNode(node.fprmt);
		}
	}
	private static void VisitNode(CallNode node){
		VisitNode(node.id);
		System.out.print("(");
		VisitNode(node.parameter);
		System.out.println(") ;");
	}
	private static void VisitNode(NumberNode node){
		System.out.print(node.value);
	}
	private static void VisitNode(TermNode node){
		VisitNode(node.child);
	}
	private static void VisitNode(ValueNode node){
		VisitNode(node.child);
	}
	private static void VisitNode(IdentifierNode node){
		System.out.print(node.name);
	}
	private static void VisitNode(BoolNode node){
		System.out.print(node.aBoolean);
	}
	private static void VisitNode(ReturnValNode node){
		System.out.printf("return ");
		VisitNode(node.returnvalue);
	}
	private static void VisitNode(InstanceNode node){
		System.out.print(node.instance + " ");
	}
	private static void VisitNode(StatIdNode node){
		VisitNode(node.instance);
	}
	private static void VisitNode(StatSensorNode node){
		System.out.printf(node.instance);
	}
	private static void VisitNode(StatMotorNode node){
		System.out.printf(node.instance);
	}
	private static void VisitNode(StatListNode node){
		System.out.printf(node.instance);
	}
	private static void VisitNode(BoolValOpNode node){
		System.out.print(" " + node.boolValOperator + " ");
	}
	private static void VisitNode(BoolExprNode node){
		VisitNode(node.left);
		VisitNode(node.middle);
		VisitNode(node.right);
	}
	private static void VisitNode(NegatedBoolNode node){
		System.out.printf("not ");
		VisitNode(node.left);
	}
	private static void VisitNode(BoolOpNode node){
		System.out.print(" " + node.child + " ");
	}
	private static void VisitNode(RBooleanNode node){
		VisitNode(node.left);

		if (node.middle != null) {
			VisitNode(node.middle);
		}
		if (node.right != null) {
			VisitNode(node.right);
		}
	}
	private static void VisitNode(NotBoolNode node){
		System.out.printf("not ");
		VisitNode(node.child);
	}
	private static void VisitNode(Node node){
		if (node instanceof BodyNode){
			VisitNode((BodyNode) node);
		} else if (node instanceof StmtNode){
			VisitNode((StmtNode) node);
		} else if (node instanceof DclNode){
			VisitNode((DclNode) node);
		} else if (node instanceof CallNode){
			VisitNode((CallNode) node);
		} else if (node instanceof IfNode){
			VisitNode((IfNode) node);
		} else if (node instanceof ForNode){
			VisitNode((ForNode) node);
		} else if (node instanceof WhileNode){
			VisitNode((WhileNode) node);
		} else if (node instanceof TypesNode){
			VisitNode((TypesNode) node);
		} else if (node instanceof IdentifierNode){
			VisitNode((IdentifierNode) node);
		} else if (node instanceof PlusNode){
			VisitNode((PlusNode) node);
		} else if (node instanceof MinusNode){
			VisitNode((MinusNode) node);
		} else if (node instanceof TermNode){
			VisitNode((TermNode) node);
		} else if (node instanceof MethodNode){
			VisitNode((MethodNode) node);
		} else if (node instanceof TimesNode){
			VisitNode((TimesNode) node);
		} else if (node instanceof DivideNode){
			VisitNode((DivideNode) node);
		} else if (node instanceof RBooleanNode){
			VisitNode((RBooleanNode) node);
		} else if (node instanceof ReturnValNode){
			VisitNode((ReturnValNode) node);
		} else if (node instanceof StatIdNode){
			VisitNode((StatIdNode) node);
		} else if (node instanceof BoolOpNode){
			VisitNode((BoolOpNode) node);
		} else if (node instanceof BoolExprNode){
			VisitNode((BoolExprNode) node);
		} else if (node instanceof NumberNode){
			VisitNode((NumberNode) node);
		} else if (node instanceof ElseNode){
			VisitNode((ElseNode) node);
		} else if (node instanceof ElseIfNode){
			VisitNode((ElseIfNode) node);
		} else if (node instanceof AssignNode){
			VisitNode((AssignNode) node);
		} else if (node instanceof ParameterNode){
			VisitNode((ParameterNode) node);
		} else if (node instanceof FormalParameterNode){
			VisitNode((FormalParameterNode) node);
		} else if (node instanceof ValueNode){
			VisitNode((ValueNode) node);
		} else if (node instanceof InstanceNode){
			VisitNode((InstanceNode) node);
		} else if (node instanceof StatSensorNode){
			VisitNode((StatSensorNode) node);
		} else if (node instanceof StatMotorNode){
			VisitNode((StatMotorNode) node);
		} else if (node instanceof StatListNode){
			VisitNode((StatListNode) node);
		} else if (node instanceof NegatedBoolNode){
			VisitNode((NegatedBoolNode) node);
		} else if (node instanceof BoolValOpNode){
			VisitNode((BoolValOpNode) node);
		} else if (node instanceof  UnaryMinusNode){
			VisitNode((UnaryMinusNode) node);
		} else if (node instanceof NotBoolNode){
			VisitNode((NotBoolNode) node);
		} else if (node instanceof BoolNode){
			VisitNode((BoolNode) node);
		}
	}
}
