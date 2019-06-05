/* Jacob Gidley, Advanced Java, CIS 241-360
 * This program will draw a cat-snake with that will
 * move across the screen. The program will also draw 
 * a landscape that includes the sun, a tree, the grass
 * and the sky.
 */

package graphics15;

import javax.swing.JApplet;

import java.awt.*;
import java.awt.geom.*;

public class catSnake extends JApplet
{
	
	int x = 0;
	boolean first = true;
	
	public void init()
	{
		setSize(400,300); // Set applet size
	}

	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		// Draw sun, sky and the tree once
		if(first)
		{
			
			super.paint(g);
			
			// Draw sky with gradient paint
			Rectangle2D sky = new Rectangle2D.Float(0f,0f,400f,150f);
			GradientPaint gp = new GradientPaint(0f, 0f, Color.cyan, 400f, 150f, Color.white);
			g2.setPaint(gp);
			g2.fill(sky);
		
			// Draw tree top
			Arc2D treeTop = new Arc2D.Float(200f, 75f, 55f, 50f, 180f, -180f, Arc2D.PIE);
			g2.setColor(Color.green);
			g2.fill(treeTop);
		
			// Draw tree trunk
			BasicStroke tree = new BasicStroke(5, BasicStroke.CAP_SQUARE, 
				BasicStroke.JOIN_ROUND);
			g2.setStroke(tree);
			Line2D l = new Line2D.Float(227.5f, 100f, 227.5f, 150f);
			g2.setColor(Color.gray);
			g2.draw(l);
		
			// Draw sun
			Ellipse2D sun = new Ellipse2D.Float(70f, 20f, 40f, 40f);
			g2.setColor(Color.yellow);
			g2.fill(sun);
			
			first = false;
		}
		
		// Draw grass
		Rectangle2D grass = new Rectangle2D.Float(0f,150f,400f,150f);
		g2.setColor(Color.green);
		g2.fill(grass);
		
		x += 5; // Increase x coordinate
		
		// Create and draw the cat-snake
		BasicStroke catLine = new BasicStroke(3, BasicStroke.CAP_SQUARE, 
				BasicStroke.JOIN_ROUND);
		g2.setStroke(catLine);
		
		GeneralPath cat = new GeneralPath();
		g2.setColor(Color.red);
		cat.moveTo(x + 25, 215);
		cat.lineTo(x + 25, 175);
		cat.lineTo(x + 35, 185);
		cat.lineTo(x + 55, 185);
		cat.lineTo(x + 65, 175);
		cat.lineTo(x + 65, 215);
		cat.closePath();
		g2.draw(cat);
		
		// Draw cat-snake eyes
		Ellipse2D eye1 = new Ellipse2D.Float(x + 30f, 190f, 10f, 10f);
		g2.setColor(Color.blue);
		g2.fill(eye1);
		
		Ellipse2D eye2 = new Ellipse2D.Float(x + 50f, 190f, 10f, 10f);
		g2.setColor(Color.blue);
		g2.fill(eye2);
		
		// Go to sleep for 250 milliseconds
		try
		{
			Thread.sleep(75);
		}
		catch(InterruptedException e)
		{}
		
		// Stop cat-snake movement when its 85 pixels 
		if(x < getSize().width - 75)
		{
			repaint();
		}
	}
	
	// Override update to lessen flicker
	public void update(Graphics g)
	{
		paint(g);
	}
}

