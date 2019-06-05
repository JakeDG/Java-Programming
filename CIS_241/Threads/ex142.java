package Threads14;

/*
*	This program will create a clock to display the current time
*/
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ex142 extends JApplet 
{
	Date today;
	int hour, minute, second;
	boolean first = true;
	Container c;
	
	Font clock = new Font("Ariel", Font.BOLD, 36);
	
	public void init()
	{
		setSize(400, 200);
		c = getContentPane();
		c.setBackground(Color.cyan);
		c.setForeground(Color.blue);
	}
	
	public void start()
	{
		first = true;
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.setFont(clock);
		if (first)
		{
			super.paint(g);
			g.setColor(getForeground());
			g.drawString("The time is ", 10, 100);
			first = false;
		}
		
		// Cover up old time with color
		
		g.setColor(c.getBackground());
		
		if (second <= 9 && minute <= 9)
		{
			g.drawString(hour + ":0" + minute + ":0" + second,  200, 100);
		}
		else if (second <= 9)
		{
			g.drawString(hour + ":" + minute + ":0" + second,  200, 100);
		}
		else if (minute <= 9)
		{
			g.drawString(hour + ":0" + minute + ":" + second,  200, 100);
		}
		else
		{
			g.drawString(hour + ":" + minute + ":" + second,  200, 100);
		}
		
		// Get new time
		
		today = new Date();
		hour = today.getHours();
		minute = today.getMinutes();
		second = today.getSeconds();
		
		// Draw new time
		
		g.setColor(getForeground());
		
		if (second <= 9 && minute <= 9)
		{
			g.drawString(hour + ":0" + minute + ":0" + second,  200, 100);
		}
		else if (second <= 9)
		{
			g.drawString(hour + " :" + minute + ":0" + second,  200, 100);
		}
		else if (minute <= 9)
		{
			g.drawString(hour + ":0" + minute + ":" + second,  200, 100);
		}
		else
		{
			g.drawString(hour + ":" + minute + ":" + second,  200, 100);
		}
		
		//sleep 1 second
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		
		repaint();
	}

}
