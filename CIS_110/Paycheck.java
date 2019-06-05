// Import dialog boxes
import javax.swing.JOptionPane;
// Import decimal format
import java.text.DecimalFormat;

public class Paycheck
{
  public static void main (String[] args)
  {
   
    float hours, payRate, overtime, netPay;
    final byte cutOff = 40;
    final double payInc = 1.5;
    
    // prompt user for number of hours worked
    hours = Float.parseFloat(JOptionPane.showInputDialog ("How many hours have you worked?"));
    
    // prompt user for pay rate
    payRate = Float.parseFloat(JOptionPane.showInputDialog ("What is your hourly pay rate?"));
    
    // Create decimal format
    DecimalFormat formatter = new DecimalFormat("#,##0.00");
    if (hours > cutOff)
    {
      //Calculate pay for first 40 hours
      netPay = payRate * cutOff;
      
      //Calculate overtime
      overtime = (float)payInc * payRate * (hours - cutOff);
      
      netPay = netPay + overtime;
    }
    else
      //calculate regular pay
      netPay = payRate * hours;
    
   JOptionPane.showMessageDialog(null, "Your net pay is $" + netPay + formatter.format(netPay) ".");
   
  }
  
}