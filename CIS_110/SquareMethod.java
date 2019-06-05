//This program will 
public class SquareMethod
{
  public static void main(String[] args)
  {
    double num = 6;
    squareMethod(num);
    System.out.println(squareMethod(num));
  }
  public static double squareMethod(double num)
  {
    num = Math.pow(6.0,2.0);
    return num;
  }
}