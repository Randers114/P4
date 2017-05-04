package typeChecker;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.bind.v2.TODO;
import jdk.nashorn.internal.codegen.CompilerConstants;
import jdk.nashorn.internal.ir.Block;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import symbolTable.*;
import abstractSyntaxTree.nodes.*;
import java.lang.reflect.Type;

//TODO Check for problems surrounding "equal" and "notequal"

public class TCC
{
	public void TypeCheckProgram(ProgramNode rootnode)
	{
		SymbolTable ST = rootnode.table;
		TypeCheckBlock((BlockNode) rootnode.leftMain, ST);
		for (Node child: rootnode.methods)
		{
			TypeCheckMethod((MethodNode)child, ST);
		}
		System.out.println("We did it!");
	}

	public void TypeCheckBlock(BlockNode node, SymbolTable ST)
	{
		SymbolTable ST = node.table;
		for (Node child: node.ChildrenList)
		{
			TypeCheckBody((BodyNode)child, ST);
		}
	}

	public void TypeCheckBody(BodyNode node, SymbolTable ST)
	{
		if (node.content instanceof DclNode)
			TypeCheckDclNode((DclNode)node.content, ST);
		else if (node.content instanceof StmtNode)
			TypeCheckStmt((StmtNode)node.content, ST);
		else if (node.content instanceof CallNode)
			TypeCheckCall((CallNode)node.content, ST);
		else
			throw new IllegalArgumentException();
	}

	public void TypeCheckDclNode(DclNode node, SymbolTable ST)
	{
		if (!(ST.LookUp(((IdentifierNode)node.middle).name)))
		{
			if (((TypesNode) node.left).type.equals("number") && node.right instanceof NumberNode)
				print("Succes!");
			else if (((TypesNode) node.left).type.equals("boolean") && node.right instanceof BoolNode)
				print("Succes!");
			else if (TypeCheckOp((OpNode) node.right, ST) && ((TypesNode) node.left).equals("number"))
				print("Succes!");
			else if (TypeCheckBoolValOp((BoolValOpNode) node.right, ST) && ((TypesNode) node.left).equals("boolean"))
				print("Succes!");
			else if (TypeCheckBoolOp((BoolOpNode) node.right, ST) && ((TypesNode) node.left).equals("boolean"))
				print("Succes!");
		}
	}

	public boolean TypeCheckOp(OpNode node, SymbolTable ST)
	{
		if(		node.left instanceof NumberNode
				|| (node.left instanceof IdentifierNode && ST.LookUpAndIsType(((IdentifierNode) node.left).name,"number"))
				|| TypeCheckOp((OpNode)node.left, ST)
				&&
				node.right instanceof NumberNode
				|| (node.right instanceof IdentifierNode && ST.LookUpAndIsType(((IdentifierNode) node.right).name,"number"))
				|| TypeCheckOp((OpNode)node.right, ST)
				)
			return true;
		else
			return false;
	}

	public boolean TypeCheckBoolOp(BoolOpNode node, SymbolTable ST)
	{
		if (	node.left instanceof BoolNode
				|| (node.left instanceof IdentifierNode && ST.LookUpAndIsType(((IdentifierNode) node.left).name,"boolean"))
				|| TypeCheckOp((OpNode)node.left)
				|| TypeCheckBoolOp((BoolOpNode)node.left)
				&&
				node.right instanceof BoolNode
				|| (node.right instanceof IdentifierNode && ST.LookUpAndIsType(((IdentifierNode) node.right).name,"boolean"))
				|| TypeCheckOp((OpNode)node.right)
				|| TypeCheckBoolOp((BoolOpNode)node.right)
				)
			return true;
		else
			return false;
	}

	public boolean TypeCheckBoolValOp(BoolValOpNode node, SymbolTable ST)
	{
		if (node.boolValOperator.matches( "equal | notEqual"))
		{
			if(     (node.left instanceof BoolNode
					|| (TypeCheckBoolOp((BoolOpNode) node.left, ST)
					|| TypeCheckBoolValOp((BoolValOpNode)node.left, ST)
					&&
					node.right instanceof BoolNode
					||TypeCheckBoolOp((BoolOpNode) node.right, ST)
					|| TypeCheckBoolValOp((BoolValOpNode)node.right, ST)))
							||
					(TypeCheckOp((OpNode) node.left) && TypeCheckOp((OpNode) node.right))
							||
					(node.left instanceof NumberNode && node.right instanceof NumberNode)

				)
				return true;
			else
				return false;
		}
		else if (node.boolValOperator.matches("smallerThan | greaterThan | greaterThanOrEqual | smallerThanOrEqual"))
			return TypeCheckOp((OpNode)node, ST);
		else
			return false;
	}

	public void print(String s) {System.out.println(s);}

	public void TypeCheckStmt(StmtNode node, SymbolTable ST)
	{
		if (node.child instanceof AssignNode)
			TypeCheckAssign((AssignNode)node.child, ST);
		else if (node.child instanceof IfNode)
			TypeCheckIf((IfNode)node.child, ST);
		else if (node.child instanceof WhileNode)
			TypeCheckWhile((WhileNode)node.child, ST);
		else if (node.child instanceof ForNode)
			TypeCheckFor((ForNode)node.child, ST );
	}

	public void TypeCheckAssign(AssignNode node, SymbolTable ST) //TODO could be strung together with type check dcl or other way around
	{
		if(ST.LookUp(((IdentifierNode)node.left).name))
			if(		(ST.GetType(((IdentifierNode)node.left).name).equals("number") && node.right instanceof NumberNode || TypeCheckOp((OpNode)node.right, ST))
					|| (ST.GetType(((IdentifierNode)node.left).name).equals("boolean") && node.right instanceof BoolNode || TypeCheckBoolOp((BoolOpNode)node.right,ST))
					|| (ST.GetType(((IdentifierNode)node.left).name).equals("boolean") && node.right instanceof BoolNode || TypeCheckBoolValOp((BoolValOpNode)node.right, ST))
					)
				print("Succes!");
	}

	public void TypeCheckIf(IfNode node, SymbolTable ST)
	{
		if(IfWhileBoolCheck(node.bool, ST))
		{
			print("Succes!");
			TypeCheckBlock((BlockNode)node.block,ST);
		}

	}

	public void TypeCheckWhile(WhileNode node, SymbolTable ST)
	{
		if(IfWhileBoolCheck((node.bool), ST))
		{
			print("Succes!");
			TypeCheckBlock((BlockNode) node.block, ST);
		}

	}

	public void TypeCheckFor(ForNode node, SymbolTable ST)
	{
		if(		(node.startNumber instanceof NumberNode
				|| (node.startNumber instanceof IdentifierNode && ST.GetType(((IdentifierNode)node.startNumber).name).equals("number")))
				&&
				(node.endNumber instanceof NumberNode
				|| (node.endNumber instanceof IdentifierNode && ST.GetType(((IdentifierNode)node.endNumber).name).equals("number")))
				)
		{
			print("Succes!");
			TypeCheckBlock((BlockNode)node.block, ST);
		}
	}

	public boolean IfWhileBoolCheck(Node node, SymbolTable ST)
	{
		if (	node instanceof BoolNode
				|| (node instanceof IdentifierNode && ST.GetType(((IdentifierNode)node).name).equals("boolean"))
				|| TypeCheckBoolValOp((BoolValOpNode) node, ST)
				|| TypeCheckBoolOp((BoolOpNode) node, ST)
				|| TypeCheckCall((CallNode)node, ST)
			)
			return true;
		else
			return false;
	}

	public boolean TypeCheckCall(CallNode node, SymbolTable ST)
	{
		if(ST.LookUp(((IdentifierNode)node.id).name))
			print("Succesfull lookup!");
			return (TypeCheckParameters((ParameterNode)node.parameter, GetFprmtNode(((IdentifierNode)node.id).name, ST) ,ST));

	}

	public boolean TypeCheckParameters(ParameterNode node, FormalParameterNode FprmtNode, SymbolTable ST)
	{

	}
}
