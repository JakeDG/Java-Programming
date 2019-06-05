/* Jacob Gidley
 * Exercise 21-2 Server
 * This program will be a server to recieve messages form a client using TCP/IP socket
 */

package net21;

import java.io.*;
import java.net.*;

public class ex212server
{
	private InetAddress host;
	private int port;
	
	public ex212server()
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
			ServerSocket ss = new ServerSocket(port);
			
			while(true)
			{
			
			Socket incoming = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			String mes = br.readLine();
			System.out.println("Message from " + incoming.getInetAddress().getHostName());
			System.out.println(mes);
			PrintWriter pw = new PrintWriter(incoming.getOutputStream(), true);
			pw.println("Message Received");
			}
			
			//incoming.close();
			//ss.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		ex212server s = new ex212server();
		s.run();
	}

}
