package typeChecker;

import abstractSyntaxTree.nodes.*;
import abstractSyntaxTree.AstBuild;
import sourceParser.FinalGrammarParser;
import symbolTable.*;

import javax.print.attribute.standard.MediaSize;

public class TypeChecker
{
	public void TypeCheckProgram(ProgramNode rootnode)
	{
		for (Node child: rootnode.ChildrenList)
		{
			if (child != null)
				TypeCheckChildren(child, ((BlockNode) rootnode.leftMain).table);
		}
	}

	public void TypeCheckChildren (Node node, SymbolTable ST)
	{
		if (node instanceof MethodNode)
			TypeCheckMethod(node, ST);
		else if (node instanceof BlockNode)
			TypeCheckBlock(node, ST);
		else if (node instanceof BodyNode)
			TypeCheckBody(node, ST);
		else if (node instanceof PlusNode)
			TypeCheckOpNode(node, ST);
	}

	public boolean SameType(Node node1, Node node2)
	{
		if (node1.getClass().equals(node2.getClass()))
			return true;
		else
			return false;
	}

	public void TypeCheckMethod(Node node, SymbolTable ST)
	{
		if(SameType(((MethodNode) node).returnval, ((MethodNode) node).type))
		{
			System.out.println("method " + ((MethodNode) node).id + "is type correct");
			TypeCheckChildren(((MethodNode) node).block, ST);
		}
		else
			System.out.println("method " + ((MethodNode) node).id + "is NOT type correct");
	}

	public void TypeCheckBlock(Node node, SymbolTable ST)
	{
		for (Node child: (((BlockNode)node).ChildrenList))
		{
			TypeCheckChildren(child, ST);
		}
	}

	public void TypeCheckBody(Node node, SymbolTable ST)
	{
		if (node instanceof StmtNode)
			TypeCheckStmtNode(node);
		else if (node instanceof DclNode)
			TypeCheckDclNode((DclNode)node, ST);
		else if (node instanceof CallNode)
			TypeCheckCallNode(node);
	}

	public void TypeCheckDclNode(DclNode node, SymbolTable ST)
	{
		if (IsOpNode((node).right) && ((TypesNode)((node).left)).type == "number")
			TypeCheckOpNode((((node).right), ST);
		else if (((node).right) instanceof BoolValOpNode || (((node).right) instanceof BoolOpNode && ((TypesNode)((node).left)).type == "boolean"))
			TypeCheckBoolValOpNode(((node).right), ST);
		else if ((node).right instanceof NumberNode && ((TypesNode)((node).left)).type == "number")
			print("dcl number " + (node).middle + " = " + ((NumberNode)(node).right).value + " evalutaed correctly");
		else if((node).right instanceof BoolNode && ((TypesNode) ((node).left)).type == "bool")
			print("dcl bool " + (node).middle + " = " + ((BoolNode)(node).right).aBoolean + " evaluted correctly");
	}

	public void TypeCheckOpNode(Node node, SymbolTable ST)
	{
		if (IsOpNode(((OpNode)node).left))
			TypeCheckOpNode(((OpNode)node).left, ST);
		if (IsOpNode(((OpNode)node).right))
			TypeCheckOpNode(((OpNode)node).right, ST);
		if (((OpNode)node).left instanceof  NumberNode || ST.LookUp((((IdentifierNode)((OpNode)node).left).name))  && ((OpNode)node).right instanceof NumberNode || ST.LookUp((((IdentifierNode)((OpNode)node).right).name)) )
			print("Expr eval correctly");
		else
			print("Expr cold not svalutae correctly");

	}
	public void TypeCheckBoolValOpNode(Node node, SymbolTable ST)
	{

	}

	public void TypeCheckCallNode(Node node)
	{

	}

	public void TypeCheckStmtNode(Node node)
	{
		if (node instanceof WhileNode)
			TypeCheckWhileNode(node);
		else if (node instanceof ForNode)
			TypeCheckForNode(node);
		else if (node instanceof IfNode)
			TypeCheckIfNode(node);
	}

	public boolean IsOpNode(Node node)
	{
		if (	((DclNode)node).left instanceof PlusNode ||
				((DclNode)node).left instanceof MinusNode ||
				((DclNode)node).left instanceof TimesNode ||
				((DclNode)node).left instanceof DivideNode)
			return true;
		else
			return false;
	}
	public boolean IsOpNodeExtended(Node node)
	{
		if (	((DclNode)node).left instanceof PlusNode ||
				((DclNode)node).left instanceof MinusNode ||
				((DclNode)node).left instanceof TimesNode ||
				((DclNode)node).left instanceof DivideNode ||
				((DclNode)node).left instanceof BoolOpNode ||
				((DclNode)node).left instanceof BoolValOpNode)
			return true;
		else
			return false;
	}

	public void print(String s) {System.out.println(s);}
}
