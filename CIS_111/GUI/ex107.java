/* Exercise 10-7
 * This applet will draw my name
 * */

import java.awt.*;
import javax.swing.*;

public class ex107 extends JApplet
{
  Font nameFont;
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setBackground(Color.cyan);
  }
  
  public void print(Graphics g)
  {
    super.paint(g);
    int i;
    for(i = 2; i <= 24; i += 2)
    {
       nameFont = new Font("Ravie", Font.BOLD, i);
       g.setFont(nameFont);
       g.drawString("Jacob", 10 * i + 50, 10 * i + 25);
    }
  }
}
       
       
  