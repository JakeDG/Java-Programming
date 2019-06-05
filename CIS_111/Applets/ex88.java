/* Exercise 8-8
 * This program will display the price of a pizza
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class ex88 extends JApplet implements ActionListener
{
    pizza715[] p = new pizza715[4]; 
    
    JLabel pizInput = new JLabel("Enter 1st pizza size (Small, Medium, Large, X-Large): ");
    JTextField pizField = new JTextField(10);
    JLabel pizOutput = new JLabel();
    FlowLayout flow = new FlowLayout();
    Container c;
    
    public void init()
    {
      c = getContentPane();
      c.setLayout(flow);
      c.setBackground(Color.cyan);
      
    
      p[0] = new pizza715("Small", 7.00);
      p[1] = new pizza715("Medium", 9.00);
      p[2] = new pizza715("Large", 11.00);
      p[3] = new pizza715("X-Large", 13.00);
    
      pizInput.setForeground(Color.blue);
      c.add(pizInput);
      pizField.setForeground(Color.blue);
      c.add(pizField);
      pizOutput.setForeground(Color.blue);
      c.add(pizOutput);
      pizField.requestFocus();
      pizField.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      
      int i;
      boolean found = false;
      String size;
      NumberFormat curNum = NumberFormat.getCurrencyInstance();
      
      size = pizField.getText();
    
      for (i = 0; i < p.length; i++)
      {
        if (size.equalsIgnoreCase(p[i].getSize()))
        {
          pizOutput.setText("Price is " + curNum.format(p[i].getPrice()));
          found = true;
          break;
        }
      }
      if (!found)
      {
        pizOutput.setText("We don't sell that size pizza");
      }   
    }
}