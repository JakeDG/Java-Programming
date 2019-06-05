import java.io.*;

public class ex714
{
  public static void main(String[] args) throws IOException
  {
    pizza714[] p = new pizza714[4];
    int i;
    boolean found = false;
    
    char size; 
    String topping;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    p[0] = new pizza714('S', 7.00);
    p[1] = new pizza714('M', 9.00);
    p[2] = new pizza714('L', 11.00);
    p[3] = new pizza714('X', 13.00);
    
    System.out.println("Enter 1st pizza size (SMLX): ");
    size = (char)System.in.read();
    System.in.read();
    size = Character.toUpperCase(size);
   
    for (i = 0; i < p.length; i++)
    {
      if (size == p[i].getSize())
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