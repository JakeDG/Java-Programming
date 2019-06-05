//import dialog boxes
import javax.swing.JOptionPane;

public class PromptName
{
  public static void main(String[] args)
  {
   String name;
   
   name = JOptionPane.showInputDialog("What is your name?");
   
   JOptionPane.showMessageDialog(null, "Hello " + name);
  }
  
}