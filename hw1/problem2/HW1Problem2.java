package com.ualbany.hw1.problem2;
import java.util.Random;

public class HW1Problem2 
{
	// Finds if the 1st number arg is a multiple of the second number arg
	public static boolean multiple(int x, int y)
	{
		if (x % y == 0)
			return true;
		else
			return false;
	}
	
	// Returns the remainder of the number arg divided by 7
	public static int reminder(int x)
	{
		return x % 7;
	}
	
	// Finds the distance between two 2D points
	public static double distance(double x1, double y1, double x2, double y2)
	{
		double dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		return dist;
	}
	
	// Simulates 10 coin flips using random numbers, and prints the results.
	public static void coinFlip()
	{
		Random rNum = new Random();
		int rNumCoin;
		
		for(int i = 0; i < 10; i++)
		{
			rNumCoin = rNum.nextInt(10) + 1; // Generates 1-10
			
			// Display results
			if (rNumCoin <= 5) 
				System.out.println("Heads");
			else
				System.out.println("Tails");	
		}
	}
}
