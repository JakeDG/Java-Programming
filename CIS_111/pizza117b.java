/* Exercise 7-14
 * This class will define a pizza 
 * */
public class pizza117b implements Comparable
{
  private String size;
  private double price;
  
  public pizza117b() // overloaded constructor
  {
    size = "L";
    price = 11.00;
  }
    
  public pizza117b(String s, double p) // overloaded constructor
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
  
  public int compareTo(Object o)
  {
    pizza117b pp = (pizza117b)o;
    if (price > pp.price)
    {
      return 1;
    }
    else if (price == pp.price)
    {
      return 0;
    }
    else
    {
      return -1;
    }
  }
}
    