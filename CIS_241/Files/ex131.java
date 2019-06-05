/* Jacob Gidley
 * Exercise 13-1
 * This program will print info into a file
 */
package files13;
import java.io.*;
import java.util.Date;

public class ex131 {

	public static void main(String[] args) throws IOException
	{
		String fileName;
		Date fileTime;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a file to find info about: ");
		fileName = br.readLine();
		File f = new File(fileName);
		if (f.exists())
		{
			System.out.println("Name " + f.getName());
			System.out.println("Parent " + f.getParent());
			System.out.println("Absolute Path = " + f.getAbsolutePath());
			System.out.println("size = " + f.length());
			fileTime = new Date(f.lastModified());
			System.out.println("Time Last Modified " + fileTime);

		}
		else
		{
			System.out.println("File does not exist");
		}
	}

}
