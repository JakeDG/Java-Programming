/*This program will add two numbers and display them in the variable total.
*/

public class Sum
{
  public static void main (String[]args)
  {
    byte x,y,z;
    short total, overall; //It's a short because the sum is 161
      
    x=62;
    y=99;
   
    total = (short)(x + y);
    overall = (short)(total * 3);
    
    System.out.println ("The total is " + overall);
    
  }
}
    
