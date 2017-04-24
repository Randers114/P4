package typeChecker;


import abstractSyntaxTree.nodes.*;
import abstractSyntaxTree.nodes.PlusNode;
import org.antlr.v4.runtime.tree.*;

public abstract class AstVisit<D, B, N, S> {
    public abstract D Visit(PlusNode node);
    public abstract D Visit(MinusNode node);
    public abstract S Visit(TypesNode node);
    public abstract D Visit(IdentifierNode node);

    public boolean Visit(DclNode node){

        if (node.left instanceof TypesNode && node.right instanceof OpNode){
            return Visit((TypesNode) node.left).equals("number") && Visit((OpNode) node.right).equals(double.class) || Visit(node.left).equals("bool") && Visit(node.right).equals(boolean.class);
        }

    }

}
