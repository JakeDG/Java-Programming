/*Exercise 7-4
 * This program will take an English phrase and turn it into pig latin
 * */

import java.io.*;
import java.util.*;

public class ex74
{
  public static void main(String[] args) throws IOException
  {
    String sent;
    StringTokenizer st;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter an English phrase: ");
    sent = br.readLine();
    sent = sent.toLowerCase();
    st = new StringTokenizer(sent, " ,.?!;:");
    
    while (st.hasMoreTokens())
    {
      plw(st.nextToken());
      System.out.println(' ');
    }
    System.out.println();
  }
  
  public static void plw(String word)
  {
    int x;
    
    for(x = 0; x < word.length(); x++)
    {
      System.out.print(word.charAt(x));
      System.out.print(word.charAt(0) + "ay");
    }
  }
}
