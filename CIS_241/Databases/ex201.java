/* Jacob Gidley
 * exercise 20-1
 * This program will create and fill in a yankees table
 */

package dbms20;
import java.sql.*;
import javax.swing.JOptionPane;

public class ex201 
{
	public static void main(String[] args)
	{
		String url = "jdbc:odbc:baseball";
		Connection con;
		Statement stmt;
		String createstring = "create table yankees " + "(Name varchar(20), " + 
				"POS varchar(2), " + "Num int)";
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		// part 1 - create table
		/*
		try
		{
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			
			stmt.executeUpdate(createstring);
			JOptionPane.showMessageDialog(null, "Yankees table created", "SQL", 
					JOptionPane.INFORMATION_MESSAGE);
			
		*/
		// part 2 - insert records
		try
		{
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			
			stmt.executeUpdate("insert into yankees " + "values('Bernie Williams', 'CF', 51)");
			stmt.executeUpdate("insert into yankees " + "values('Derek Jeter', 'SS', 2)");
			stmt.executeUpdate("insert into yankees " + "values('Mario Rivera', 'P', 42)");
			stmt.executeUpdate("insert into yankees " + "values('Jason Giambi', '1B', 25)");
			stmt.executeUpdate("insert into yankees " + "values('Mike Mussina', 'P', 35)");
			stmt.executeUpdate("insert into yankees " + "values('Alfonso Soriano', '2B', 12)");
			
			stmt.executeUpdate("update yankees " + "set POS = 'DH'" + "where Name = 'Jason Giambi'");
			
			/*
			 * stmt.executeUpdate("delete from yankees " + 
			 * 				"where POS = '2B' " + "and Name = 'Alfonso Soriano'");
			 */
			
			String query = "select * from yankees";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("New York Yankees");
			System.out.println("Name\t\tPOS\tNumber");
			
			while (rs.next())
			{
				String name = rs.getString("Name");
				String pos = rs.getString("POS");
				int num = rs.getInt("Num");
				System.out.println(name + "\t" + pos + "\t" + num);
			}
			
			stmt.close();
			con.close();
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}

