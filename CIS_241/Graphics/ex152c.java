package graphics15;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ex152c extends JApplet
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
		int x1, x2, y1, y2, c, i;
		float h;
		BasicStroke b;
		Line2D.Float l;
				
		for(i = 1; i <= 10; i++)
		{
			c = (int)(Math.random() * colors.length);
			g2.setColor(colors[c]); 
					
			x1 = (int)(Math.random() * 351 + 25);
			y1 = (int)(Math.random() * 251 + 25);
					
			x2 = (int)(Math.random() * 351 + 25);
			y2 = (int)(Math.random() * 251 + 25);
			h = (float)(Math.random() * 20 + 1);
					
			b = new BasicStroke(h, BasicStroke.CAP_ROUND, 
			BasicStroke.JOIN_ROUND);
			g2.setStroke(b);
					
			l = new Line2D.Float(x1, y1, x2, y2);
					
			g2.draw(l);
		}
	}
}

