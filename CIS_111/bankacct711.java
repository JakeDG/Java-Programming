/* Exercise BankAccount 711
 * This class will define a bank account
 * */

public class bankacct711
{
  //Properties - data fields
  private String acctNum;
  private double bal;
  
  // Methods
  public bankacct711() // Constructor
  {
    acctNum = "";
    bal = 0;
  }
  
  public void setAcctNum(String an)
  {
    acctNum = an;
  }
  
  public void setBal (double bl)
  {
    bal = bl;
  }
  
  public String getAcctNum()
  {
    return acctNum;
  }
  
  public double getBal()
  {
    return bal;
  }
  
  public void trans(double a)
  {
    bal += a;
  }
}