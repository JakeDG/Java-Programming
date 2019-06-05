/* Jacob Gidley
 * CIS 111-02
 * -------------------------
 * Cube Set and Get Exercise
 * -------------------------
 * This class will define the properties of a three dimensional cube. 
 * The properties include the length of the side of the cube, color, if the cube is filled or not, 
 * and the volume and surface area of the cube. It will also calculate the surface area and volume 
 * using the value of the side the user provided.
 * It will also have get methods that will return the value of all of the cube's properties 
 * */

public class Cube
{
  private double lengthOfSide;
  private double surfaceArea;
  private double volume;
  private String color;
  private boolean isFilled;
  
  // Default constructor
  public Cube()
  {
    lengthOfSide = 1;
    surfaceArea = 6 * Math.pow(lengthOfSide, 2);
    volume = Math.pow(lengthOfSide, 3);
    color = "Black";
    isFilled = false;
  }
  
  // Sets the cube's color
  public void setColor(String s)
  {
    color = s;
  }
  
  // Sets if the cube is filled or not
  public void setFilled(boolean b)
  {
    isFilled = b;
  }
  
  /* Sets the length of the side of the cube
   * Calculates the surface area and volume of the cube
   * using the length of the side
   * */
  public void setSideLength(double num)
  {
    lengthOfSide = num;
    surfaceArea = 6 * Math.pow(num, 2);
    volume = Math.pow(num, 3);
  }
  
  // Returns the cube's color
  public String getColor()
  {
    return color;
  }
  
  // Returns the cube's filled status
  public boolean getFilled()
  {
    return isFilled;
  }
  
  // Returns the cube's side length
  public double getSideLength()
  {
    return lengthOfSide;
  }
  
  // Returns the cube's volume
  public double getVolume()
  {
    return volume;
  }
  
  // Returns the cube's surface area 
  public double getSurfaceArea()
  {
    return surfaceArea;
  }
}
 