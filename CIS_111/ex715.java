import java.io.*;

public class ex715
{
  public static void main(String[] args) throws IOException
  {
    pizza715[] p = new pizza715[4];
    int i;
    boolean found = false;
    
    String size; 
    String topping;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    p[0] = new pizza715("Small", 7.00);
    p[1] = new pizza715("Medium", 9.00);
    p[2] = new pizza715("Large", 11.00);
    p[3] = new pizza715("X-Large", 13.00);
    
    System.out.println("Enter 1st pizza size (Small, Medium, Large, X-Large): ");
    size = br.readLine();
    
    for (i = 0; i < p.length; i++)
    {
      if (size.equalsIgnoreCase(p[i].getSize()))
      {
        System.out.printf("Price is %.2f\n", p[i].getPrice());
        found = true;
        break;
      }
    }
    if (!found)
    {
      System.out.println("We don't sell that size pizza");
    }   
  }
}