/* 
 * Jacob Gidley
 * Exercise 14-1
 * This program will run a horse race
 */

package Threads14;

public class ex141 {

	public static void main(String[] args) 
	{
		raceHorse141 h1 = new raceHorse141("Mr. Ed");
		raceHorse141 h2 = new raceHorse141("Buttercup");
		raceHorse141 h3 = new raceHorse141("Lassie");
		raceHorse141 h4 = new raceHorse141("Jim-E");
		
		int num1, num2, num3, num4;
		num1 = (int)(Math.random() * 10 +1);
		num2 = (int)(Math.random() * 10 +1);
		num3 = (int)(Math.random() * 10 +1);
		num4 = (int)(Math.random() * 10 +1);
		
		System.out.println(num1+ " " + num2 + " " + num3 + " " + num4);
		
		h1.setPriority(num1);
		h2.setPriority(num2);
		h3.setPriority(num3);
		h4.setPriority(num4);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();

	}

}
