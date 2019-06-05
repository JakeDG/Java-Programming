/* Jacob Gidley
 * Exercise 14-4
 * This class will define a ball
 */

package Threads14;

import java.awt.*;
import javax.swing.*;

public class ball144 extends JFrame implements Runnable
{
	
	boolean stopflag;
	int x,y;
	Container c;
	
	public ball144()
	{

	c = getContentPane();
	c.setBackground(Color.cyan);
	stopflag = false;
	x = 0;
	y = 5;
	setTitle("Ball");
	setForeground(Color.blue);
	}
	
	public void run()
	{
		stopflag = false;
		x = 0;
		y = 150;
		while (!stopflag && x < getSize().width - 30)
		{
			repaint();
		}
		
		end();
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	
	public void end()
	{
		stopflag = true;
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(c.getBackground());
		g.fillOval(x, y, 10, 10);
		x += 10;
		g.setColor(getForeground());
		g.fillOval(x, y, 10, 10);
		
		try
		{
			Thread.sleep(250);
		}
		catch(InterruptedException e)
		{}
	}
	

}
