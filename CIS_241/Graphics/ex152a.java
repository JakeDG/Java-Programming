/* Jacob Gidley
 * Exercise 15-2a
 * This applet will draw a random colored and random thick lines
 */

package graphics15;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ex152a extends JApplet
{
	public void init()
	{			
		setSize(400, 300);
	}
	public void paint(Graphics g)
	{
			super.paint(g);
			Color[] colors = {Color.blue, Color.cyan, Color.red, Color.green, 
						Color.yellow, Color.pink, Color.gray, Color.lightGray, 
						Color.darkGray, Color.magenta, Color.orange};
			
			Graphics2D g2 = (Graphics2D)g;
			int y, w, c;
			float h;
			BasicStroke b;
			Line2D.Float l;
			
			for(y = 20; y <= 280; y += 20)
			{
				c = (int)(Math.random() * colors.length);
				g2.setColor(colors[c]);
				
				h = (float)(Math.random() * 20 + 1);
				b = new BasicStroke(h, BasicStroke.CAP_ROUND, 
						BasicStroke.JOIN_ROUND);
				g2.setStroke(b); 
				
				w = (int)(Math.random() * 375 + 1);
				l = new Line2D.Float(0, y, w, y);
				
				g2.draw(l);
			}
	}
	
}

	

