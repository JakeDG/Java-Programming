/* Exercise 8-3
 * This applet will sum two numbers
 */

import java.awt.*; // Import Flowlayout
import javax.swing.*; // Import JApplet
import java.awt.event.*; // Import actionlistener

public class ex83 extends JApplet implements ActionListener
{
  JLabel instruct = new JLabel("Enter 2 integers and click button");
  Font insFont = new Font("Courier", Font.ITALIC, 18);
  JLabel numllab = new JLabel("Integer #1");
  JTextField numField = new JTextField(7);
  JLabel num2lab = new JLabel("Integer #2");
  JTextField num2Field = new JTextField(7);
  JLabel answerLab = new JLabel("Sum the Numbers");
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
    numllab.setForeground(Color.blue);
    c.add(num2lab);
    
     num2lab.setForeground(Color.blue);
    c.add(num2lab);
    numField.setForeground(Color.blue);
    c.add(num2Field);
    
    answerLab.setForeground(Color.blue);
    c.add(answerLab);
    
    answerField.setForeground(Color.blue);
    c.add(answerField);
    
    calc.setForeground(Color.blue);
    c.add(calc);
    numField.requestFocus();
    num2Field.addActionListener(this);
    calc.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    int num1, num2, ans;
    num1 = Integer.parseInt(numField.getText());
    num2 = Integer.parseInt(num2Field.getText());
    ans = num1 + num2;
    answerField.setText(Integer.toString(ans));
  }
}
  