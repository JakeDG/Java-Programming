/* Jacob gidley
 * Exercise 21-1
 * This program will look up a file of web addresses
 */

package net21;

import java.io.*;
import java.util.Date;
import java.net.*;

public class ex211 
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File urlfile;
		FileReader fr;
		URL add;
		URLConnection addcon;
		BufferedReader brfr;
		String line;
		Date last;
		int size;
		System.out.print("Enter file name of urls: ");
		filename = br.readLine();
	
		try
		{
			urlfile = new File(filename);
			fr = new FileReader(urlfile);
			brfr = new BufferedReader(fr);
			line = brfr.readLine();
			while(line != null)
			{
				try
				{
					add = new URL(line);
					addcon = add.openConnection();
					last = new Date(addcon.getLastModified());
					System.out.println(add + " last modified on " + last);
					size = addcon.getContentLength();
					System.out.println(add + " is size of " + size);
					System.out.println();
				}
				catch(MalformedURLException x)
				{
					x.printStackTrace();
				}
				line = brfr.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
