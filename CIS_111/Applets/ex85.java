/* Exercise 8-5
 * This applet will checka user's password
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex85 extends JApplet implements ActionListener
{
  JLabel instruct = new JLabel("Type your password and press enter.");
  JTextField password = new JTextField(10);
  JLabel message = new JLabel();
  FlowLayout flow = new FlowLayout();
  Container c;
  String[] valid = {"password", "fluffy", "kittens", "yankees", "java"};
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    instruct.setForeground(Color.blue);
    c.add(instruct);
    
    password.setForeground(Color.blue);
    c.add(password);
    
    message.setForeground(Color.blue);
    c.add(message);
    
    requestFocus();
    password.requestFocus(); // Focuses the cusor
    password.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    boolean found = false;
    int i;
    String passin = password.getText();
    for (i = 0; i < valid.length; i++)
    {
      if (passin.equals(valid[i]))
      {
        message.setText("Access Granted");
        found = true;
        break;
      }
      if (!found)
      {
        message.setText ("Access Denied");
      }
    }
  }
}
 