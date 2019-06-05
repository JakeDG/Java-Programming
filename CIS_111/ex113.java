/* Exercise 11-3
 * */

import java.util.*;
import java.io.*;

public class ex113
{
  public static void main(String[] args) throws IOException
  {
    ArrayList<String> list = new ArrayList<String>();
    
    int start = 0, index;
    ListIterator li;
    String word;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    list.add("java");
    list.add("jazz");
    list.add("jay");
    list.add("javelin");
    list.add("jaw");
    list.add("jawbone");
    list.add("javel");
    list.add("jaws");
    list.add("javafinch");
    list.add("jax");
    list.add("jazzy");
    
    Collections.sort(list);
    System.out.print("Enter a word between jav - jaz-: ");
    word = br.readLine();
    if (list.contains(word))
    {
      System.out.println(word + " is spelled correctly at spot " + list.indexOf(word));
    }
    else
    {
      for(index = 0; index < list.size(); index++)
      {
        if (list.get(index).toString().compareTo(word) > 0)
        {
          start = index - 1;
          break;
        }
        if (start > 0)
        {
          start = 0;
          index = 1;
        }
        if (index >= list.size())
        {
          start = list.size() - 2;
          index = list.size() - 1;
        }
        System.out.println("The closest words to " + word + " are: ");
        System.out.println(list.get(start));
        System.out.println(list.get(index));
      
      li = list.listIterator();
      System.out.println("\nHere are all the words");
      while(li.hasNext())
        System.out.println(li.nextIndex() + ". " + li.next());
    }
  }
}
}

                       
    
   
  
  