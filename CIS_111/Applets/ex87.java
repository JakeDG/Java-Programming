/* Exercise 8-7
 * This program will execpt two strings and compare them
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex87 extends JApplet implements ActionListener
{
  
  JLabel jLab1 = new JLabel("Enter a string: ");
  JTextField jField1 = new JTextField(10);
  JLabel jLab2 = new JLabel("Enter a string: ");
  JTextField jField2 = new JTextField(10);
  
  JLabel jOutput1 = new JLabel();
  JLabel jOutput2 = new JLabel();
  
  FlowLayout flow = new FlowLayout();
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    
    jLab1.setForeground(Color.blue);
    c.add(jLab1);
    jField1.setForeground(Color.blue);
    c.add(jField1);
    jLab2.setForeground(Color.blue);
    c.add(jLab2);
    jField2.setForeground(Color.blue);
    c.add(jField2);
    jOutput1.setForeground(Color.blue);
    c.add(jOutput1);
    jOutput2.setForeground(Color.blue);
    c.add(jOutput2);
    jField1.requestFocus();
    jField2.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String s1, s2;
    s1 = jField1.getText(); // Get values from textfields
    s2 = jField2.getText();
    
     if (s1.equals(s2))
     {
       jOutput1.setText("Same string");
     }
     else if (s1.equalsIgnoreCase(s2))
     {
        jOutput1.setText("Same string - different usage");
     }
     else if (s1.compareTo(s2) > 0)
     {
       jOutput1.setText(s1 + " is greater than " + s2);
     }
     else
     {
       jOutput1.setText(s1 + " is less than " + s2);
     }
     
     jOutput2.setText("Difference is " + s1.compareTo(s2));
  }
}
