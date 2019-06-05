/* Exercise 10-5
 * This applet will divide two numbers
 */

import java.awt.*; // Import Flowlayout
import javax.swing.*; // Import JApplet
import java.awt.event.*; // Import actionlistener

public class ex105 extends JApplet implements ActionListener
{
  JLabel instruct = new JLabel("Enter 2 integers and click button");
  Font insFont = new Font("Courier", Font.ITALIC, 18);
  JLabel numllab = new JLabel("Integer #1");
  JTextField numField = new JTextField(7);
  JLabel num2lab = new JLabel("Integer #2");
  JTextField num2Field = new JTextField(7);
  JLabel answerLab = new JLabel("Quotient the Numbers");
  JTextField answerField = new JTextField(7);
  JButton calc = new JButton("Calulate");
  Container c;
  
  BorderLayout bord = new BorderLayout();
  GridLayout grid = new GridLayout(3, 2);
  JPanel center = new JPanel();
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(bord);
    c.setBackground(Color.cyan);
    instruct.setFont(insFont);
    instruct.setForeground(Color.blue);
    c.add(instruct, bord.NORTH);
    
    center.setLayout(grid);
    center.setBackground(Color.cyan);
    
    // Set labels and fields in order 
    numllab.setForeground(Color.blue);
    center.add(numllab);
    numField.setForeground(Color.blue);
    center.add(numField);
    
     num2lab.setForeground(Color.blue);
    center.add(num2lab);
    numField.setForeground(Color.blue);
    center.add(num2Field);
    
    answerLab.setForeground(Color.blue);
    center.add(answerLab);
    
    answerField.setForeground(Color.blue);
    center.add(answerField);
    
    c.add(center, bord.CENTER);
    
    calc.setForeground(Color.blue);
    c.add(calc, bord.SOUTH);
    numField.requestFocus();
    num2Field.addActionListener(this);
    calc.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    int num1, num2;
    double ans;
    
    num1 = Integer.parseInt(numField.getText());
    num2 = Integer.parseInt(num2Field.getText());
    if (num2 != 0)
    {
      ans = (double) num1/num2;
      answerField.setText(Double.toString(ans));
    }
    else
    {
      answerField.setText("Can't divide by 0");
    }
  }
}
  