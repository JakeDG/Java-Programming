/* Exercise 9-6 Main Class
 * This program will use a rectangle and cube
 * */

public class ex96
{
  public static void main(String[] args)
  {
    Rectangle91[] r = new Rectangle91[2];
    int i;
    
    r[0] = new Rectangle91(5, 4);
    r[1] = new Cube91(3, 2, 1);
    
    for (i = 0; i < r.length; i++)
    {
      System.out.print("\nRectangle " + r[i]);
      r[i].print();
      System.out.println("\nCube " + r[i]);
      r[i].print();
    }
    
    r[0].setLength(10);
    r[0].setWidth(5);
    r[0].calcArea();
    
    r[1].setLength(5);
    r[1].setWidth(4);
    ((Cube91)r[1]).setDepth(3); // Cast rectangle reference to cube object to call sub class cube method
    r[1].calcArea();
    
    for (i = 0; i < r.length; i++)
    {
      System.out.print("\n" + r[i]);
      r[i].print();
    }

  }
}