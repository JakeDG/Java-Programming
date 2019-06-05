/* Jacob Gidley
 * Exercise 21-2
 * This program will be a client to send messages
 */

package net21;
import java.io.*;
import java.net.*;

public class ex212client 
{
	private int port;
	private InetAddress host;
	
	public ex212client()
	{
		try
		{
			port = 7777;
			host = InetAddress.getByName("bt204in.hvcc.edu");
		}
		catch(UnknownHostException u)
		{
			u.printStackTrace();
		}
	}
	
	public void run(String mes)
	{
		try
		{
		Socket client = new Socket(host, port);
		
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		pw.println(mes);
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		String back = br.readLine();
		System.out.println(back);
		
		client.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		String line;
		BufferedReader brin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Messages: ");
		line = brin.readLine();
		ex212client c = new ex212client();
		c.run(line);
	}
}
