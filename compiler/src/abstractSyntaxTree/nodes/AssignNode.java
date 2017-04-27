package abstractSyntaxTree.nodes;

import AVisitor.Visitor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class AssignNode extends OpNode {
    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
