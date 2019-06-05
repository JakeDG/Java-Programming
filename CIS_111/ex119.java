/* Exercise 11-9
 * */

import java.util.*;
import java.io.*;

public class ex119
{
  public static void main(String[] args) throws IOException
  {
    SortedMap<String, Integer> list = new TreeMap<String, Integer>();
    Set s;
    Integer num = new Integer(0);
    
    int start = 0, index;
    Iterator li;
    String word;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    list.put("java", 4);
    list.put("jazz", 4);
    list.put("jay", 3);
    list.put("javelin", 7);
    list.put("jaw", 3);
    list.put("jawbone", 7);
    list.put("javel", 5);
    list.put("jaws", 4);
    list.put("javafinch", 9);
    list.put("jax", 3);
    list.put("jazzy", 5);
    
    // Collections.sort(list);
    System.out.print("Enter a word between jav - jaz-: ");
    word = br.readLine();
    num = list.get(word);
    
    if(num != null)
    {
      System.out.println(word + " has " + num + " letters ");
    }
    else
    {
      System.out.println("No word");
    }
      s = list.entrySet();
      li = s.iterator();
      System.out.println("\nHere are all the words");
      while(li.hasNext())
        System.out.println(li.next());
    }
  }

                       
    
   
  
  