/* Jacob Gidley, CIS 111-02
 * ------------------------
 * Publication Main Class
 * ------------------------
 * This program will print a publications info based on the users input.
 * It will ask the user for the title, price, and year. It will also ask 
 * if the publication is a book or a CD, and ask for the number of pages or minutes.
 * The program will then collect all the information and raise the price 10%
 * and print all the publication's info, as well as how to use the it.
 * */

//Import stringBufferedReader
import java.io.*; 
import java.util.Scanner; //Import scanner

public class PubMain
{
  public static void main(String[] args) throws IOException
  {
    int i, j, year, pages, minutes;
    String title, c = "";
    double price, raise;
    
    //Create stringBufferedReader, inputStreamReader, and Scanner
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many publications are you looking for?");
    j = sc.nextInt();
    
    Publication[] pubArray = new Publication[j]; // Create array that contains the number of publications the user is looking for
    
    
    // Get publication info from user
    for(i = 0; i < pubArray.length; i++)
    {
      System.out.println("Enter title:");
      title = br.readLine();
      
      System.out.println("Enter price:");
      price = sc.nextDouble();
      System.out.println("Enter year of publication:");
      year = sc.nextInt();
      
      System.out.println("Is the publication a Book(b) or a CD(c)?");
      c = br.readLine(); 
      
      while (!c.equalsIgnoreCase("b") && !c.equalsIgnoreCase("c"))
      {
        System.out.println("Is the publication a Book(b) or a CD(c)?");
        c = br.readLine();
      }
      
      if (c.equalsIgnoreCase("b"))
      {
        System.out.println("Enter number of pages:");
        pages = sc.nextInt();
        pubArray[i] = new Book(pages, year, title, price); // Create book object
      }
      else if (c.equalsIgnoreCase("c"))
      {
        System.out.println("Enter number of minutes");
        minutes = sc.nextInt();
        pubArray[i] = new CD(minutes, year, title, price); // Create CD object
      }
    }
      
    for (i = 0; i < pubArray.length; i++)
      {
        raise = .10;
        pubArray[i].priceRaise(raise); // Raise price of publication by 10%
        System.out.println("------------------------------------------\n");
        pubArray[i].print(); // Print publication info
        System.out.println(pubArray[i].lookUp()); // Print how to use the publication
        System.out.println();
      }    
  }
}
