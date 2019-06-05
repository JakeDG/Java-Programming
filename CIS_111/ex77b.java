/* Exercise 7-7b
 * This program will create and manipulate some employees
 * */

public class ex77b
{
  public static void main(String[] args) throws IOException
  {
    String[][] employees = {{"Sara", "CEO"}, {"Karl", "Overlord"}, {"Edward", "Bagger"}};
    double[] rates = {120000, 22000, 6.50};
    int i, j;
    String name;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean found = false;
    
    System.out.println("Employees with rate > $10 an hour");
    
    System.out.print("\nEnter name to find title: ");
    name = br.readLine();
    
    System.out.print("The employess who earn > $10 an hour are: ");
    for(j = 0; j < rates.length; j++)
    {
      if (rates[j] > 10.00)
      {
        System.out.println(employees[j][0] + " - " + employees[j][1]);
      }
    }
  }
}