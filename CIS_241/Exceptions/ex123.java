/* Jacob Gidley
 * Exercise 12-3
 * This program will loop far through an array
 */

package Excepts12;
import javax.swing.JOptionPane;

public class ex123 
{

	public static void main(String[] args) 
	{
		int num;
		String line;
		line = JOptionPane.showInputDialog(null, "Enter a grade", "Integer Title", JOptionPane.QUESTION_MESSAGE);
		
	try
	{
		num = Integer.parseInt(line);
		if (num<0 || num > 100)
		{
			throw new ArithmeticException(Integer.toString(num)); 
		}
		
		System.out.println("Grade has been inputted correctly");
			
	}
	catch(NumberFormatException ex)
	{
		System.out.println("Grade must be numeric");
		System.out.println(ex.getMessage());
		ex.printStackTrace();
		num = (int)line.charAt(0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Grade must be between 0 and 100");
		System.out.println(e.getMessage());
		e.printStackTrace();
		num = 30;
	}
	num++;
	System.out.println("One Higher is " + num);
	System.exit(0);

}
}

