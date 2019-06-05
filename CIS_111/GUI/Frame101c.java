/* Exercise 10-1b
 * This program will open a frame with a quote
 * */

import java.awt.*;
import javax.swing.*;

public class Frame101c extends JFrame
{
    JFrame f = new JFrame("Quote Frame");
    JLabel quote = new JLabel("Hello");
    Font ravie = new Font("Ravie", Font.BOLD, 24);
    FlowLayout flow = new FlowLayout();
    Container c;
    
    public Frame101c()
    {
      super("Quote Frame");
      c = getContentPane();
      c.setLayout(flow);
      c.setBackground(Color.cyan);
      quote.setForeground(Color.blue);
      quote.setFont(ravie);
      c.add(quote);
      setTitle("Quote Frame Title");
      setSize(250, 100);
      setResizable(false);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setVisible(true);
  }
  public static void main(String[] args)
  {
    Frame101c f = new Frame101c();
  }
}

  