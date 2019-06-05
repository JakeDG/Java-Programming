/* Jacob Gidley, CIS 111-02
 * ------------------------------
 * Blood Drive - Average Exercise
 * ------------------------------
 * This program will create a Java Applet that will collect the 
 * amount of blood given during a company blood drive.
 * The users will enter the amount of blood each of the five
 * departments of the company donated. 
 * The applet will take all five amounts and find the average, 
 * then print it to the screen.
 * */

import java.awt.*; // Import Flowlayout
import javax.swing.*; // Import JApplet
import java.awt.event.*; // Import actionlistener
  
public class BloodDrive extends JApplet implements ActionListener // Class becomes the applet
{
  Font headFont = new Font("Balloon Bd BT", Font.BOLD, 25); // Set font type, style, and size
  Font instructFont = new Font("Plain", Font.PLAIN, 18);
  
  // Create header and intruction labels
  JLabel header = new JLabel("Company Blood Drive");
  JLabel instruct = new JLabel("Enter the pints of blood donated by each department and click the calculate button.");
  
  // Create department labels and textfields and the calculate button
  JLabel dep1Lab = new JLabel("Dept. 1");
  JTextField dep1Field = new JTextField(5);
  JLabel dep2Lab = new JLabel("Dept. 2");
  JTextField dep2Field = new JTextField(5);
  JLabel dep3Lab = new JLabel("Dept. 3");
  JTextField dep3Field = new JTextField(5);
  JLabel dep4Lab = new JLabel("Dept. 4");
  JTextField dep4Field = new JTextField(5);
  JLabel dep5Lab = new JLabel("Dept. 5");
  JTextField dep5Field = new JTextField(5);
  JLabel avgLab = new JLabel("Average          ");
  JButton calc = new JButton("Calculate");
  JButton clear = new JButton("Clear");
  
  FlowLayout flow = new FlowLayout(); // Create layout
  Container c;

  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    
    //Ctreate header and instructon labels
    header.setFont(headFont);
    header.setForeground(Color.blue);
    c.add(header);
    instruct.setFont(instructFont);
    instruct.setForeground(Color.blue);
    c.add(instruct);
  
    // Set label and button foreground colors
    dep1Lab.setForeground(Color.blue);
    c.add(dep1Lab);
    dep1Field.setForeground(Color.blue);
    c.add(dep1Field);
    dep2Lab.setForeground(Color.blue);
    c.add(dep2Lab);
    dep2Field.setForeground(Color.blue);
    c.add(dep2Field);
    dep3Lab.setForeground(Color.blue);
    c.add(dep3Lab);
    dep3Field.setForeground(Color.blue);
    c.add(dep3Field);
    dep4Lab.setForeground(Color.blue);
    c.add(dep4Lab);
    dep4Field.setForeground(Color.blue);
    c.add(dep4Field);
    dep5Lab.setForeground(Color.blue);
    c.add(dep5Lab);
    dep5Field.setForeground(Color.blue);
    c.add(dep5Field);
    avgLab.setForeground(Color.blue);
    c.add(avgLab);
    
    calc.setForeground(Color.blue);
    c.add(calc);
    clear.setForeground(Color.blue);
    c.add(clear);
  
    dep1Field.requestFocus(); // Put the cursor in the first textfield
    
    // Listen to objects actions
    dep5Field.addActionListener(this);
    calc.addActionListener(this);
    clear.addActionListener(this);
  }
  
  public void actionPerformed (ActionEvent e)
  {
    int num1, num2, num3, num4, num5, avg;
    
    if (e.getSource() == dep5Field || e.getSource() == calc)
    {
      // Parse values in text fields to integers 
      num1 = Integer.parseInt(dep1Field.getText());
      num2 = Integer.parseInt(dep2Field.getText());
      num3 = Integer.parseInt(dep3Field.getText());
      num4 = Integer.parseInt(dep4Field.getText());
      num5 = Integer.parseInt(dep5Field.getText());
      
      avg = (num1 + num2 + num3 + num4 + num5) / 5; //Calculate the average
      avgLab.setText("Average is " + Integer.toString(avg)); //Put average into the average label
    }
    else if (e.getSource() == clear) // Clear all text fields 
    {
      dep1Field.setText("");
      dep2Field.setText("");
      dep3Field.setText("");
      dep4Field.setText("");
      dep5Field.setText("");
      avgLab.setText("Average          "); // Reset average label
      
      dep1Field.requestFocus(); // Put the cursor in the first textfield
    }
  }
}