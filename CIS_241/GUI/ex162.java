/* Jacob Gidley
 * Exercise 16-2
 * This applet will have a toolbar to pick an image
 */

package gui16;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex162 extends JApplet implements ActionListener
{
	JButton b = new JButton("Brosius");
	JButton m = new JButton("Martinez");
	JButton j = new JButton("Jeter");
	JToolBar bar = new JToolBar(SwingConstants.VERTICAL);
	
	JMenuBar mbar = new JMenuBar();
	JMenu homers = new JMenu("Home Runs");
	JMenuItem br = new JMenuItem("Brosius");
	JMenuItem ma = new JMenuItem("Martinez");
	JMenuItem je = new JMenuItem("Jeter");
	
	Container c;
	Image bros, mart, jet;
	
	
	public void init()
	{
		setSize(400, 300);
		c = getContentPane();
		b.setMnemonic('b');
		b.setToolTipText("Brosius");
		m.setMnemonic('m');
		m.setToolTipText("Martinez");
		j.setMnemonic('j');
		j.setToolTipText("Jeter");
		bar.add(b);
		bar.add(m);
		bar.add(j);
		c.add(bar);
		b.addActionListener(this);
		m.addActionListener(this);
		j.addActionListener(this);
		
		setJMenuBar(mbar);
		mbar.add(homers);
		homers.add(br);
		homers.add(ma);
		homers.add(je);
		
		br.addActionListener(this);
		ma.addActionListener(this);
		je.addActionListener(this);
		
		bros = getImage(getDocumentBase(), "brosius1.jpg");
		mart = getImage(getDocumentBase(), "martinez1.jpg");
		jet = getImage(getDocumentBase(), "jeter1.jpg");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Graphics g = getGraphics();
		paint(g);
		if (e.getSource() == b || e.getSource() == br)
		{
			g.drawImage(bros, 100, 100, this);
		}
		else if (e.getSource() == m || e.getSource() == ma)
		{
			g.drawImage(mart, 100, 100, this);
		}
		else if (e.getSource() == j || e.getSource() == je)
		{
			g.drawImage(jet, 100, 100, this);
		}
	}

}
