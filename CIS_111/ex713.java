import java.io.*;

public class ex713
{
  public static void main(String[] args) throws IOException
  {
    pizza713 p1 = new pizza713();
    pizza713 p2 = new pizza713();
    
    char size; 
    String topping;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter 1st pizza size (SMLX): ");
    size = (char)System.in.read();
    System.in.read();
    System.out.println("Enter 1st topping: ");
    topping = br.readLine();
    p1 = new pizza713(size, topping);
    
    System.out.println("\nFirst Pizza " + p1);
    p1.printPizza();
    System.out.println("\nSecond Pizza " + p2);
    p2.printPizza();
    
  }
}