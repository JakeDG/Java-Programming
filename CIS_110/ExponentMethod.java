public class ExponentMethod
{
  public static void main(String[] args)
  {
    int num1 = 4;
    int power = 2;
    exponent(num1, power);
    System.out.println(exponent(num1, power));
  }
  public static int exponent(int num1, int power)
  {
    
    int powAns = num1;
    int number = 1;
    while (number < power && power != 0)
    {
      number++;
      powAns = num1 * powAns;
    }
    if (power == 0)
    {
      powAns = 1;
    }
    return powAns;
  }
}