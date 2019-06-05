/* Jacob Gidley, CIS 111-02
 * --------------------------------------
 * Random Java Integer Linked List Class
 * --------------------------------------
 * This class will define a java integer. 
 * The integer have and original index value and a random value assigned to it.
 * The class will also be able to compare the random values 
 * that are assigned to the integer.
 * */

public class JavaInt implements Comparable
{
  // Properties
  private int original;
  private int random;
  
  // Constructor
  public JavaInt(int n, int r)
  {
    original = n;
    random = r;
  }
  
  // Returns the original value
  public int getOriginal()
  {
    return original;
  }
  
  // Returns the random value assigned to an integer
   public int getRandom()
  {
    return random;
  }
   
   // Compares the values of the integer objects
   public int compareTo(Object o)
   {
    JavaInt jNum = (JavaInt)o;
    if (random > jNum.random)
    {
      return 1;
    }
    else if (random == jNum.random)
    {
      return 0;
    }
    else
    {
      return -1;
    }
  }
}