/* Exercise 11-8
 * This program will use a treemap to hold names and numbers
 * */

import java.util.*;
import java.io.*;

public class ex118
{
  public static void main(String[] args) throws IOException
  {
    TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int id;
    Set s;
    Iterator it;
    String name;
    
    System.out.print("\nEnter id # (-1 to end): ");
    id = sc.nextInt();
    
    while(id != -1)
    {
      System.out.print("Enter Name: ");
      name = br.readLine();
      map.put(new Integer(id), name); // map.put(id, name) <---- would work as well
      System.out.print("\nEnter id # (-1 to end): ");
      id = sc.nextInt();
    }
    
    System.out.print("\nEnter id to search for name: ");
    
    id = sc.nextInt();
    name = map.get(id);
    if(name != null)
    {
      System.out.println("Name is " + name);
    }
    else
    {
      System.out.println(id + " not found");
    }
    System.out.println();
    
    s = map.entrySet();
    it = s.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
    }
    System.out.println();
  }
}
    
      