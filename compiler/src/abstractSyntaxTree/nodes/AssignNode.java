package abstractSyntaxTree.nodes;

import visitor.*;

public class AssignNode extends OpNode {
    @Override
    public Object Accept(Visitor visitor) {
        return visitor.Visit(this);
    }
}
