import java.io.*;

public class ex712
{
  public static void main(String[] args) throws IOException
  {
    pizza712 p1 = new pizza712();
    pizza712 p2 = new pizza712();
    
    char size; 
    String topping;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter 1st pizza size (SMLX): ");
    size = (char)System.in.read();
    System.in.read();
    p1.setSize(size);
    System.out.println("Enter 1st topping: ");
    topping = br.readLine();
    p1.setTopping(topping);
  
    System.out.println("Enter 2nd pizza size (SMLX): ");
    size = (char)System.in.read();
    System.in.read();
    p2.setSize(size);
    System.out.println("Enter 2nd topping: ");
    topping = br.readLine();
    p2.setTopping(topping);
    
    System.out.println("\nFirst Pizza " + p1);
    System.out.println("Size = " + p1.getSize());
    System.out.println("Topping = " + p1.getTopping());
    
    System.out.println("\nSecond Pizza " + p2);
    System.out.println("Size = " + p2.getSize());
    System.out.println("Topping = " + p2.getTopping());
    
  }
}