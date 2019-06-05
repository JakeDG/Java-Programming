/* Exercise 101a
 * This program will open a frame with a quote
 * */

import java.awt.*;
import javax.swing.*;

public class ex101a
{
  public static void main(String[] args)
  {
    JFrame f = new JFrame("Quote Frame");
    JLabel quote = new JLabel("Suck balls");
    Font ravie = new Font("Ravie", Font.BOLD, 24);
    FlowLayout flow = new FlowLayout();
    Container c;
    c = f.getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    quote.setForeground(Color.blue);
    quote.setFont(ravie);
    c.add(quote);
    f.setTitle("Quote Frame Title");
    f.setSize(250, 100);
    f.setResizable(false);
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  
}

  