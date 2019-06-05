/* Jacob Gidley
 * Exercise 21-3 Server
 * This program will be a server to receive messages form a client using Datagram socket
 */

package net21;

import java.io.*;
import java.net.*;

public class ex213server
{
	private InetAddress host;
	private int port;
	
	public ex213server()
	{
		try
		{
			host = InetAddress.getLocalHost();
			System.out.println("Server Address is " + host);
			System.out.println("Server Name is " + host.getHostName());
			System.out.println("Server Address is " + host.getHostAddress());
			System.out.println("Server Name is " + host.getCanonicalHostName());
			port = 7777;
		}
		catch(UnknownHostException u)
		{
			u.printStackTrace();
		}
		
	}
	
	public void run()
	{
		try
		{
			DatagramSocket ss = new DatagramSocket(port);
			
			while(true)
			{
			
					byte[] buffer = new byte[256];
					DatagramPacket indgp = new DatagramPacket(buffer, buffer.length);
					ss.receive(indgp);
					String mes = new String(indgp.getData(), 0 , indgp.getLength());
					InetAddress sender = indgp.getAddress();
					System.out.println("Message from " + sender);
					System.out.println(sender.getHostName());
					System.out.println(mes);
					
					String response = "Message Received";
					DatagramPacket outdgp = new DatagramPacket(response.getBytes(), response.length(),
							sender, port);
					ss.send(outdgp);
					
			}
			
			//incoming.close();
			//ss.close();
		}
		catch(SocketException se)
		{
			se.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		ex213server s = new ex213server();
		s.run();
	}

}
