/* Exercise 10-3a
 * This applet will use a jList of Yankee opponents
 * */

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class ex103 extends JApplet implements ListSelectionListener
{
  JLabel yanks = new JLabel("Select Yankee Opponents");
  String[] opponentNames = {"Red Sox", "Mets", "Blue Jays", "Orioles", "Rays"};
  JList opponents = new JList(opponentNames);
  JLabel teams = new JLabel();
  FlowLayout flow = new FlowLayout();
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(flow);
    c.setBackground(Color.cyan);
    yanks.setForeground(Color.blue);
    c.add(yanks);
    
    opponents.setForeground(Color.blue);
    c.add(opponents);
    
    teams.setForeground(Color.blue);
    c.add(teams);
    opponents.addListSelectionListener(this);
  } 
    public void valueChanged(ListSelectionEvent e)
    {
      int i;
      int[] selectTeams;
      teams.setText("");
      selectTeams = opponents.getSelectedIndices();
      for (i = 0; i < selectTeams.length; i++)
      {
         teams.setText(teams.getText() + " " + opponentNames[selectTeams[i]]);
      }
    }
}
