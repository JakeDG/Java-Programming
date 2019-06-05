import javax.swing.JOptionPane; // Import dialog boxes

public class WearCoat
{
  public static void main (String[] args)
  {
    //declare variable sro
    short temperature;
    String input;
    
    // Ask what the temperature is 
    input = JOptionPane.showInputDialog ("What is the temperature outside?");
    temperature = Byte.parseByte(input);
    
    // If temperature is less than 60 degrees tell user to wear a coat
    if (temperature < 60)
    {
      JOptionPane.showMessageDialog (null, "Wear a coat!");
    }
    else 
    {
      //If temperature is greater than 60 degrees tell user to not where a coat
      JOptionPane.showMessageDialog (null, "You don't need a coat!");
    }
  
  }

}
    
    