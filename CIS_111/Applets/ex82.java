/* Exercise 8-3
 * This applet will triple a number
 */

import java.awt.*;
import javax.swing.*; // Import JApplet
import java.awt.event.*;

public class ex82 extends JApplet implements ActionListener
{
  JLabel instruct = new JLabel("Enter an integer and click button");
  Font insFont = new Font("Courier", Font.ITALIC, 18);
  JLabel numllab = new JLabel("Integer #1");
  JTextField numField = new JTextField(7);
  JLabel answerLab = new JLabel("Triple the Number");
  JTextField answerField = new JTextField(7);
  JButton calc = new JButton("Calulate");
  FlowLayout flow = new FlowLayout();
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    instruct.setFont(insFont);
    instruct.setForeground(Color.blue);
    c.add(instruct);
    
    numllab.setForeground(Color.blue);
    c.add(numllab);
    
    numField.setForeground(Color.blue);
    c.add(numField);
    
    answerLab.setForeground(Color.blue);
    c.add(answerLab);
    
    answerField.setForeground(Color.blue);
    c.add(answerField);
    
    calc.setForeground(Color.blue);
    c.add(calc);
    numField.requestFocus();
    numField.addActionListener(this);
    calc.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    int num1, ans;
    num1 = Integer.parseInt(numField.getText());
    ans = num1 * 3;
    answerField.setText(Integer.toString(ans));
  }
}
  