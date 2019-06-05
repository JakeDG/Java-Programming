/* Jacob Gidley, CIS 111-02
 * ------------------------
 * CD(audio book) Sub-Class
 * ------------------------
 * This class will define a CD (audio book)
 * The CD will inherit all of the properties from the 
 * publication super class, which will be inputted by the user. 
 * The CD will also have a length of number of minutes associated with its properties,
 * which the user will input aswell.
 * */

public class CD extends Publication // Inherit Super class
{
  private int min;

public CD (int m, int y, String t, double p)
{
  super(t,p,y); // Initialize properties from super class
  min = m;
}

// Tell the user how to use the publication
public String lookUp()
{
  return "\nLook on CD to find topic number.\nSkip to corresponding section";
}

// Print all of the properties of the book when called
public void print()
{
  System.out.println("CD");
  super.print(); // Calls the print method from the super class
  System.out.println("Number of minutes: " + min);
}
}