/* Jacob Gidley
 * Exercise 13-2a
 * This program will output to a file using character input streams
 */

package files13;

import java.io.*;

public class ex132b {

	public static void main(String[] args) throws IOException 
	{
		InputStream is;
		OutputStream os;
		int value;
		String fileNameIn, fileNameOut;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		File fIn, fOut;
		
		System.out.print("Enter in put filename: ");
		fileNameIn= br.readLine();
		
		System.out.print("Enter output filename: ");
		fileNameOut= br.readLine();
		
		try
		{
			fIn = new File(fileNameIn);
			fOut = new File(fileNameOut);
			is = new FileInputStream(fIn);
			os = new FileOutputStream(fOut);
			// System.out.print("Enter names and numbers (<ctrl>z to end): ");
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
