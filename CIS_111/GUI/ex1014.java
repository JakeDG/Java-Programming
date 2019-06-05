/* Exercise 10-14
 * This program will ask a Java question
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex1014 extends JApplet implements ActionListener
{
  JLabel question = new JLabel("What does this applet call itself?");
  JButton answer = new JButton("Answer");
  Font resFont = new Font("TimesRoman", Font.BOLD, 36);
  //JLabel results = new JLabel();
  Container c;
  FlowLayout flow = new FlowLayout();
  boolean first = true;
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    question.setForeground(Color.blue);
    c.add(question);
    answer.setForeground(Color.blue);
    c.add(answer);
    //results.setForeground(Color.blue);
    //results.setFont(resFont);
    //c.add(results);
    answer.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    //results.setText("this");
    first = false;
    repaint();
  }
  
  public void paint(Graphics g)
  {
    super.paint(g);
    if (!first)
    {
      g.setFont(resFont);
      g.setColor(Color.blue);
      g.drawString("this", 175, 150);
    }
  }
}
    
                                 

  