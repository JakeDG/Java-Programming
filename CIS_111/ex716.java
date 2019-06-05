/* Exercise 7-16
 * This program will get the information about an employee
 * */

import java.io.*;
import java.util.Scanner;

public class ex716
{
  public static void main(String[] args) throws IOException
  {
    employee716 e;
    String name;
    double salary;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter name: ");
    name = br.readLine();
    System.out.print("Enter salary: ");
    salary = sc.nextDouble();
      
    e = new employee716 (name, salary);
    e.raise();
    e.printEmployee();
  }
}