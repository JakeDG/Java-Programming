/* Exercsie 11-7a
 * This program will create a pizza linked list
 */

import java.util.*;
public class ex117a
{
  public static void main(String[] args)
  {
    pizza117a p;
    LinkedList<pizza117a> plist = new LinkedList<pizza117a>();
    ListIterator li;
    
    p = new pizza117a("Small", 7.00);
    plist.add(p);
    plist.add(new pizza117a("Medium", 9.00));
    plist.add(new pizza117a("Large", 11.00));
    plist.add(new pizza117a("X-Large", 13.00));
    
    li = plist.listIterator();
    while (li.hasNext())
    {
      p = (pizza117a)li.next();
      p.setPrice(p.getPrice() + 1);
    }
    
    li = plist.listIterator(); // Reposition at beginning
    
    while(li.hasNext())
    {
      p = (pizza117a)li.next();
      System.out.printf("%s has a price of %.2f\n", p.getSize(), p.getPrice());
    }
  }
}


    