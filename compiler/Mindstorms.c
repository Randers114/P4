#pragma config(Motor, motorB, motorLeft, tmotorEV3_Large)
#pragma config(Motor, motorC, motorRight, tmotorEV3_Large)
#pragma config(Sensor, S4, uSensor, sensorEV3_Ultrasonic)

void TurnInPlace(float speed); 

task main() 
{
	float speed = 75.0;
	float dangerSpeed = 35.0;
	float minimumDisantance = 15.0;
	float dangerDistance = 35.0;
	float maxTurns = 10.0;
	float actualTurns = 0.0;
	while (actualTurns < maxTurns)
	{
		while (getUSDistance(S4) < dangerDistance)
		{
			motor[motorB] = speed;
			motor[motorC] = speed;
		}
		motor[motorB] = dangerSpeed;
		motor[motorC] = dangerSpeed;
		if(getUSDistance(S4) > minimumDisantance)
		{
			stopMotor(motorB);
			stopMotor(motorC);
			TurnInPlace(dangerSpeed);
			actualTurns = actualTurns + 1.0; 
		}
	}
} 

void TurnInPlace(float speed)
{
	motor[motorB] = speed;
	motor[motorC] = ((- 100.0) / 100) * (speed);
 	sleep(3.0 * 1000);
	stopMotor(motorB);
	stopMotor(motorC);
}
