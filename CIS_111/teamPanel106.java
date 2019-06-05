/* Exercise 10-6
 * This class will define a team panel
 * */

import java.awt.*;
import javax.swing.*;
 public class teamPanel106 extends JPanel
 {
   JLabel teamNameLab = new JLabel();
   Font teamFont = new Font("Ravie", Font.BOLD, 32);
   FlowLayout flow = new FlowLayout();
    
   public teamPanel106(Color bg, Color fg, String teamName)
   {
     setLayout(flow);
     setBackground(bg);
     teamNameLab.setForeground(fg);
     teamNameLab.setFont(teamFont);
     teamNameLab.setText(teamName);
     add(teamNameLab);
   }
 }
     
     