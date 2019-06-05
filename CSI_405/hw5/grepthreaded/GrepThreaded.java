package edu.albany.hw5.grepthreaded;

import java.io.*;
import java.util.regex.*;

/* IMPORTANT:
 * My program is meant to be used with a file incorporated in the project that contains this program
 * Also, my program is meant to be run with only the potential 3 arguments of the grep command.
 * For example: -n "Java" test.text, where the -n flag can be included or not
 */ 

public class GrepThreaded extends Thread
{
	int start, end;
	boolean prtLineNum;
	String fileName, strToSearch;
	
	public GrepThreaded(String str, String fName, int st, int end, boolean prt)
	{
		this.fileName = fName;
		this.strToSearch = str;
		this.start = st;
		this.end = end;
		this.prtLineNum = prt;
	}

	public void run()
	{
		Matcher m;
		Pattern p;
		int lineNum = 1;
		String fileLine;
		
		try
		{
			File file = new File(fileName);	// Get input file
			BufferedReader br = new BufferedReader(new FileReader(file)); // Create a buffered reader to read input file
			p = Pattern.compile(strToSearch);	// Compile string pattern
			
			// Loop through file
			while ((fileLine = br.readLine()) != null) 
			{
				m = p.matcher(fileLine);
				
				// If within the range of file line numbers to print and if the string arg is found on the line
				if (lineNum >= start && lineNum <= end && m.find())
				{
					// If true then print file line numbers with corresponding line number, else just print file line
					if(prtLineNum)
						System.out.println(lineNum + ": " + fileLine);
					else
						System.out.println(fileLine);
				}
				lineNum++;
			}
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception
	{	
		int numFileLines = 0;
		File file;
		BufferedReader br;
		String fileLine;
		long startTime;

		// Check for cmd line args amount
		if (args.length < 2 || args.length > 3)
		{
			System.out.println("Error: Wrong number of command line args provided!");
			System.exit(0);
		}
		else if (args.length == 2)
		{
			file = new File(args[1]);	// Get input file
			br = new BufferedReader(new FileReader(file)); // Create a buffered reader to read input file
			
			// Get amount of lines in file 
			while ((fileLine = br.readLine()) != null)
				numFileLines++;
			br.close();
			
			GrepThreaded t1, t2; // Declare threads
			
			// if number of file lines is odd then thread #1 has to examine an extra line
			if ((numFileLines / 2) % 2 != 0)
			{
				// Thread #1 does lines 1 to (numFileLines / 2) + 1, thread #2 does (numFileLines / 2 + 2) to numFileLines
				t1 = new GrepThreaded(args[0], args[1], 1, (numFileLines / 2) + 1, false);
				t2 = new GrepThreaded(args[0], args[1], (numFileLines / 2) + 2, numFileLines, false);
			}
			else	// Both threads examine same number of lines
			{
				// Thread #1 does lines 1 to (numFileLines / 2), thread #2 does (numFileLines / 2) + 1 to numFileLines
				t1 = new GrepThreaded(args[0], args[1], 1, (numFileLines / 2), false);
				t2 = new GrepThreaded(args[0], args[1], (numFileLines / 2) + 1, numFileLines, false);
			}
			
			// Set start time of programs
			 startTime = System.nanoTime();
			 
			// Start the threads
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			
			// Print total program runtime in nanoseconds
			System.out.println("Time elapsed: " + (System.nanoTime() - startTime) + " nanoseconds");
		}
		else
		{
			file = new File(args[2]);	// Get input file
			br = new BufferedReader(new FileReader(file)); // Create a buffered reader to read input file
			
			// Get amount of lines in file 
			while ((fileLine = br.readLine()) != null)
				numFileLines++;
			br.close();
			
			GrepThreaded t1, t2; // Declare threads
			
			// if number of file lines is odd then thread 1 has to examine an extra line (according to directions)
			if ((numFileLines / 2) % 2 != 0)
			{
				// Thread #1 does lines 1 to (numFileLines / 2) + 1, thread #2 does (numFileLines / 2 + 2) to numFileLines
				t1 = new GrepThreaded(args[1], args[2], 1, (numFileLines / 2) + 1, true);
				t2 = new GrepThreaded(args[1], args[2], (numFileLines / 2) + 2, numFileLines, true);
			}
			else	// Both threads examine same number of lines
			{
				// Thread #1 does lines 1 to (numFileLines / 2), thread #2 does (numFileLines / 2) + 1 to numFileLines
				t1 = new GrepThreaded(args[1], args[2], 1, (numFileLines / 2), true);
				t2 = new GrepThreaded(args[1], args[2], (numFileLines / 2) + 1, numFileLines, true);
			}
			
			// Set start time of programs
			 startTime = System.nanoTime();
			 
			// Start the threads
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			
			// Print total program runtime in nanoseconds
			System.out.println("Time elapsed: " + (System.nanoTime() - startTime) + " nanoseconds");
		}
	}
}
