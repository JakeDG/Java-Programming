/* Jacob Gidley, Advanced Java, CISS 241-360
 * This class will define a yankee player.
 * Each player has a name, a number, and a position.
 * The class contains "get" methods for each of the 
 * yankee players properties.
 */

package files13;

import java.io.Serializable; 

public class yankees implements Serializable
{
	private static final long serialVersionUID = 7532751864233756487L; // Forced serial ID number for class
	private String name, pos;
	private int num;
	
	// Constructor
	public yankees(String na, String p, int n)
	{
		name = na; // Player name 
		pos = p; // Player position
		num = n; // Player number
	}
	
	// Will return name of player
	public String getname()
	{
		return name;
	}
	
	// Returns player position
	public String getpos()
	{
		return pos;
	}
	
	// Returns player number
	public int getnum()
	{
		return num;
	}
}