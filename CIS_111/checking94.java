/* Exercise 9-4 sub class
 * This class will define a savings account
 * */

public class checking94 extends account94
{
  private double intRate;
  
  public checking94(int n)
  {
    super(n);
  }
  
  public String getAccountInfo()
  {
    return "Checking Account Information\n" + acctNum + " " + bal;
  }
}