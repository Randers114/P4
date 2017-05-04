package abstractSyntaxTree.nodes;

import java.util.ArrayList;
import java.util.List;
import AVisitor.*;

public abstract class Node{
    public List<Node> ChildrenList = new ArrayList<>();

    public abstract Object Accept(Visitor visitor);
}
