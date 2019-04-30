package edu.albany.hw2.morse;

import java.util.Scanner;

public class MorseCodeTest 
{
	public static void main(String[] args)
	{
		String input; // Stores users input
		
		// Create the Morse code generator
		MorseCodeGenerator mGen = new MorseCodeGenerator();
		
		// Check for cmd line args
		if (args.length > 0)
		{
			// Loop through the string argumnets
			for(String arg: args)
			{
				System.out.println(arg + " | " + mGen.translate(arg));
			}
		}
		else
		{
			// Create scanner for input
			Scanner scan = new Scanner(System.in);
			
			// Get user input
			System.out.println("Enter a string to convert:");
			input = scan.nextLine();
			
			// Display Morse code translation of user input
			System.out.println("Translation to Morse Code:");
			System.out.println(mGen.translate(input));
			
			scan.close();
		}
	}
}
