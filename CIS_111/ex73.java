/* Exercise 7-3
 * This program will take a users full name and seperate them into 3 seperate parts
 * */

import java.io.*;
import java.util.*;

public class ex73
{
  public static void main(String[] args) throws IOException
  {
    String name;
    StringTokenizer st;
    String middle, last;
    StringBuffer first; // could be a string
    StringBuffer lastFirst = new StringBuffer();
    StringBuffer userName = new StringBuffer();
    StringBuffer signature = new StringBuffer();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter first middle last name: ");
    name = br.readLine();
    
    st = new StringTokenizer(name, " ");
    first = new StringBuffer(st.nextToken()); // convert Stirng to stringBuffer
    middle = st.nextToken();
    last = st.nextToken();
    
    lastFirst.append(last).append(", ").append(first);
    
    userName.append(Character.toLowerCase(first.charAt(0))).append("-").append(last.toLowerCase());
    
    signature.append(first).append(" ").append(middle.charAt(0)).append(". ").append(last);
    
    System.out.println("\nLast First = " + lastFirst.toString()); // convert StringBuffer to String (could have left StringBuffer)
    
    System.out.println("User Name = " + userName);
    
    System.out.println("Signature = " + signature);
  }
}
