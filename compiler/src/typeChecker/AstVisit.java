package typeChecker;


import abstractSyntaxTree.nodes.*;
import abstractSyntaxTree.nodes.PlusNode;
import org.antlr.v4.runtime.tree.*;

public abstract class AstVisit<D, S> extends AbstractParseTreeVisitor{
    public abstract D Visit(PlusNode node);
    public abstract D Visit(MinusNode node);
    public abstract S Visit(TypesNode node);
    public abstract D Visit(TimesNode node);
    public abstract D Visit(DivideNode node);
    public abstract String Visit(CallNode node);
    public abstract boolean Visit(NotBoolNode node);

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    public abstract D Visit(IdentifierNode node);

    public boolean Visit(DclNode node){

        if (node.left instanceof TypesNode){
            return Visit((TypesNode) node.left).equals("number") && TestNumber(node.right).equals(double.class) || Visit((TypesNode) node.left).equals("bool") && Visit((RBooleanNode) node.right);
        } else {
            System.out.println("Error");
        }

    }

    public boolean Visit(RBooleanNode node){
        if (node.left instanceof CallNode){
            if (Visit((CallNode) node.left).equals("bool")){
                return true;
            }
        } else if(node.left instanceof NotBoolNode) {
            return Visit((NotBoolNode) node.left);
        } else if(node.left instanceof BoolExprNode){

        }
    }

    private D TestNumber(Node node){
        if (node instanceof TimesNode){
            return Visit((TimesNode) node);
        } else if (node instanceof PlusNode){
            return Visit((PlusNode) node);
        } else if (node instanceof MinusNode) {
            return Visit((MinusNode) node);
        } else if (node instanceof DivideNode) {
            return Visit((DivideNode) node);
        }
    }

}
