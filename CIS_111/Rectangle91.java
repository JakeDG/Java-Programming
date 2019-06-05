/* Exercise 9-1 Super Class
 * This class will define a rectangle
 * */

public class Rectangle91
{
  protected double length;
  protected double width;
  protected double area;
  
  public Rectangle91(double l, double w)
  {
    length = l;
    width = w;
    area = length * width;
  }
  
  public void setLength(double l)
  {
    length = l;
  }
  public void setWidth(double w)
  {
    width = w;
  }
  public void calcArea()
  {
    area = length * width;
  }
  public void print()
  {
    System.out.printf("Length = %.2f\n", length);
    System.out.printf("Width = %.2f\n", width);
    System.out.printf("Area = %.2f\n", area);
  }
}