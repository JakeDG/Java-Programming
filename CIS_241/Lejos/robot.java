/* Jacob Gidley, CIS 241
* This program will run on a lejos lego robot.
* The robot will use an ultrasonic sensor to detect when
* things are infront of it. The robot will travel around
* the front row desks, turn right, and then accelerate up to
* a predetermined speed and travel toward Prof. Wohlleber's desk.
* Once there it will detect the desk or anything in its path, stop,
* backup, and then turn around.
*/

import lejos.nxt.*;
import lejos.util.*;

public class robot

{

        public static void main(String[] args)

        {
				UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
				UltrasonicSensor sonic2 = new UltrasonicSensor(SensorPort.S1);
				sonic.setMode(UltrasonicSensor.MODE_CONTINUOUS); // Sensor constantly tests distance of objects in front of it
				int i;

				// Display start message
				Sound.beep();
                LCD.drawString("Go Giants!", 0, 0);
                Delay.msDelay(2000);

				// Move forward for 7 seconds
                Motor.A.forward();
                Motor.C.forward();
                Delay.msDelay(7000);

				// Turn right and stop
                Motor.A.setSpeed(100);
                Motor.C.setSpeed(300);
                Delay.msDelay(1650);
                Motor.A.flt();
                Motor.C.flt();

				// Move forward again
				Sound.buzz();
				LCD.drawString("Dynamic Method Binding!", 0, 0);
				Motor.A.setSpeed(100);
				Motor.C.setSpeed(100);
				Motor.A.forward();
                Motor.C.forward();
                Delay.msDelay(750);

				// Accelerate
                for(i = 100; i<= 600; i=i+100)
                {
					Motor.A.setSpeed(i);
                	Motor.C.setSpeed(i);
                	Delay.msDelay(500);
				}

				// Move toward the desk
				while (!Button.ESCAPE.isDown())
				{
					if ((sonic.getDistance() < 30) || (sonic2.getDistance() < 13))
					{
						// Stop and Backup
						Sound.buzz();
						Motor.A.flt();
						Motor.C.flt();
						LCD.drawString("Reversing", 0,0);
						Motor.A.backward();
						Motor.C.backward();
						Delay.msDelay(1000);

						// Turn around
						Sound.beep();
						Motor.A.forward();
						Motor.C.backward();
						Delay.msDelay(750);

						// Go straight
						Sound.beep();
						LCD.drawString("Retreat!", 0,0);
						Motor.C.forward();
					}
					/*
					if ((sonic.getDistance() > 12) && (sonic.getDistance() < 20))
					{
						Sound.beep();
						Sound.beep();
						LCD.drawString("Outta my way!", 0,0);
						Motor.A.setSpeed(400);
						Delay.msDelay(1000);

						// Turn and re-adjust
						Motor.A.setSpeed(600);
						Motor.C.setSpeed(400);
						Delay.msDelay(1000);

						Motor.A.setSpeed(400);
						Motor.C.setSpeed(600);
						Delay.msDelay(500);

						Motor.A.setSpeed(600);
						Motor.C.setSpeed(600);

						// Go straight
						Sound.beep();
						LCD.drawString("Retreat!", 0,0);
						Motor.A.forward();

					}
*/
				}

        }

}