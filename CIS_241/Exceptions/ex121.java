/* Jacob Gidley
 * Exercise 12-1
 * This program will loop far through an array
 */

package Excepts12;

public class ex121 {

	public static void main(String[] args) 
	{
		int i;
		int[] values = {1,3,5,7,9};
		try
		{
		
		for(i=0; i <= values.length; i++)
			System.out.println(values[i]);
	
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("You have gone too far!");
		System.out.println(ex.getMessage()); // What
		System.out.println(ex.toString()); // Type
		ex.printStackTrace(); // Where
		System.exit(0);
	}
}
}

