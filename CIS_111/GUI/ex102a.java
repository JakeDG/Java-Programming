/* Exercise 10-2a
 * This program will use a jcombobox for a multiple
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex102a extends JApplet implements ItemListener
{
  JLabel question = new JLabel("Clicking a JComboBox results in");
  //JComboBox answers = new JComboBox();
  
  JRadioButton ans1 = new JRadioButton("Check Mark");
  JRadioButton ans2 = new JRadioButton("Item Dimmed");
  JRadioButton ans3 = new JRadioButton("Display a Menu");
  JRadioButton ans4 = new JRadioButton("Disable a Button");
  ButtonGroup group = new ButtonGroup();
  
  JLabel results = new JLabel();
  FlowLayout flow = new FlowLayout();
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    question.setForeground(Color.blue);
    c.add(question);
    
    ans1.setForeground(Color.blue);
    ans1.setBackground(Color.cyan);
    ans2.setForeground(Color.blue);
    ans2.setBackground(Color.cyan);
    ans3.setForeground(Color.blue);
    ans3.setBackground(Color.cyan);
    ans4.setForeground(Color.blue);
    ans4.setBackground(Color.cyan);
    
    group.add(ans1);
    group.add(ans2);
    group.add(ans3);
    group.add(ans4);
   
    c.add(ans1);
    c.add(ans2);
    c.add(ans3);
    c.add(ans4);
    
    results.setForeground(Color.blue);
    c.add(results);
    ans1.addItemListener(this);
    ans2.addItemListener(this);
    ans3.addItemListener(this);
    ans4.addItemListener(this);
  } 
    public void itemStateChanged(ItemEvent e)
    {
      if(ans3.isSelected())
      {
        results.setText("Great");
      }
      else
      {
        results.setText("Try again");
      }
    }
  }
