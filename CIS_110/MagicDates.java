/* This program will determine weather the month times the day equals the year.
 * If so, then the program will say that the date is magic.
 */

// Import dialog boxes
import javax.swing.JOptionPane;

public class MagicDates
{
  public static void main (String[] args)
  {
    String input; 
    byte day, month, year;
    int majicDate;
    
    // Ask for day of the month
    input = JOptionPane.showInputDialog ("What day of the month is it? \nPlease enter a number!");
    day = Byte.parseByte(input);
    
    //Ask for month of the year
    input = JOptionPane.showInputDialog ("What month of the year is it? \nPlease enter a number!");
    month = Byte.parseByte(input);
    
    //Ask what year it is
    input = JOptionPane.showInputDialog ("What year is it? \nPlease enter the last two digits of the year!");
    year = Byte.parseByte(input);
    
    //Multiply the day and the month
    majicDate = (day * month);
    
    // If the day times the month equals the year
    // then display "the date is majic"
    if (majicDate == year)
    {
      JOptionPane.showMessageDialog (null, "The date is majic!!!");
    }
    else
    {
      JOptionPane.showMessageDialog (null, "The date is not majic.");
    }
     
  }

}
  