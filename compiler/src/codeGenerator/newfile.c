#Pragma config(Motor, motorA, M1, tmotorEV3_Large)
#Pragma config(Motor, motorB, M2, tmotorEV3_Large)
#Pragma config(Motor, motorC, M3, tmotorEV3_Large)
#Pragma config(Sensor, S1, S1sensorEV3_Touch)
#Pragma config(Sensor, S2, S2sensorEV3_Ultrasonic)
#Pragma config(Sensor, S3, S3sensorEV3_Ultrasonic)

float hey(float v, float m); 
bool hh(); 

task main() 
{
	bool aaa = 10.0 > 5.0 && 14.0 < 20.0 || true;
	Sleep(500.0);
	float x = 5.0;
	float z;
	bool u = true;
	bool y;
	bool ehhehe = 	getTouchValue(S1);
	motor[motorA] = 100.0;
	motor[motorB] = 0.5 * (100.0);
	motor[motorA] = - 5.0 + 1.0 * (10.0 + 10.0);
	motor[motorB] = 1.0 * (5.0 + 1.0 * (10.0 + 10.0));
	motor[motorB] = 10.0;
	motor[motorC] = 10.0, 10.0;
	motor[motorA] = - 10.0, 10.0;
	motor[motorB] = 1.0 * (10.0), 10.0;
	if(aaa)
	{
		float b = 25.0;
		float a = 30.0;
		a = a + b * b + (25.0 + b); 
	}
	else
	{
		float a = 10.0;
		while (a < 10.0)
		{
			for ( int i =  ; i <10.0 ; i++ )
			{ 
				float b;
			}
			float b = 10.0;
		}
	} 
	if(aaa)
	{
		float g = hey(25.0, 100.0) + 5.0;
	}
	else if(hh() || aaa && true)
	{
		float a = 10.0;
		float b = 10.0;
		a = hey(a, b); 
	}
} 

float hey(float v, float m)
{
	float a = v + m;

	return v + m;
}

bool hh()
{
	bool l = true;

	return l;
}
