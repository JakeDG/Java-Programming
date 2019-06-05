/* Exercise 9-4 sub class
 * This class will define a savings account
 * */

public class savings94 extends account94
{
  private double intRate;
  
  public savings94(int n, double r)
  {
    super(n);
    intRate = r;
  }
  
  public String getAccountInfo()
  {
    return "Savings Account Information\n" + acctNum + " " + bal + " " + intRate;
  }
}