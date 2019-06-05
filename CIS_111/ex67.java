/*Exercise 6-7
 * This program will fill up a 10x8 checkerboard of Bs and Rs
 * */

public class ex67
{
  public static void main(String[] args)
  {
    char[][] check = new char[10][8];
    fillCheck(check);
    printCheck(check);
  }
  
  public static void fillCheck(char[][] check)
  {
    int r, c;
    for (r = 0; r < check.length; r++)
      for (c = 0; c < check[r].length; c++)
    if ((r+c) % 2 ==0)
    {
      check[r][c] = 'B'; //fill even sqaures with B  
    }
    else
    {
      check[r][c] = 'R'; // odd with R
    }
  }
  
  public static void printCheck(char[][] check)
  {
    int r, c;
    for (r = 0; r < check.length; r++)
    {
     for (c = 0; c < check[r].length; c++)
      System.out.print(check[r][c]);
     System.out.println(); 
    }           
  }
}
