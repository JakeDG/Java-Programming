/* Exercise 7-6
 * This program will find the number of vowels in the words in an array
 * */

public class ex76
{
  public static void main(String[] args)
  {
    int count = 0, i, j;
    String vowels = "aeiouAEIOU";
    String[] names = {"Cassidy", "Jonathan", "Cody", "Andy", "Jacob"};
    
    for (i = 0; i < names.length; i++)
      for (j = 0; j < names[i].length(); j++)
      if (vowels.indexOf(names[i].charAt(j)) != -1)
    {
      count++;
    }
    
    System.out.println("The number of vowels is " + count);
  }
}