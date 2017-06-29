#pragma config(Motor, motorB, motorLeft, tmotorEV3_Large)
#pragma config(Motor, motorC, motorRight, tmotorEV3_Large)
#pragma config(Sensor, S4, uSensor, sensorEV3_Ultrasonic)

const int MAX_ARRAY_LENGTH = 100;
const int ARRAY_START_INDEX = 1;

float listen[MAX_ARRAY_LENGTH];
float listHHH[MAX_ARRAY_LENGTH];
float jjjjj[MAX_ARRAY_LENGTH];
void TurnInPlace(float speed); 
void AddValueToArray(int arrayNumber, float value);
void DeleteValueFromArray(int arrayNumber);
float *GetArrayAdress(int arrayNumber);

task main() 
{
listen[0] = ARRAY_START_INDEX;
listHHH[0] = ARRAY_START_INDEX;
jjjjj[0] = ARRAY_START_INDEX;
	float speed = 75.0;
	float dangerSpeed = 35.0;
	float minimumDisantance = 15.0;
	float dangerDistance = 35.0;
	float maxTurns = 10.0;
	float actualTurns = 0.0;
				AddValueToArray(0,10.0);
	AddValueToArray(1,15.0);
	listen[0.0];
	DeleteValueFromArray(0);
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
void AddValueToArray(int arrayNumber, float value){
	float *array = GetArrayAdress(arrayNumber);
	if(array[0] == MAX_ARRAY_LENGTH){
		return;
	} else {
		array[array[0]] = value;
		array[0]++;
 	} 
 }
void DeleteValueFromArray(int arrayNumber){
	float *array = GetArrayAdress(arrayNumber);
	 array[array[0]] = 0;
	 if(array[0]!= 1)
	 {array[0]--;}
}
float *GetArrayAdress(int arrayNumber){
	switch(arrayNumber){
		case 0:
 			 return &listen;
		case 1:
 			 return &listHHH;
		case 2:
 			 return &jjjjj;
		default: return NULL;
	}
}