package codeGenerator;

import abstractSyntaxTree.nodes.*;

public class SyncMotor
{

    public SyncMotor(IdentifierNode motor1, IdentifierNode motor2)
    {
        this.motor1 = motor1;
        this.motor2 = motor2;

    }

    public SyncMotor(IdentifierNode motor1, IdentifierNode motor2, Node value)
    {
        this(motor1, motor2);
         this.value = value;
    }

    public IdentifierNode motor1;
    public IdentifierNode motor2;
    public Node value;

}
