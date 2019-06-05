/* Jacob Gidley, CIS 111-02
 * Phone String Palindrome Conversions
 * This program will prompt the user for their phone number.
 * It will then determine if the number the user entered is a palindrone
 * or not and tell the user if so.
 * It will then print the number in comma form.
 */

import java.text.DecimalFormat;
import java.io.*; //import stringBufferedReader
import java.util.*; //import stringTokenizer

public class Palindrome
{
  public static void main(String[] args) throws IOException
  {
    String phoneNum;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Create stringBufferedReader and inputStreamReader
    System.out.println("Please enter your phone number. Ex: (XXX) XXX-XXXX");
    phoneNum = br.readLine(); //Get input from user
    
    // Prints whether your number is a palindrome or not
    if (isPalindrome(mergeDigits(phoneNum)) == true)
    {
      System.out.println("Congrats, your phone number is a palindrome");
    }
    else
    {
      System.out.println("Sorry, but your phone number is not a palindrome");
    }
    
    System.out.println(toCommaForm(mergeDigits(phoneNum))); // Print phone number in comma form
    
  }
  
  //Removes spaces and symbols from number
  public static String mergeDigits(String num)
  {
    StringTokenizer st;
    StringBuffer sb = new StringBuffer();
    st = new StringTokenizer (num, " -()"); //Remove spaces and symbols from the phone number
    
    while (st.hasMoreTokens())
    {
      sb.append(st.nextToken()); // Merge digits back together
    }
    
    num = sb.toString(); // Convert stringBuffer back to string
    
    return num;
  }
  
  // Tests if number is a palindrome or not
  public static boolean isPalindrome(String num)
  {
    boolean isPal;
    String copyNum = num;
    StringBuffer sb = new StringBuffer(copyNum); // Convert string to stringBuffer
    sb.reverse(); // Reverse the characters in the stringBuffer
    copyNum = sb.toString();  // Convert stringBuffer back to string
    
    if (copyNum.equals(num)) // Checks if reverse string equals original string
    {
      isPal = true;
    }
    else
    {
      isPal = false;
    }
     return isPal;
  }
  
   //Converts the phone number into a 10 digit integer number
  public static String toCommaForm(String num)
  {
    long n;
    n = Long.parseLong(num); // Convert string to long
    DecimalFormat dfNum = new DecimalFormat ("0,000,000,000");
    num = dfNum.format(n); // Format the number
    
    return num;
  }
}