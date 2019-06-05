/* Exercise 7-17
 * This program will get the information about an employee
 * */

import java.io.*;
import java.util.Scanner;

public class ex717
{
  public static void main(String[] args) throws IOException
  {
    employee716[] e = new employee716[3];
    String name;
    double salary;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int i, j;
    
    for (i = 0; i < e.length; i++)
    {
      
    System.out.print("Enter name: ");
    name = br.readLine();
    System.out.print("Enter salary: ");
    salary = sc.nextDouble();
    
    e[i] = new employee716(name, salary);
    }
    
    for (j = 0; j < e.length; j++)
    {
      e[j].raise();
      e[j].printEmployee();
    }
  }
}