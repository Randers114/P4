#Pragma config(Motor, motorA, motorLeft, tmotorEV3_Large)
#Pragma config(Motor, motorB, motorRight, tmotorEV3_Large)
#Pragma config(Sensor, S1, tSensorTop, sensorEV3_Touch)
#Pragma config(Sensor, S2, tSensorFront, sensorEV3_Touch)
#Pragma config(Sensor, S3, uSensorLeft, sensorEV3_Ultrasonic)
#Pragma config(Sensor, S4, uSensorRight, sensorEV3_Ultrasonic)


task main() 
{
	motor[motorA] = - (100.0);
	motor[motorB] = - (100.0);
 	sleep(10.0 * 1000);
 stopMotor(motorA);
 stopMotor(motorB);
	motor[motorA] = 100.0;
	motor[motorB] = 100.0;
 	sleep(10.0 * 1000);
 stopMotor(motorA);
 stopMotor(motorB);
} 
