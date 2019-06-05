/* Exercise 6r-3
 * This program will ask the user to look up gold and total medals by
 * year, and gold and total medals over the last five Olympics
 */

import java.util.*;
public class ex6r3
{
  public static void main(String[] args)
  {
    int[][] olympics = {{1996, 44, 32, 25},
               {2000, 37, 24, 32}, 
               {2004, 36, 29, 26},
               {2008, 36, 38, 36},
               {2012, 46, 29, 29}};
    
    int r, c, year, yearGold, yearMedals = 0,
      totalGold = 0, totalMedals = 0;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter 0 - 1996, 1 - 2000, 2 -2004, 3 - 2008, 4 - 2012: ");
    year = keyboard.nextInt();
    
    yearGold = olympics[year][1];
    System.out.println(yearGold + " gold medals in " + olympics[year][0]);
    
    for (c = 1; c < olympics[year].length; c++)
    {
      yearMedals += olympics[year][c];
    }
    System.out.println(yearMedals + " total medals in " + olympics[year][0]);
    
    for (r = 0; r <  olympics.length; r++)
      totalGold += olympics[r][1];
    System.out.println(totalGold + " gold medals in the last " + olympics.length + " olympics");
    
    for(r = 0; r < olympics.length; r++)
      for(c = 1; c < olympics[r].length; c++)
    {
      totalMedals += olympics[r][c];
    }
      System.out.println(totalMedals + " total medals in the last " + olympics.length + " olympics");                           
  }
}
  