/* Exercise 10-6
 * This applet will show different teams in panels
 * */

import java.awt.*;
import javax.swing.*;

public class ex106 extends JApplet
{
  teamPanel106 rangers = new teamPanel106(Color.blue, Color.red, "New York Rangers");
  teamPanel106 vikings = new teamPanel106(Color.green, Color.yellow, "Hudson Valley Vikings");
  teamPanel106 yankees = new teamPanel106(Color.blue, Color.darkGray, "New York Yankees");
  teamPanel106 valleyCats = new teamPanel106(Color.red, Color.green, "Tri-City ValleyCats");
  teamPanel106 giants = new teamPanel106(Color.blue, Color.red, "New York Giants");
  Container c;
  GridLayout grid = new GridLayout(5, 1);
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(grid);
    c.add(rangers);
    c.add(vikings);
    c.add(yankees);
    c.add(valleyCats);
    c.add(giants);
  }
}
    
    
      
  
    