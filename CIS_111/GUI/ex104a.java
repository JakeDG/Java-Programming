/* Exercise 10-4a
 * This program will ask a Java question
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex104a extends JApplet implements ActionListener
{
  JLabel question = new JLabel("What does this applet call itself?");
  JButton answer = new JButton("Answer");
  Font resFont = new Font("TimesRoman", Font.BOLD, 36);
  JLabel results = new JLabel();
  Container c;
  BorderLayout bord = new BorderLayout();
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(bord);
    c.setBackground(Color.cyan);
    question.setForeground(Color.blue);
    question.setHorizontalAlignment(JLabel.CENTER);
    c.add(question, bord.NORTH);
    answer.setForeground(Color.blue);
    c.add(answer, bord.WEST);
    results.setForeground(Color.blue);
    results.setFont(resFont);
    c.add(results, bord.EAST);
    answer.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    results.setText("this");
  }
}
    
                                 

  