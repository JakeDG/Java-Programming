package com.ualbany.hw1.problem2;
import java.util.Scanner;

public class Problem2Driver extends HW1Problem2
{
	public static void main(String[] args)
	{
		// Create scanner
		Scanner scan = new Scanner(System.in);
		
		int input; // Used for user input
		
		// Keep asking user for input
		do
		{
			// Display "menu" options
			System.out.println("\n0 - To End Program");
			System.out.println("1 - Multiple");
			System.out.println("2 - Remainder");
			System.out.println("3 - Distance");
			System.out.println("4 - Coin Flips");
			System.out.print("Please select an option: ");
			
			// Get user input choice
			input = scan.nextInt();
			
			
			switch(input)
			{
				case 0: // User chooses to end the program
				{
					System.out.println("Shutting down...");
					scan.close(); // Close the scanner
					System.exit(0); // Shutdown program
				}
				case 1:	// User chooses to use multiple method
				{
					int input1;
					int input2;
					
					// Get number parameters from user for multiple
					System.out.print("Please enter the 1st integer: ");
					input1 = scan.nextInt();
					System.out.print("Please enter the 2nd integer: ");
					input2 = scan.nextInt();
					
					// Display results
					if (multiple(input1, input2))
					{
						System.out.println(input1 + " is a multiple of " + input2);
					}
					else
					{
						System.out.println(input1 + " is NOT a multiple of " + input2);
					}
					break;
				}
				case 2:	// User chooses remainder method
				{
					int input1;
					
					// Get number parameters from user for remainder
					System.out.print("Please enter an integer: ");
					input1 = scan.nextInt();
					
					// Display results
					System.out.println("Remainder: " + reminder(input1));
					break;
				}
				case 3: // User chooses distance method
				{
					double input1;
					double input2;
					double input3;
					double input4;
					
					// Get number parameters from user for distance
					System.out.print("Please enter the 1st x coordinate: ");
					input1 = scan.nextDouble();
					System.out.print("Please enter the 1st y coordinate: ");
					input2 = scan.nextDouble();
					System.out.print("Please enter the 2nd x coordinate: ");
					input3 = scan.nextDouble();
					System.out.print("Please enter the 2nd y coordinate: ");
					input4 = scan.nextDouble();
					
					// Display results
					System.out.println("Distance: " + distance(input1,input2,input3,input4));
					break;
				}
				case 4: // User chooses coin flip method
				{
					coinFlip(); // Simulate a coin toss 10 times
					break;
				}
				default: // User enter invalid input
				{
					System.out.println("Invalid input!");
					break;
				}
			}
		} while (true);
	}
}
