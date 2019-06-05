/* Jacob Gidley, CIS 111-02
 * ------------------------
 * Publication Super Class
 * ------------------------
 * This abstract class will define a general publication
 * such as CDs and books. It will initialize all of the properties
 * of a publication, including title, price, and year. 
 * The class will also contain the absract lookUp method.
 * It wil also print all of the initialized data fields.
 * */

public abstract class Publication
{
  protected String title;
  protected double price;
  protected int year;
  
  // Constuctor 
  public Publication(String t, double p, int y)
  {
    title = t;
    price = p;
    year = y;
  }
  
  // Raises the price by the argument received
  public void priceRaise(double r)
  {
    price += r * price;
  }
  
  // Prints all initialized properties
  public void print()
  {
    System.out.println("Title: " + title);
    System.out.printf("Price: %.2f\n", price);
    System.out.println("Publication Year: " + year);
  }
  // Abstract method to tell sub classes to look up how to use the publication
  public abstract String lookUp();
}