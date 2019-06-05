/* Jacob Gidley
 * Exercise 15-1
 * This applet will draw a bullseye
 */

package graphics15;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ex151 extends JApplet
{
	public void paint(Graphics g)
	{
	
		Graphics2D g2 = (Graphics2D)g;
		int xy, wh;
		BasicStroke bs = new BasicStroke(3);
		Ellipse2D.Float e;
		g2.setColor(Color.blue);
		g2.setStroke(bs);
		
		for(xy = 0; xy < 80; xy += 10)
		{
			wh = 160 - (xy * 2);
			e = new Ellipse2D.Float(xy + 30, xy + 30, wh, wh);
			g2.draw(e);
		}
	}
	
}
