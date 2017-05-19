package codeGenerator;

import abstractSyntaxTree.nodes.*;

public class SyncMotor
{

    public SyncMotor(Node motor1, Node motor2)
    {
        this.motor1 = motor1;
        this.motor2 = motor2;

    }

    public SyncMotor(Node motor1, Node motor2, Double value)
    {
        this(motor1, motor2);
         this.value = value;
    }

    public Node motor1;
    public Node motor2;
    public Double value;

}
