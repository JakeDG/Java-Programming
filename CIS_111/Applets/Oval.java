/* Jacob Gidley, Sajiel Chishti
 * CIS 111-02
 * -------------------------
 * Oval Class
 * -------------------------
 * This class will define an oval
 * The oval will have X and Y coordinates, as well as,
 * a width and height. It will also have a color and
 * will determine if the oval is filled with that color.
 * */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Event.*;
import javax.swing.*;
import java.awt.*;
 
public class Oval
{
  // Properties
  private int x;
  private int y;
  private int width;
  private int height;
  private boolean fill;
  private Color fillColor;
 
  // Constructor
  public Oval(int x, int y, int w, int h, boolean f, Color c)
  {
    this.x = x;
    this.y = y;
    width = w;
    height = h;
    fill = f;
    fillColor = c;
  }
  
  // Draws the oval
  public void draw(Graphics g)
  {
    g.setColor(fillColor);
 
    if (fill)
    {
      g.fillOval(x, y, width, height);
    }
    else
    {
      g.drawOval(x, y, width, height);
    }
  }
}