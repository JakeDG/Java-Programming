/* Exercise 72
 * This program will execpt two strings and compare them
 * */

import java.io.*;

public class ex72
{
  public static void main(String[] args) throws IOException
  {
    String s1, s2;
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    System.out.println("Enter a string: ");
    s1 = br.readLine();
    System.out.println("Enter a string: ");
    s2 = br.readLine();
     if (s1.equals(s2))
     {
       System.out.println("Same string");
     }
     else if (s1.equalsIgnoreCase(s2))
     {
        System.out.println("Same string - different usage");
     }
     else if (s1.compareTo(s2) > 0)
     {
       System.out.println(s1 + " is greater than " + s2);
     }
     else
     {
       System.out.println(s1 + " is less than " + s2);
     }
     
     System.out.println("Difference is " + s1.compareTo(s2));
  }
}