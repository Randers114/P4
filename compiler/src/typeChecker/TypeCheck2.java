package typeChecker;


import abstractSyntaxTree.nodes.*;

/**
 * Created by Nikolaj Ljørring on 11/04/2017.
 */
public class TypeCheck2
{
    public void TypeCheck(ProgramNode node)
    {
        TypeCheckProgramNode(node);
    }

    public ProgramNode TypeCheckProgramNode(ProgramNode node)
    {
        int i = 0;
        if(TypeCheckBody(node.leftMain) instanceof BodyNode)
        {
            for (Node method : node.ChildrenList)
            {
                i++;
                if(TypeCheckMethod instanceof MethodNode)
                    print("Method passed succesfully");
                else
                    print("Method " + i + " could not resolve correctly");
            }
        }
    }

    public BodyNode TypeCheckBody(BodyNode node)
    {
        //same problem as before, since we only know the type of this node on runtime we cannot infer the formalparameter as a BodyNode, only a Node, hopefully Double Dispatch will fix
    }

    public void print(String s)
    {
        System.out.println(s);
    }
}
