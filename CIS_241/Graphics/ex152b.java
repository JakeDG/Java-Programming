/* Jacob Gidley
 * Exercise 15-2b
 * This applet will draw a random colored and random triangles
 */

package graphics15;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ex152b extends JApplet
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
			
			GeneralPath triangle;
			int x, i;
			
			for(i = 1; i <= 10; i++)
			{
				
				triangle = new GeneralPath();
				
				c = (int)(Math.random() * colors.length);
				g2.setColor(colors[c]);
				
				x = (int)(Math.random() * 351 + 25);
				y = (int)(Math.random() * 251 + 25);
				triangle.moveTo(x, y);
				
				x = (int)(Math.random() * 351 + 25);
				y = (int)(Math.random() * 251 + 25);
				triangle.lineTo(x, y);
				
				x = (int)(Math.random() * 351 + 25);
				y = (int)(Math.random() * 251 + 25);
				triangle.lineTo(x, y);
				
				triangle.closePath();
				
				g2.fill(triangle);
			}
	}
	
}

	

