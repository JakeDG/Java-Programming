package edu.albany.hw5.grep;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* IMPORTANT:
 * My program is meant to be used with a file incorporated in the project that contains this program
 * Also, my program is meant to be run with only the potential 3 arguments of the grep command.
 * For example: -n "Java" test.text, where the -n flag can be included or not
 */ 

public class Grep
{
	public static void main(String[] args) throws Exception
	{
		// Set start time of program
		long startTime = System.nanoTime();
						
		int lineNum = 1;
		File file;
		BufferedReader br;
		String fileLine;
		Matcher m;	// Will be used to check file lines for the string being searched for
		Pattern p;	// Will hold the pattern of the string to search
				
		// Check cmd line args amount
		if (args.length < 2 || args.length > 3)
		{
			System.out.println("Error: Wrong number of command line args provided!");
			System.exit(0);
		}
		else if (args.length == 2)	// Do not print line numbers
		{	
			p = Pattern.compile(args[0]);
			file = new File(args[1]);	// Get input file
			br = new BufferedReader(new FileReader(file)); // Create a buffered reader to read input file
			
			while ((fileLine = br.readLine()) != null)
			{
				m = p.matcher(fileLine);
				
				if (m.find())
					System.out.println(fileLine);
			}
			br.close();
		}
		else	// Print line numbers
		{
			p = Pattern.compile(args[1]);
			file = new File(args[2]);	// Get input file
			br = new BufferedReader(new FileReader(file)); // Create a buffered reader to read input file
			
			while ((fileLine = br.readLine()) != null)
			{
				m = p.matcher(fileLine);
				
				if (m.find())
					System.out.println(lineNum + ": " + fileLine);
				
				lineNum++;
			}
			br.close();
		}
		
		// Print total program runtime in nanoseconds
		System.out.println("Time elapsed: " + (System.nanoTime() - startTime) + " nanoseconds");
	}
}
