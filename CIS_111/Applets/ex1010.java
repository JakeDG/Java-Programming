/* Exercise 10-10
 * This applet will draw a city skyline
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1010 extends JApplet implements ActionListener
{
  JButton dayNight = new JButton("Change to Day");
  boolean day = false;
  Container c;
  FlowLayout flow = new FlowLayout();
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.gray);
    dayNight.setForeground(Color.blue);
    c.add(dayNight);
    dayNight.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if(day)
    {
      day = false;
      dayNight.setText("Change to Day");
    }
    else
    {
      day = true;
      dayNight.setText("Change to Night");
    }
    repaint();
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    if(day)
    {
      g.setColor(Color.cyan);
    }
    else
    {
      g.setColor(Color.black);
    }
    g.fillRect(0, 0, 40, 100); // building 40 x 200
    g.fillRect(40, 0, 20, 50);
    g.fillRect(60, 0, 30, 70);
    g.fillRect(90, 0, 50, 130);
    g.fillRect(140, 0, 40, 110);
    g.fillRect(180, 0, 30, 90);
    g.fillRect(210, 0, 60, 70);
    g.fillRect(270, 0, 30, 70);
    
    if (day)
    {
      g.setColor(Color.yellow);
    }
    else
    {
      g.setColor(Color.white);
    }
    
    g.fillOval(160, 30, 40, 40);
    c.add(dayNight);
  }
}
   