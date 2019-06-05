//This program will display the greater of two numbers
public class GreaterThanMethod
{
  public static void main(String[] args)
  { 
    int num1 = 4; //Store 1st number
    int num2 = 13; //Store 2nd number
    greaterMethod(num1, num2);
    System.out.println(greaterMethod(num1, num2)); //Display the greater number
  }
  public static int greaterMethod(int num1, int num2)
  { 
    int result;
    if (num1 > num2)
    {
      result = num1;
    }
    else
    {
      result = num2;
    }
    
    return result; //Return the greater number
  }
  
}