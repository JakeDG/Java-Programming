/* Jacob Gidley, Advanced Java, CISS 241-360
 * This program will read objects from
 * a yankees.yanks file and get their properties.
 * Then it will write their properties character by character in
 * plain ASCII text to an output file called yankees.txt
 */

package files13;

import java.io.*;
import files13.yankees;

public class yanksMain 
{

	public static void main(String[] args) 
	{
		FileOutputStream os;
		yankees yank;
		String name, pos, numStr;
		int num, i;
		
		try
		{	
			os = new FileOutputStream("yankees.txt"); // Output file
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("yankees.yanks")); // Input File
			yank = (yankees)is.readObject();
			
			while (yank != null) // Runs until object is null
			{
				name = yank.getname(); // Player name
				pos = yank.getpos();	// Player position
				num = yank.getnum(); // Player number
				
				
				// Write name to file
				for (i = 0; i < name.length(); i++)
				{
					os.write(name.charAt(i));
				}
				
				os.write(' ');
				
				numStr = Integer.toString(num); // Change player num to a string
				
				// Write number to file
				for (i = 0; i < numStr.length(); i++)
				{
					os.write(numStr.charAt(i));
				}
				
				os.write(' ');
				
				// Write position to file
				for (i = 0; i < pos.length(); i++)
				{
					os.write(pos.charAt(i));
				}
				
				os.write('\n');
				
				yank = (yankees)is.readObject(); // Read next object
			}
			
			// Close input and output streams
			is.close();
			os.close();
			   
		}
		
		// Catch exceptions
		
		catch(EOFException e1)
		{
			System.exit(1);
		}
		
		catch(FileNotFoundException e2)
		{
			e2.printStackTrace();
			System.exit(1);
		}
		
		catch(IOException e3)
		{
			e3.printStackTrace();
			System.exit(1);
		}
		
		catch(ClassNotFoundException e4)
		{
			e4.printStackTrace();
			System.exit(1);
		}

	}

}
