/* Jacob Gidley, CIS 241
 * This  program will update the Spiderman comics 
 * Access Database. It will create a 5 more comic records
 * update 3 of the previous records, and delete a record
 */

package dbms20;

import java.sql.*;

public class SMComicsDB2 
{
	public static void main (String args[])	
	{
		String url = "jdbc:odbc:SMComics"; // Stores database table name
		Connection con;
		Statement stmt;
		
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
		
		// Update comic records 
		try
		{
			// Connect to database
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			
			// Insert record
			stmt.executeUpdate("insert into SMComicsDB " + "values ('Amazing SM', 400, '4/1/95', 'A Death In The Family', 5.00, 'Yes')");
			stmt.executeUpdate("insert into SMComicsDB " + "values ('Spectacular SM', 37, '12/1/79', 'Into The Hive', 6.00, 'No')");
			stmt.executeUpdate("insert into SMComicsDB " + "values ('Amazing SM', 194, '7/1/79', 'Never Let The Black Cat Cross Your Path', 10.00, 'No')");
			stmt.executeUpdate("insert into SMComicsDB " + "values ('Web Of Sum', 125, '6/1/95', 'Searching', 4.00, 'Yes')");
			
			// Update records
			stmt.executeUpdate("update SMComicsDB " + "set IssueValue = 7.00 " + "where ComicName = 'Amazing SM' AND IssueNumber = 89 ");
			stmt.executeUpdate("update SMComicsDB " + "set IssueValue = 5.00 " + "where ComicName = 'Spectacular SM' AND IssueNumber = 92 ");
			stmt.executeUpdate("update SMComicsDB " + "set IssueName = 'What Is The Answer?' " + "where ComicName = 'Spectacular SM' AND IssueNumber = 92 ");
			
			// Delete record
			stmt.executeUpdate("delete from SMComicsDB " + "where ComicName = 'Amazing SM' AND IssueNumber = 382 ");
			
			// Insert record
			stmt.executeUpdate("insert into SMComicsDB " + "values ('Amazing SM', 0, '11/24/15', 'Jacob Gidley', 5.00, 'Yes')");
			
			con.close();
			stmt.close();
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
