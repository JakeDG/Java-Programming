/* Exercise 9-4
 * This program will create two account references
 * */

public class ex94
{
  public static void main(String[] args)
  {
    account94 a1, a2;
    
    a1 = new checking94(100);
    a2 = new savings94(200, 1.5);
    
    a1.trans(250.75);
    a2.trans(325.65);
    
    System.out.println("\nal");
    System.out.println(a1);
    System.out.println(a1.getAccountInfo());
    
    System.out.println("\na2");
    System.out.println(a2);
    System.out.println(a2.getAccountInfo());
    // Dynamic method binding
  }
}