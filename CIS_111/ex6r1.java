/*Exercise 6r-1
 * This program will review methods and arrays
 */

public class ex6r1
{
  public static void main (String[] args) throws Exception
  {
    char ch1, ch2;
    char[] charray1 = new char[5];
    char[] charray2 = new char[5];
    int i, j;
    
    System.out.print("Enter a character: ");
    ch1 = (char)System.in.read(); //Used to read input
    System.in.read();
    ch1 = Character.toLowerCase(ch1);
    System.out.println("Character in lowercase is " + ch1);
    
    System.out.print("Enter a character: ");
    ch2 = (char)System.in.read();
    System.in.read();
    ch2 = toLower(ch2);
    System.out.println("Character in lowercase is " + ch2);
    
    System.out.print("Enter " + charray1.length + " characters with spaces: ");
    
    for (i = 0; i < charray1.length; i++)
    {
     charray1[i] = (char)System.in.read();
     System.in.read(); 
     charray1[i] = toLower(charray1[i]);
    }
   
    System.out.println("Characters in " + charray1 + " are: ");
    for (j = 0; j < charray1.length; j++)
      System.out.print(charray1[j] + " ");
    System.out.println();
    
    
    System.out.print("Enter " + charray2.length + " characters with spaces: ");
    
    for (i = 0; i < charray2.length; i++)
    {
     charray1[i] = (char)System.in.read();
     System.in.read(); 
     charray1[i] = toLower(charray2[i]);
    }
    toLowerArray(charray2);
   
    System.out.println("Characters in " + charray2 + " are: ");
    for (j = 0; j < charray2.length; j++)
      System.out.print(charray2[j] + " ");
    System.out.println();
    
  }

  
  public static void toLowerArray(char[] ca)
  {
    int x;
    for (x = 0; x < ca.length; x++)
      ca[x] = toLower(ca[x]);
    System.out.println("ca is " + ca);
  }
    
  public static char toLower(char c)
  {
    if (c >= 65 && c <= 90) //Values of the characters
    {
      c += 32;
    }
   return c;
  }
}