/* Exercise 8-6a
 * This applet will display a random multiplication problem
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class ex86a extends JApplet implements ActionListener
 {
  int num1 = (int)(Math.random() * 12 + 1);
  int num2 = (int)(Math.random() * 12 + 1);  
  JLabel qLab = new JLabel("what is " + num1 + " * " + num2 + " = ");
  JTextField aText = new JTextField(5);
  JButton aBut = new JButton("Answer");
  Font resFont = new Font("Ravie", Font.BOLD, 20);
  JLabel resLab = new JLabel();
  FlowLayout flow = new FlowLayout();
  Container c;
 }

public void init()
{
  c = getContentPane();
  c.setLayout(flow);
  c.setBackround(Color.cyan);
  qLab.setBackround(Color.blue);
  c.add(qLab);
  aText.setBackround(Color.blue);
  c.add(aText);
  aBut.setBackround(Color.blue);
  c.add(aBut);
  resLab.setFont(resFont);
  resLab.setBackround(Color.blue);
  c.add(resLab);
  aText.requestFocus
}

public void actionPerformed(ActionEvent e)
{
  int product = num1 * num2;
  String susser = aText.getText();
  int user = Integer.parseInt(suser);
  if (user == product)
  {
    resLab.setText("Correct!!!");
    aText.setEnabled(false);
    aText.setEnabled(false);
  }
}
    