/* Jacob Gidley
 * This program will be a server that receives a file request from a client.
 * It then reads from the file the client requested and transmits 
 * to the clients computer line by line over a socket. If the file doesn't exist the 
 * server lets the client sends a message saying so.
 */

package net21;

import java.io.*;
import java.net.*;

public class FileServer
{
	private InetAddress host;
	private int port;
	
	public FileServer()
	{
		try
		{
			// Display server information
			host = InetAddress.getLocalHost();
			System.out.println("Server Address is " + host);
			System.out.println("Server Name is " + host.getHostName());
			System.out.println("Server Address is " + host.getHostAddress());
			System.out.println("Server Name is " + host.getCanonicalHostName());
			port = 7774;
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
			Socket incoming = ss.accept();
			
			// Printwriter connected to client's output stream
			PrintWriter pw = new PrintWriter(incoming.getOutputStream(), true);
			pw.println("Connected to Server!");
			
			// Read filename from client
			BufferedReader br = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			String fileName = br.readLine();
			
			File file = new File(fileName);
			
			// Test file existence on server
			if (file.exists())
			{
				// Read  file over socket to the client
				FileInputStream is = new FileInputStream(file);
				BufferedReader brFile = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				String fileOut = brFile.readLine();
				while (fileOut != null)
				{
					pw.println(fileOut);
					fileOut = brFile.readLine();
						
				}
					
			}
			else
			{
				// Send message if file does not exist
				pw.println("File does not exist.");
			}
				
			// Close the sockets
			incoming.close();
			ss.close();
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		FileServer s = new FileServer();
		s.run();
	}

}
