/* Jacob Gidley
 * Exercise 13-2a
 * This program will output to a file using character input streams
 */

package files13;

import java.io.*;

public class ex132a {

	public static void main(String[] args) throws IOException 
	{
		InputStream is;
		OutputStream os;
		int value;
		String fileNameOut;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		File fOut;
		System.out.print("Enter output filename: ");
		fileNameOut= br.readLine();
		
		try
		{
			fOut = new File(fileNameOut);
			is = System.in;
			os = new FileOutputStream(fOut);
			System.out.print("Enter names and numbers (<ctrl>z to end): ");
			value = is.read();
			while (value != -1)
			{
				os.write(value);
				value = is.read();
			}
			is.close();
			os.close();
			System.out.println("\n" + fileNameOut + " created");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
