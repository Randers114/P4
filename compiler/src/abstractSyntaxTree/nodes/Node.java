package abstractSyntaxTree.nodes;

import sun.reflect.generics.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Node{
    public List<Node> ChildrenList = new ArrayList<>();

    //public abstract void Accept(Visitor visitor);
}
