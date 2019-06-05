/* Jacob Gidley
 * CIS 111-02
 * -------------------------
 * Cube Set and Get Exercise
 * -------------------------
 * This program will ask the user if they wish to change their cube.
 * If they say "yes" then it will have the user input the color, length of side of the cube, 
 * and if the cube is filled or not. It will then send the user defined information to 
 * the CreateCube class. The program will then get all the information from the 
 * CreateCube class and print all the cube's information to the screen.
 * */

import java.io.*; // Import stringBufferedReader
import java.util.Scanner; // Import scanner

public class CubeExercise
{
  public static void main(String[] args) throws IOException
  {
    String change, color;
    double length;
    boolean filled;
    
    Cube c = new Cube(); // Create cube
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create BufferedReader
    Scanner s = new Scanner(System.in); // Create scanner
    
    System.out.println("Would you like to change your cube? Yes or No");
    change = br.readLine(); // Read input
    
    if (change.equalsIgnoreCase("Yes"))
    {
      System.out.println("What is the length of the one side of your cube?"); // Get length of cube side from user
      length = s.nextDouble();
      c.setSideLength(length); // Call setSideLength method
      
      System.out.println("What is the color of your cube?"); // Get color of cube from the user
      color = br.readLine();
      c.setColor(color); // Call setColor method
      
      System.out.println("Is your cube filled or not? True or False?"); // Get is the cube is filled or not
      filled = s.nextBoolean();
      c.setFilled(filled); // Call isfilled method
    }
    
    // Print cube details
    System.out.println("Color: " + c.getColor());
    System.out.println("Filled: " + c.getFilled());
    System.out.printf("Length of side: %.2f\n", c.getSideLength());
    System.out.printf("Volume: %.2f\n", c.getVolume());
    System.out.printf("Surface Area: %.2f\n", c.getSurfaceArea());
    System.out.println("-----------------------------------------");
    
  }
}
 