/* Exercise 9-1 sub Class
 * This class will define a 3D rectangle prism cube
 * */

public class Cube91 extends Rectangle91 // Cube91 is a rectangle
{
  private double depth; // new data field
  
  public Cube91(double l, double w, double d)
  {
    super(l, w); // super rectangle constructor
    depth = d;
    area = 2 * length * width + 2 * length * depth + 2 * width * depth;
  }
  
  public void setDepth(double d) // new method
  {
    depth = d;
  }
  
  public void calcArea()
  {
    area = 2 * length * width + 2 * length * depth + 2 * width * depth;
  }
  
  public void print() // override
  {
    super.print(); // Rectangle91 print
    System.out.printf("Depth = %.2f\n", depth);
  }
}