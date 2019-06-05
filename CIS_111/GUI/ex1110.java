/* Exercise 11-10
 * */

import java.util.*;
import java.io.*;

public class ex1110
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
    
    String[] sArray = new String[3];
    sArray = list.toArray(sArray);
    
    for (index = 0; index < sArray.length; index++)
    {
      System.out.println(sArray[index]);
    }
  }
}

                       
    
   
  
  