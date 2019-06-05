/* Jacob Gidley, CISS 241
 * This program will read Fahrenheit degrees from an input file 
 * and then convert them into Celsius degree measurements.
 * It will then write the new Celcius measurements into a file.
 */

package files13;

import java.util.*;
import java.io.*;

public class ex134 {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// Store filenames 
		String inFile;
		String outFile;
		
		// Store degrees
		double faht;
		double cels;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ask for input and output file names
		System.out.println("Enter the name of the input file: ");
		inFile = br.readLine();
		
		System.out.println("Enter the name of the output file: ");
		outFile = br.readLine();
		
		// Connect Scanner to the input file
		Scanner sc = new Scanner(new FileReader(inFile));
		
		// Connect PrintWriter to output file
		PrintWriter pw = new PrintWriter(outFile);
		
		while (sc.hasNext()) 
		{
			faht = sc.nextDouble();
			cels = (faht - 32) / 1.8; // Convert to Celsius
			pw.printf(faht + " Fahrenheit = %.3f Celsius\n", cels);
		}
		
		pw.close(); // Close output file

	}

}
