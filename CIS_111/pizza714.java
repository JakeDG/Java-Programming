/* Exercise 7-14
 * This class will define a pizza 
 * */
public class pizza714
{
  private char size;
  private double price;
  
  public pizza714() // overloaded constructor
  {
    size = 'L';
    price = 11.00;
  }
    
  public pizza714(char s, double p) // overloaded constructor
  {
    size = s;
    price = p;
  }
  
  public char getSize()
  {
    return size;
  }
  
  public double getPrice()
  {
    return price;
  }
  
  public void printPizza()
  {
    System.out.println("\nThis Pizza " + this);
    System.out.println("Size = " + size);
    System.out.println("Price = %.2f\n" + price);
  }
  
}
    