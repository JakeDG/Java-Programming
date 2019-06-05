/* Jacob Gidley, CIS 241
 * This  program will query the Spiderman comics 
 * Access table. It will query and display the info of all 
 * comics whose issue value is $5 or over and sort them in descending value.
 * It will also query and display the info of all the 
 * Amazing SM comics whose issue value is under 200.
 */

package dbms20;

import java.sql.*;

public class SMComicsDB3 
{
	public static void main(String args[])
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
		
		// Query comic records 
		try
		{
			// Connect to database
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			
			// Query for issue value
			String query = "select ComicName, IssueDate, IssueNumber, IssueValue from SMComicsDB " +
									"where IssueValue >= 5.00 " + "order by IssueValue desc";
			// Query for Amazing SM comics
			String query2 = "select IssueName, ComicName, IssueNumber, IssueDate from SMComicsDB " +
					" where ComicName = 'Amazing SM' AND IssueNumber < 200";
			
			// Result set for issue value query
			ResultSet rs = stmt.executeQuery(query);
			
			String comicName, issueDate, issueName;
			int issueNum;
			double issueValue;
			
			// Print result set
			System.out.println("Comic Name\tIssue Date\tIssue Number\tIssueValue");
			while (rs.next())
			{
				comicName = rs.getString("ComicName");
				issueDate = rs.getString("IssueDate");
				issueNum = rs.getInt("IssueNumber");
				issueValue = rs.getDouble("IssueValue");
				System.out.printf("%-14s%11s%13d%16.2f%n", comicName, issueDate, issueNum, issueValue);
			
			}
			
			System.out.println();
			
			// Result set for Amazing SM query
			rs = stmt.executeQuery(query2);
			
			// Print result set
			System.out.println("Issue Name\t\t\t\t\tComic Name\tIssue Number\tIssueDate");
			while (rs.next())
			{
				issueName = rs.getString("IssueName");
				comicName = rs.getString("ComicName");
				issueNum = rs.getInt("IssueNumber");
				issueDate = rs.getString("IssueDate");
				System.out.printf("%-45s%13s%13d%17s%n", issueName, comicName, issueNum, issueDate);
			}
			
			con.close();
			stmt.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
