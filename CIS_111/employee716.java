/* Exercise 7-16
 * This program will get the information of a new employee
 * */

public class employee716
{
  // Data fields
  private String name;
  private double salary;
  
  public employee716(String n) // Constructor
  {
    name = n;
    salary = 30000;
  }
  
  public employee716(String n, double s)
  {
    name = n;
    salary = s;
  }
  
  public void raise()
  {
    salary *= 1.05;
  }
  
  public void printEmployee()
  {
    System.out.println("Name is " + name);
    System.out.printf("Salary is %.2f\n", salary);
  }
}