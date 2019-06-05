/* Jacob Gidley, Sajiel Chishti
 * CIS 111-02
 * --------------------------
 * Oval Applet Class
 * --------------------------
 * This applet will draw ovals depending on the users input.
 * This applet will also include a frame as a part of it.
 * The frame will be created in the applet.
 * The user will input the coordinates, width, and height
 * of an oval and click draw. The oval will then be drawn in the applet.
 * */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OvalApplet extends JApplet implements ActionListener
{
  int i;
  int x,y;
  int width;
  int height;
  boolean fill;
  Color col;
  Oval temp;
  
  JFrame f = new JFrame("Shapes"); // Create frame
  LinkedList<Oval> ovalList = new LinkedList<Oval>();
  ListIterator li;
  
  // Create font
  Font head = new Font("Times New Roman", Font.BOLD, 20);
  
  // Color Array
  String[] colNames = {"Blue", "Red", "Orange", "Green", "Dark Grey", "Cyan", "Pink"}; 
  Color[] colors = {Color.blue, Color.red, Color.orange, Color.green, Color.darkGray, Color.cyan, Color.pink}; 
  // Create combo box
  JComboBox colorBox = new JComboBox();
  
  // Create labels
  JLabel header = new JLabel("Create an Oval");
  JLabel xLab = new JLabel("X Coordinate");
  JLabel yLab = new JLabel("Y Coordinate");
  JLabel widthLab = new JLabel("Width");
  JLabel heightLab = new JLabel("Height");
  
  // Create Textfield
  JTextField xField = new JTextField(2);
  JTextField yField = new JTextField(2);
  JTextField widthField = new JTextField(2);
  JTextField heightField = new JTextField(2);
  
  // Create buttons
  JButton draw = new JButton("Draw");
  JButton another = new JButton("Another");
  
  // Create checkbox
  JCheckBox cBox = new JCheckBox("Fill");
  
  // Create panels
  JPanel mid = new JPanel();
  JPanel bottom = new JPanel();
  
  // Create border layout, grid layouts, and containers
  Container c; // Container for the applet
  Container c2; // Container for the frame
  BorderLayout bord = new BorderLayout();
  GridLayout gridMid = new GridLayout(4,2);
  GridLayout gridBottom = new GridLayout(1,4);
    
  public void init()
  {
    c = getContentPane();
    c2 = f.getContentPane();
    c2.setLayout(bord);
    
    // Setup header
    header.setFont(head);
    c2.add(header, bord.NORTH);
    header.setHorizontalAlignment(JLabel.CENTER);
      
    // Setup mid panel
    mid.setLayout(gridMid);
    mid.add(xLab);
    mid.add(xField);
    mid.add(yLab);
    mid.add(yField);
    mid.add(widthLab);
    mid.add(widthField);
    mid.add(heightLab);
    mid.add(heightField);
    c2.add(mid);
    
    // Setup combo box & add to bottom panel
    for (i = 0; i < colNames.length; i++)
    {
      colorBox.addItem(colNames[i]);
    }
    colorBox.setSelectedIndex(-1);
    colorBox.setBackground(Color.white);
    
    //Setup bottom panel labels and checkbox
    bottom.setLayout(gridBottom);
    bottom.add(cBox);
    bottom.add(colorBox);
    bottom.add(draw);
    bottom.add(another);
    
    c2.add(bottom, bord.SOUTH);
    
    // Set frame size and visibility
    f.setSize(500, 225);
    f.setResizable(false);
    f.setVisible(true);
    
    // Add action listeners
    another.addActionListener(this);
    draw.addActionListener(this);
    xField.requestFocus(); // Focus on x coordinate field
  }
  
  public void actionPerformed(ActionEvent e)
  {
    // If the draw button is clicked, then draw the oval
    if (e.getSource() == draw)
    {
      int cIndex;
      x = Integer.parseInt(xField.getText());
      y = Integer.parseInt(yField.getText());
      width = Integer.parseInt(widthField.getText());
      height = Integer.parseInt(heightField.getText());
      
      fill = false;
          
       if (cBox.isSelected())
        {
          fill = true;
        }
       
      cIndex = colorBox.getSelectedIndex();
      col = colors[cIndex];
      temp = new Oval(x, y, width, height, fill, col);
      ovalList.add(temp); // add the oval to the list
      
      repaint();
    }
    
    // Restores all fields to empty and unchecks the combo box
    if (e.getSource() == another)
    {
      xField.setText("");
      yField.setText("");
      widthField.setText("");
      heightField.setText("");
      colorBox.setSelectedIndex(-1);
      cBox.setSelected(false);
      xField.requestFocus(); // Focus on x coordinate field
    }
   
  }
    // Paints the oval onto the applet from the linked list
    public void paint(Graphics g)
    {
      super.paint(g);
      li = ovalList.listIterator(); 
       while (li.hasNext())
       {
         Oval temp = (Oval)li.next();
         temp.draw(g);
       }
    } 
}
  
