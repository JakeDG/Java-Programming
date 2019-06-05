/* Jacob Gidley
 * Exercise 13-3
 * This program will output to a file using character input streams
 */

package files13;

import java.io.*;
import java.util.Scanner;

public class ex133 
{

	public static void main(String[] args) throws IOException 
	{
		DataInputStream is;
		DataOutputStream os;
		int value;
		String fileNameOut, name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		File fOut;
		System.out.print("Enter output filename: ");
		fileNameOut= br.readLine();
		
		// Write to file
		
		try
		{
			fOut = new File(fileNameOut);
			os = new DataOutputStream(new FileOutputStream(fOut)); // Write whole number at once
			System.out.print("Enter name (<ctrl>z to end): ");
			name = br.readLine();
			while (!name.equals(null))
			{
				System.out.print("Enter a number: ");
				value = sc.nextInt();
				os.writeUTF(name);
				os.writeInt(value);
				System.out.print("Enter name (<ctrl>z to end): ");
				name = br.readLine();
			
			}
			os.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (NullPointerException n)
		{}
		System.out.println("\n" + fileNameOut + " created");
		
		// Read from file
		try 
		{	
			fOut = new File(fileNameOut);
			is = new DataInputStream(new FileInputStream(fOut));
			
			name = is.readUTF();
			while (!name.equals("-1"))
			{
				value = is.readInt();
				System.out.println(name + " " + value);
				name = is.readUTF();
			}
			is.close();
		}
		catch (EOFException ee)
		{}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
