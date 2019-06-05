/* Jacob Gidley
 * Exercise 21-2
 * This program will be a client to send packet messages
 */

package net21;
import java.io.*;
import java.net.*;

public class ex213client 
{
	private int port;
	private InetAddress host;
	
	public ex213client()
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
			DatagramSocket client = new DatagramSocket();
			
			DatagramPacket outdgp = new DatagramPacket(mes.getBytes(), mes.length(), host, port);
			client.send(outdgp);
			client.close();
			
			
			client = new DatagramSocket();
			byte[] buffer = new byte[256];
			DatagramPacket indgp = new DatagramPacket(buffer, buffer.length);
			client.receive(indgp);
			String mes2 = new String(indgp.getData(), 0 , indgp.getLength());
			System.out.println(mes2);
		
			client.close();
		}
		catch(SocketException se)
		{
			se.printStackTrace();
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
		ex213client c = new ex213client();
		c.run(line);
	}
}
