/* Jacob Gidley
 * Exercise 20-2b
 * This program will query the yankees table
 */

package dbms20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ex202b 
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
			
			String position = JOptionPane.showInputDialog(null, "Enter Position", "POS Query",
							JOptionPane.QUESTION_MESSAGE);
			
			String query = "select Name, Num, POS from yankees " +
					"where POS = '" + position + "'";
			
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Yankees playing " + position);
			String name, pos;
			int num;
			
			while(rs.next())
			{
				name = rs.getString("Name");
				num = rs.getInt("Num");
				System.out.println(name + " " + num);
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
