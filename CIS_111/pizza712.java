/* Exercise 7-13
 * This class will define a pizza 
 * */
public class pizza712
{
  private char size;
  private String topping;
  
  public pizza712()
  {
    size = 'L';
    topping = "Cheese";
  }
    
  public void setSize(char s)
  {
    size = s;
  }
  
  public void setTopping(String t)
  {
    topping = t;
  }
  
  public char getSize()
  {
    return size;
  }
  
  public String getTopping()
  {
    return topping;
  }
}
    