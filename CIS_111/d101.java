// d10-1 This applet should display a bullseye, not a cone
import java.awt.*;
import javax.swing.*;

public class d101 extends JApplet
{
 Container c;

public void init()
{
 c = getContentPane();
 c.setBackground(Color.cyan);
}

public void paint(Graphics g)
 {
  super.paint(g);
    int diameter, x = 50, y = 50;
    for(diameter = 2; diameter < 200; diameter+=3)
    {
       if(diameter < 50)
         g.setColor(Color.red);
       else if(diameter < 100)
         g.setColor(Color.green);
       else if (diameter < 150)
         g.setColor(Color.yellow);
       else g.setColor(Color.blue);
       g.drawOval(x, y, diameter, diameter);
    }
 }
}