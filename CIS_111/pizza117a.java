/* Exercise 7-14
 * This class will define a pizza 
 * */
public class pizza117a
{
  private String size;
  private double price;
  
  public pizza117a() // overloaded constructor
  {
    size = "L";
    price = 11.00;
  }
    
  public pizza117a(String s, double p) // overloaded constructor
  {
    size = s;
    price = p;
  }
  
  public void setPrice(double p)
  {
    price = p;
  }
  
  public String getSize()
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
    