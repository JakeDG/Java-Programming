/* Jacob Gidley
 * Exercise 13-6
 * This class will create a pizza object 
 * and read and write it to a file
 */

package files13;


import java.io.*;

public class ex136 {

	public static void main(String[] args) 
	{
		pizza136 p1 = new pizza136('L', 11.00);
		pizza136 p2;
		
		try
		{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("pizza.txt"));
			os.writeObject(p1);
			
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("pizza136.txt"));
			p2 = (pizza136)is.readObject();
			
			System.out.println("Pizza size is " + p2.getSize());
			System.out.printf("Pizza price is %.2f\n", p2.getPrice());
			
			os.close();
			is.close();
		}
		catch(EOFException e1)
		{}
		catch(FileNotFoundException e2)
		{
			e2.printStackTrace();
		}
		catch(IOException e3)
		{
			e3.printStackTrace();
		}
		catch(ClassNotFoundException e4)
		{
			e4.printStackTrace();
		}

	}

}
