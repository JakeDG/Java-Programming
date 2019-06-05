/* Exercise 9-5
 * This program will create two account references
 * */

public class ex95
{
  public static void main(String[] args)
  {
    
    account94[] a = new account94[2];
    
    a[0] = new checking94(100);
    a[1] = new savings94(200, 1.5);
    
    a[0].trans(250.75);
    a[1].trans(325.65);
    
    for (int i=0; i < a.length; i++)
    {
      System.out.println("\na[" + i + "]");
      System.out.println(a[i]);
      System.out.println(a[i].getAccountInfo());
      // Dynamic method binding
    }
  }
}