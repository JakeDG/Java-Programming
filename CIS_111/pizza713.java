/* Exercise 7-13
 * This class will define a pizza 
 * */
public class pizza713
{
  private char size;
  private String topping;
  
  public pizza713() // overloaded constructor
  {
    size = 'L';
    topping = "Cheese";
  }
    
  public pizza713(char s, String t) // overloaded constructor
  {
    size = s;
    topping = t;
  }
  
  public char getSize()
  {
    return size;
  }
  
  public String getTopping()
  {
    return topping;
  }
  
  public void printPizza()
  {
    System.out.println("\nThis Pizza " + this);
    System.out.println("Size = " + size);
    System.out.println("Topping = " + topping);
  }
  
}
    