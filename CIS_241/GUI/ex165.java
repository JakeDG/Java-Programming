/* Jacob Gidley
 * Exercise 16-5
 * This applet will use a slider to draw an oval
 */

package gui16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ex165 extends JApplet implements ChangeListener
{
	JSlider js;
	int radius = 0;
	Container c;
	
	public void init()
	{
		setSize(400, 400);
		js = new JSlider(SwingConstants.HORIZONTAL, 50, 150, 50);
		js.setMajorTickSpacing(10);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		js.addChangeListener(this);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(js, "South");
		c.setBackground(Color.blue);
	}
	
	public void stateChanged(ChangeEvent e)
	{
		radius = js.getValue();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.cyan);
		g.fillOval(10, 10, 2 * radius, 2 * radius);
	}
}
