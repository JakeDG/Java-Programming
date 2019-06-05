//This program will display 'Hello' followed by the users name.

import java.util.Scanner; //Import scanner
import java.swing.JOptionPane;

public class HelloName
{
  public static void main(String[] args)
  {
    String name;
    
    //Create Scanner
    Scanner royaltyboard = new Scanner (System.in);
    
    //Ask for the users name
    System.out.println ("What is your name?"); 
    name = royaltyboard.nextLine();
    
    //Display users name
    System.out.println ("Hello, " + name + ".");
    
  }

}
    
    