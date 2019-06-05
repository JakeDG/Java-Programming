package gui16;

import java.awt.*;
import javax.swing.*;

public class Lycos extends JApplet
{
	JButton s = new JButton("Search");
	JTextField tf = new JTextField(15);
	JCheckBox w = new JCheckBox("Web");
	JCheckBox i = new JCheckBox("Image");
	Image lyco;
	Container c;
	
	public void init()
	{
		setSize(600, 300);
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		s.setForeground(Color.blue);
		s.setBounds(500, 100, 75, 25);
		c.add(s);
		
		tf.setForeground(Color.blue);
		tf.setBounds(275, 100, 165, 25);
		c.add(tf);
		
		w.setBackground(Color.cyan);
		w.setForeground(Color.blue);
		w.setBounds(275, 75, 100, 25);
		c.add(w);
		
		/*i.setBackground(Color.cyan);
		i.setForeground(Color.blue);
		i.setBounds(300, 75, 100, 25);
		c.add(i);
		*/
		
		lyco = getImage(getDocumentBase(), "lycos.png");
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(lyco, 5, 50, this);
	}

}
