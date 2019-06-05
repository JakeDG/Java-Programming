/* Jacob Gidley
 * Exercise 12-2
 * This program will input and parse an integer
 */

package Excepts12;
import javax.swing.JOptionPane;

public class ex122 
{

	public static void main(String[] args) 
	{
		int num;
		String line;
		line = JOptionPane.showInputDialog(null, "Enter an Integer", "Integer Title", JOptionPane.QUESTION_MESSAGE);
		
	try
	{
		num = Integer.parseInt(line);
	}
	catch(NumberFormatException ex)
	{
		System.out.println(ex.getMessage());
		ex.printStackTrace();
		num = (int)line.charAt(0);
	}
	num++;
	System.out.println("One Higher is " + num);
	System.exit(0);

}
}

