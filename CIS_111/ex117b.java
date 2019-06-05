/* Exercsie 11-7a
 * This program will create a pizza linked list
 */

import java.util.*;
public class ex117b
{
  public static void main(String[] args)
  {
    pizza117b p;
    LinkedList<pizza117b> plist = new LinkedList<pizza117b>();
    ListIterator li;
    
    plist.add(new pizza117b("Large", 11.00));
    p = new pizza117b("Small", 7.00);
    plist.add(p);
    plist.add(new pizza117b("X-Large", 13.00));
    plist.add(new pizza117b("Medium", 9.00));
    
    li = plist.listIterator();
    while (li.hasNext())
    {
      p = (pizza117b)li.next();
      p.setPrice(p.getPrice() + 1);
    }
    
    Collections.sort(plist); // calls compareTo
    
    li = plist.listIterator(); // Reposition at beginning
    
    while(li.hasNext())
    {
      p = (pizza117b)li.next();
      System.out.printf("%s has a price of %.2f\n", p.getSize(), p.getPrice());
    }
  }
}


    