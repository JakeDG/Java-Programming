package Threads14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex144 extends JFrame implements ActionListener
{

		ball144 b = new ball144();
		JButton jb = new JButton("Click");
		JLabel jl = new JLabel();
		
		public ex144(String s)
		{
			super(s);
			setSize(100, 100);
			setLayout(new FlowLayout());
			add(jb);
			add(jl);
			jb.addActionListener(this);
			b = new ball144();
			b.setSize(500, 300);
			b.setVisible(true);
			setVisible(true);
			new Thread(b).start();
		}
		
		public void actionPerformed(ActionEvent e)
		{
			jl.setText("You clicked");
			b.end();
		}
		
		public static void main(String[] args)
		{
			ex144 jf = new ex144("Click");
		}

}


