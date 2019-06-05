/* Jacob Gidley, CIS 111-02
 * -----------------------------
 * Pizza Order Frame Assignment 
 * -----------------------------
 * This Frame will display a pizza order form.
 * The user will be able to choose the size of their pizza
 * by clicking on a button with the corresponding size. 
 * The user will also be able to add a side order of wings by clicking on a checkbox.
 * They will also be able to select their choices of toppings from a list.
 * The price of the pizza order will be updated in real time as the user makes the order.
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.text.DecimalFormat;

public class PizzaOrderFrame extends JFrame implements ItemListener, ListSelectionListener
{
  double sizePrice, totalPrice, toppingPrice;
  
  DecimalFormat dfNum = new DecimalFormat("$#0.00"); // Formats price into currency
  
  // Create font
  Font head = new Font("Times New Roman", Font.BOLD, 18);
  
  // Create panels
  JPanel top = new JPanel();
  JPanel mid = new JPanel();
  JPanel bottom = new JPanel();
  
  // Create labels
  JLabel header = new JLabel("HVCC Pizza Parlor");
  JLabel instruct = new JLabel("Choose your pizza size and toppings ($1 each)");
  JLabel bottomHeader = new JLabel("Price of your pizza is: " + dfNum.format(totalPrice));
  
  // Create array of values for JList
  String[] toppings = {"Eggplant", "Green Peppers", "Hot Peppers", "Pepperoni", "Sausage", "Mushrooms", "Anchovies"};
  JList toppingList = new JList(toppings);
  
  // Create radio buttons and button group
  JRadioButton small = new JRadioButton("Small ($7)"); 
  JRadioButton medium = new JRadioButton("Medium ($9)");
  JRadioButton large = new JRadioButton("Large ($11)");
  JRadioButton xLarge = new JRadioButton("X-Large ($13)");
  ButtonGroup group = new ButtonGroup();
  
  // Create checkbox
  JCheckBox cBox = new JCheckBox("Side Order Hot Wings - add $5.00");
  
  // Create border layout, grid layouts, and container
  BorderLayout bord = new BorderLayout();
  GridLayout gridTop = new GridLayout(2,1);
  GridLayout gridMid = new GridLayout(1,5);
  GridLayout gridBottom = new GridLayout(1,2);
  Container c;

  // Frame constructor
public PizzaOrderFrame()
{
  super("Pizza Order Form");
  c = getContentPane();
  c.setLayout(bord);
  
  // Setup top panel headers
  top.setLayout(gridTop);
  top.setBackground(Color.orange);
  header.setBackground(Color.orange);
  header.setFont(head);
  header.setHorizontalAlignment(JLabel.CENTER);
  instruct.setBackground(Color.cyan);
  instruct.setHorizontalAlignment(JLabel.CENTER);
  top.add(header);
  top.add(instruct);
  c.add(top, bord.NORTH);
  
  // Setup center panel buttons and list
  mid.setLayout(gridMid);
  small.setBackground(Color.white);
  medium.setBackground(Color.white);
  large.setBackground(Color.white);
  xLarge.setBackground(Color.white);
  group.add(small);
  group.add(medium);
  group.add(large);
  group.add(xLarge);
  mid.add(small);
  mid.add(medium);
  mid.add(large);
  mid.add(xLarge);
  mid.add(toppingList);
  c.add(mid);
  
  //Setup bottom panel labels and checkbox
  bottom.setLayout(gridBottom);
  bottom.setBackground(Color.orange);
  bottomHeader.setFont(head);
  bottom.add(bottomHeader);
  cBox.setBackground(Color.orange);
  bottom.add(cBox);
  c.add(bottom, bord.SOUTH);
  
  // Set frame size and visibility
  setSize(550, 225);
  setResizable(false);
  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  setVisible(true);
  
  // Add Listeners
  small.addItemListener(this);
  medium.addItemListener(this);
  large.addItemListener(this);
  xLarge.addItemListener(this);
  cBox.addItemListener(this);
  toppingList.addListSelectionListener(this);
}

/* Gets the size selected by the user and update the 
 * price in real time
 * */
public void itemStateChanged(ItemEvent e)
{
   
  if (small.isSelected())
  {
    sizePrice = 7.0;
  }
  else if (medium.isSelected())
  {
    sizePrice = 9.0;
  }
   else if (large.isSelected())
  {
    sizePrice = 11.0;
  }
    else if (xLarge.isSelected())
  {
    sizePrice = 13.0;
  }
  
  if (cBox.isSelected()) // Checks if wings selected
  {
    sizePrice += 5.0;
  }
   totalPrice = sizePrice + toppingPrice;
   bottomHeader.setText("Price of your pizza is: " + dfNum.format(totalPrice));
}
/* Gets the amount of toppings select the user selects 
 * and updates the price accordingly 
 * */
public void valueChanged(ListSelectionEvent e)
{
  toppingPrice = 0.0;
  int i;
  int[] selectToppings;
  selectToppings = toppingList.getSelectedIndices();
  
  for(i = 0; i < selectToppings.length; i++)
  {
      toppingPrice += 1.0;
  }
   totalPrice = sizePrice + toppingPrice;
   bottomHeader.setText("Price of your pizza is: " + dfNum.format(totalPrice));
}

// Frame runs itself
 public static void main(String[] args)
  {
    PizzaOrderFrame f = new PizzaOrderFrame();
  }

}