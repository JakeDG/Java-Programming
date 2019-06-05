/* Exercise 9-2 sub class
 * This will define a suite
 * */

public class suite92 extends hotelroom92
{
  private double price;
  
  public suite92 (int n)
  {
    super(n);
    roomrate += 30;
  }
}