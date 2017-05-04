package abstractSyntaxTree.nodes;

import AVisitor.*;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class AssignNode extends OpNode {
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
