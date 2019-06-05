/* Jacob Gidley, CIS 241
 * This  program will create an Spiderman comics 
 * Access Database. It will create a 4 comic records and store 
 * the comic's names, issue #, issue date, issue name,
 * issue value, and whether its in mint condition .
 */

package dbms20;

import java.sql.*;
import javax.swing.JOptionPane;

public class SMComicsDB1 
{
	public static void main (String args[])	
	{
		String url = "jdbc:odbc:SMComics"; // Stores database table name
		Connection con;
		Statement stmt;
		
		// Setup table fields
		String createstring = "create table SMComicsDB " + "(ComicName varchar(30), " + 
				"IssueNumber int, " + "IssueDate varchar(10), " + "IssueName varchar(40), " 
					+ "IssueValue double, " + "MintCondition varchar(20))";
		
		// Check for odbc driver
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		// Create table
		try
		{
			//Connect to database
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			
			stmt.executeUpdate(createstring);
			
			// Let user know that table was created
			JOptionPane.showMessageDialog(null,
				"SMComicsDB table created", "SQL",
					JOptionPane.INFORMATION_MESSAGE);
			
			stmt.close();
			con.close();
		
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		// Create comic records 
		try
		{
			// Connect to database
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			
			// Insert records 
			stmt.executeUpdate("insert into SMComicsDB " + "values('Amazing SM', 89, '10/1/70', 'Doc Ock Lives', 6.50, 'No')");
			stmt.executeUpdate("insert into SMComicsDB " + "values('Spectacular SM', 92, '7/1/84', 'What Is The Answer', 4.50, 'No')");
			stmt.executeUpdate("insert into SMComicsDB " + "values('Web Of Sum', 35, '2/1/88', 'You Can Go Home Again', 4.00, 'No')");
			stmt.executeUpdate("insert into SMComicsDB " + "values('Amazing SM', 382, '10/1/93', 'Emerald Rage', 4.00, 'Yes')");
			
			con.close();
			stmt.close();
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
