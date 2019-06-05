/* Exercise 10-12a
 * This applet will draw a pizza
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1012a extends JApplet implements ActionListener
{
  JButton pizzaButton = new JButton("Take a Piece");
  int count = 0;
  boolean smile = true;
  Container c;
  FlowLayout flow = new FlowLayout();
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.blue);
    pizzaButton.setForeground(Color.cyan);
    c.add(pizzaButton);
    pizzaButton.addActionListener(this);
    repaint();
  }
  
  public void actionPerformed(ActionEvent e)
  {
    count++;
    if (count == 4)
    {
      c.remove(pizzaButton);
    }
    repaint();
  }
  
  public void paint(Graphics g)
  {
     super.paint(g);
     g.setColor(Color.yellow);
     switch (count)
     {
       case 0: 
       {
         g.fillOval(50, 50, 100, 100); 
         g.setColor(Color.red);
         g.fillOval(115, 75, 10, 10);
         g.fillOval(75, 75, 10, 10);
         g.fillOval(75, 115, 10, 10);
         g.fillOval(115, 115, 10, 10);
         break;
       }
       case 1:
       {
         g.fillArc(50, 50, 100, 100, 0, 270); 
         g.setColor(Color.red);
         g.fillOval(115, 75, 10, 10);
         g.fillOval(75, 75, 10, 10);
         g.fillOval(75, 115, 10, 10);
         break;
       }
        case 2:
       {
         g.fillArc(50, 50, 100, 100, 0, 180); 
         g.setColor(Color.red);
         g.fillOval(115, 75, 10, 10);
         g.fillOval(75, 75, 10, 10);
         break;
       }
        case 3:
       {
         g.fillArc(50, 50, 100, 100, 0, 90); 
         g.setColor(Color.red);
         g.fillOval(115, 75, 10, 10);
         break;
       }
        case 4:
       {
         g.setColor(Color.red);
         g.drawString("Order More Pizza", 50, 100);
       }
     }
  }
}
       
     
     