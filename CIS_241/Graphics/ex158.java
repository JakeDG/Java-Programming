package graphics15;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D.Float;

import javax.swing.*;

/* Jacob Gidley
 * Exercise 15-7
 * This applet will draw my name with rectangles
 */
public class ex158 extends JApplet
{

	String name;
	Font f = new Font("Perpetua", Font.PLAIN, 20);
	Container c;
	
	public void init()
	{
		setSize(400,300);
		c= getContentPane();
		c.setBackground(Color.lightGray);
		name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", 
				JOptionPane.QUESTION_MESSAGE);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setFont(f);
		FontMetrics fm = g2.getFontMetrics();
		int ascent = fm.getAscent();
		int descent = fm.getDescent();
		int width = fm.stringWidth(name);
		int x= 60, y = 80;
		int border = 10;
		g2.setColor(Color.blue);
		g2.drawString(name, x, y);
		
		BasicStroke b = new BasicStroke((float)border,
				BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER);
		
		Rectangle2D.Float[] r = new Rectangle2D.Float[5];
		
		int i, j;
		
		for(i = 0; i < r.length; i++)
		{
			r[i] = new Rectangle2D.Float(x - (i+1) * border,
					y - (ascent + (i +1) * border),
					width + 2 * (i + 1) * border,
					ascent + descent + 2 * (i + 1) * border);		
		}
		
		Color[] c = {Color.red, Color.cyan, Color.green, Color.pink, Color.blue};
		
		for (j = 0; j < r.length; j++)
		{
			g2.setColor(c[j]);
			g2.draw(r[j]);
		}
		
		System.out.println("Ascent = " + ascent);
		System.out.println("Descent = " + ascent);
		System.out.println(name + " Width = " + width);
	}
	
}
