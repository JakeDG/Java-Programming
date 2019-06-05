/* Jacob Gidley
 * Exercise 20-2a
 * This program will query the yankees table
 */

package dbms20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ex202a 
{
	public static void main(String[] args)
	{
		String url = "jdbc:odbc:baseball";
		Connection con;
		Statement stmt;
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		try
		{
			con = DriverManager.getConnection(url, "", "");
			stmt = con.createStatement();
			String query = "select Name, Num, POS from yankees " +
					"where Num < 20 " + "order by POS asc";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Yankees with uniform numbers less than 20");
			String name, pos;
			int num;
			
			while(rs.next())
			{
				name = rs.getString("Name");
				pos = rs.getString("POS");
				num = rs.getInt("Num");
				System.out.println(name + " " + num + " " + pos);
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
