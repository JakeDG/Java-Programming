/* Exercise 8-6b
 * This applet will display a random multiplication problem
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class ex86b extends JApplet implements ActionListener
 {
  int num1 = (int)(Math.random() * 12 + 1);
  int num2 = (int)(Math.random() * 12 + 1);  
  JLabel qLab = new JLabel("what is " + num1 + " * " + num2 + " = ");
  JTextField aText = new JTextField(5);
  JButton aBut = new JButton("Answer");
  
  JButton nBut = new JButton("New Question");
  Font resFont = new Font("Ravie", Font.BOLD, 20);
  JLabel resLab = new JLabel();
  FlowLayout flow = new FlowLayout();
  Container c;

public void init()
{
  c = getContentPane();
  c.setLayout(flow);
  c.setBackground(Color.cyan);
  qLab.setBackground(Color.blue);
  c.add(qLab);
  aText.setBackground(Color.white);
  c.add(aText);
  aBut.setBackground(Color.blue);
  c.add(aBut);
  nBut.setBackground(Color.blue);
  c.add(nBut);
  resLab.setFont(resFont);
  resLab.setBackground(Color.blue);
  c.add(resLab);
  aText.requestFocus();
  aText.addActionListener(this);
  aBut.addActionListener(this); 
  nBut.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
  if (e.getSource() == aText || e.getSource() == aBut)
  {
  int product = num1 * num2;
  String suser = aText.getText();
  int user = Integer.parseInt(suser);
  if (user == product)
  {
    resLab.setText("Correct!!!");
    aText.setEnabled(false);
    aText.setEnabled(false);
  }
  else
    resLab.setText("Try Again");
  }
  else if (e.getSource() == nBut)
  {
    num1 = (int)(Math.random() * 12 + 1);
    num2 = (int)(Math.random() * 12 + 1);  
    qLab.setText("what is " + num1 + " * " + num2 + " = ");
    aText.setText("");
    aText.setEnabled(true);
    aBut.setEnabled(true);
    resLab.setText("");
    aText.requestFocus();
  }
}
}

  
    