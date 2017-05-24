#pragma config(Motor, motorA, motorLeft, tmotorEV3_Large)
#pragma config(Motor, motorB, motorRight, tmotorEV3_Large)
#pragma config(Motor, motorC, motorFront, tmotorEV3_Large)
#pragma config(Sensor, S1, tSensorTop, sensorEV3_Touch)
#pragma config(Sensor, S2, tSensorFront, sensorEV3_Touch)
#pragma config(Sensor, S3, uSensorLeft, sensorEV3_Ultrasonic)
#pragma config(Sensor, S4, uSensorRight, sensorEV3_Ultrasonic)

void TurnLeft(float speed); 
void TurnRight(float speed); 

task main() 
{
	float b = u;
	float speed = 75.0;
	float backSpeed = 20.0;
	float turningSpeed = 35.0;
	bool isRunning = false;
	while (! (isRunning))
	{
		if(getTouchValue(S1))
		{
			isRunning = true; 
		}
		sleep(100.0);
	}
	while (isRunning)
	{
		motor[motorA] = speed;
		motor[motorB] = speed;
		if(getTouchValue(S2))
		{
			stopMotor(motorA);
			stopMotor(motorB);
			motor[motorA] = - (backSpeed);
			motor[motorB] = - (backSpeed);
 			sleep(2.0 * 1000);
			stopMotor(motorA);
			stopMotor(motorB);
			if(getUSDistance(S3) > getUSDistance(S4))
			{
				TurnLeft(turningSpeed);
			}
			else if(getUSDistance(S3) < getUSDistance(S4))
			{
				TurnRight(turningSpeed);
			}
			else
			{
				TurnLeft(turningSpeed);
			} 
			for ( int i = 1.0 ; i <20.0 ; i++ )
			{ 
				if(getTouchValue(S1))
				{
					isRunning = false; 
				}
				sleep(100.0);
			}
		}
	}
} 

void TurnLeft(float speed)
{
	motor[motorA] = - (speed);
	motor[motorB] = - (speed);
	motor[motorC] = - (speed);
 	sleep(3.0 * 1000);
	stopMotor(motorA);
	stopMotor(motorB);
	stopMotor(motorC);
}

void TurnRight(float speed)
{
	motor[motorA] = - (speed);
	motor[motorC] = - (speed);
 	sleep(3.0 * 1000);
	stopMotor(motorA);
	stopMotor(motorC);
	motor[motorA] = speed;
	motor[motorC] = speed;
}
