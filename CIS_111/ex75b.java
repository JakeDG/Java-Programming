/* Exercise 7-5b
 * This program will input 3 strings into an array
 * */

import java.io.*;
import java.util.*;

public class ex75b
{
  public static void main(String[] args) throws IOException
  {
    String[] s = new String[3];
    int i, j , k;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //loop to input strings
    for (i = 0; i < s.length; i++)
    {
      System.out.print("Enter a string: ");
      s[i] = br.readLine();
    }
    
    System.out.println("Begins with yan");
    
    //loop to print strings that begin with yan
    for(j = 0; j < s.length; j++)
    {
      if (s[j].startsWith("yan"))
      {
        System.out.println(s[j]);
      }
    }
    
    System.out.println("Ends with es");
    
    //loop to print strings that end with es
    for (k = 0; k < s.length; k++)
    {
      if (s[k].endsWith("es"))
      {
        System.out.println(s[k]);
      }
   
    }
    
  }
  
}
  