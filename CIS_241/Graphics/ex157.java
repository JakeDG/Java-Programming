package graphics15;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/* Jacob Gidley
 * Exercise 15-7
 * This applet will draw my name with rectangles
 */
 
public class ex157 extends JApplet
{

	String name;
	Font f = new Font("Perpetua", Font.PLAIN, 20);
	Container c;
	
	public void init()
	{
		setSize(400,300);
		c= getContentPane();
		c.setBackground(Color.lightGray);
		name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);
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
		int border = 1;
		g2.setColor(Color.blue);
		g2.drawString(name, x, y);
		
		Rectangle2D.Float r1 = new Rectangle2D.Float(x - 1 * border, y - (ascent + 1 * border)
				, width + 2 * border, ascent + descent + 2 * border);
		
		Rectangle2D.Float r2 = new Rectangle2D.Float(x - 2 * border, y - (ascent + 2 * border)
				, width + 4 * border, ascent + descent + 4 * border);
		
		g2.setColor(Color.red);
		g2.draw(r1);
		g2.setColor(Color.cyan);
		g2.draw(r2);
		
		System.out.println("Ascent = " + ascent);
		System.out.println("Descent = " + ascent);
		System.out.println(name + " Width = " + width);
	}
	
}
