/* Exercise 9-4 Super class
 * This class will define a bank account
 * */

public abstract class account94
{
  //Properties - data fields
  protected int acctNum;
  protected double bal;
  
  // Methods
  public account94(int n) // Constructor
  {
    acctNum = n;
    bal = 0;
  }
  
  public void trans(double a)
  {
    bal += a;
  }
  
  public abstract String getAccountInfo();
}