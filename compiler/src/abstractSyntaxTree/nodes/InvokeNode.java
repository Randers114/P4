package abstractSyntaxTree.nodes;


import AVisitor.Visitor;

public class InvokeNode extends Single{
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
