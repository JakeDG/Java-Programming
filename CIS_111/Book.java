/* Jacob Gidley, CIS 111-02
 * ------------------------
 * Book Sub-Class
 * ------------------------
 * This class will define a book
 * The book will inherit all of the properties from the 
 * publication super class, which will be inputted by the user. 
 * The book will also have a number of pages associated with its properties, 
 * which the user will input aswell.
 * */

public class Book extends Publication // Inherit Super class
{
  private int pages;
  
  public Book(int pa, int y, String t, double p)
  {
    super(t,p,y); // Initialize properties from super class
    pages = pa;
  }
  
  // Tell the user how to use the publication 
  public String lookUp()
 {
   return "\nOpen the book to Table of Contents.\nLook up topic and turn to the corresponding page.";
 }
 
  // Print all of the properties of the book when called
  public void print()
 {
   System.out.println("Book");
   super.print(); // Calls the print method from the super class
   System.out.println("Number of pages: " + pages);
 }
}