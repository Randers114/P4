package codeGenerator;

public class SyncMotor
{

    public SyncMotor(String motor1, String motor2)
    {
        this.motor1 = motor1;
        this.motor2 = motor2;

    }

    public SyncMotor(String motor1, String motor2, double value)
    {
        this(motor1, motor2);
         this.value = value;
    }

    public String motor1;
    public String motor2;
    public double value;

}
