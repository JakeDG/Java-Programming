package graphics15;

/* Jacob Gidley
 * This class will define a 2D curve
 */
 
import javax.swing.JApplet;
import java.awt.*;
import java.awt.geom.*;

public class Curve2D extends JApplet
{
	public void init()
	{
		setSize(400, 300);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		QuadCurve2D c = new QuadCurve2D.Float(10, 5, 135, 65, 90, 135);
		g2.setColor(Color.blue);
		g2.draw(c);
	}
}
