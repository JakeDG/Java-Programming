package Threads14;

import java.awt.*;

import javax.swing.*;

public class ex145 extends JApplet
{
		// get rid of all winkbutton code

	boolean wink = false, first = true;
	Container c;

	public void init()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);
		
	}

	public void paint(Graphics g)
	{
		/* if first time, draw the face and non winking eye,
			set first to false */
		if (first)
		{
			super.paint(g);
			g.setColor(Color.yellow);
			g.fillOval(50, 50, 100, 100);
			g.setColor(Color.black);
			g.fillOval(85, 80, 10, 20);
			g.fillOval(105, 80, 10, 20);
			g.drawArc(70, 70, 60, 60, 200, 140);
			first = false;
		}
		
		/* cover just the eye that winks (if winking or not, but do not
		 cover anything else), switch the wink boolean */
		g.setColor(Color.yellow);
		g.fillOval(105, 80, 10, 20);
		wink = true;
		
		// draw the full eye or winking eye

		if (wink)
		{
			g.setColor(Color.black);
			g.fillOval(105, 88, 10, 5);
		}
		g.fillOval(105, 80, 10, 20);

		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		
		repaint();
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	
}