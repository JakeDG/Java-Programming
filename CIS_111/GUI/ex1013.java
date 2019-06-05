/* Exercise 10-13
 * This frmae will divide two numbers
 */

import java.awt.*; // Import Flowlayout
import javax.swing.*; // Import Frame
import java.awt.event.*; // Import actionlistener

public class ex1013 extends JFrame implements ActionListener
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
  FlowLayout flow = new FlowLayout();
  Container c;
  
  public ex1013()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    instruct.setFont(insFont);
    instruct.setForeground(Color.blue);
    c.add(instruct);
    
    // Set labels and fields in order 
    numllab.setForeground(Color.blue);
    c.add(numllab);
     numField.setForeground(Color.blue);
    c.add(numField);
    
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
    setTitle("Division Frame Title");
    setSize(400, 150);
    setResizable(false);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args)
  {
    ex1013 f = new ex1013();
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
  