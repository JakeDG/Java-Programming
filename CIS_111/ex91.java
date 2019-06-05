/* Exercise 9-1 Main Class
 * This program will use a rectangle and cube
 * */

public class ex91
{
  public static void main(String[] args)
  {
    Rectangle91 r = new Rectangle91(5, 4);
    Cube91 c = new Cube91(3, 2, 1);
    
    r.setLength(10);
    r.setWidth(5);
    r.calcArea();
    
    c.setLength(5);
    c.setWidth(4);
    c.setDepth(3);
    c.calcArea();
    
    System.out.print("\nRectangle " + r);
    r.print();
    System.out.println("\nCube " + c);
    c.print();
  }
}