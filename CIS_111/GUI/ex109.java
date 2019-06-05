/* Exercise 10-9
 * This program will draw home plate
 * */

import java.awt.*;
import javax.swing.*;

public class ex109 extends JApplet
{
  int[] xHome = {100, 200, 200, 150, 100};
  int[] yHome = {90, 90, 150, 200, 150};
  
  Color dirt = new Color(100, 60, 35);
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setBackground(dirt);
    repaint();
  }
  
  public void paint(Graphics g)
  {
    super.paint(g);
    g.setColor(Color.white);
    g.fillPolygon(xHome, yHome, xHome.length);
    g.setColor(Color.black);
    g.drawPolygon(xHome, yHome, xHome.length);
  }
}