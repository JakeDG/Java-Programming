/* Exercise 10-11
 * This applet will draw a smiley face
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1011 extends JApplet implements ActionListener
{
  JButton smileButton = new JButton("Change Expressions");
  boolean smile = true;
  Container c;
  FlowLayout flow = new FlowLayout();
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.blue);
    smileButton.setForeground(Color.cyan);
    c.add(smileButton);
    smileButton.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    smile = !smile;
    repaint();
  }
  
  public void paint(Graphics g)
  {
     super.paint(g);
     g.setColor(Color.yellow);
     g.fillOval(50, 50, 100, 100); // (x, y, width, height)
     g.setColor(Color.black);
     g.fillOval(85, 80, 10, 20);
     g.fillOval(105, 80, 10, 20);
     
     if (smile)
     {
       g.drawArc(70, 70, 60, 60, 200, 140);
     }
     else
     {
       g.drawArc(70, 110, 60, 60, 160, -140);
     }
  }
}
       
     
     