//Created by: Aaron Jenner, Rook, Mike Leto, Jacob Gidley
import java.util.*; //miport scanner and random number generator

public class randomArray
{
  public static void main(String[]args)
  {
    
    Scanner keyboard = new Scanner(System.in); //Name scanner
    System.out.println("Enter the amount of numbers in the array"); //Ask for length of the array 
    int number = keyboard.nextInt(); //Initialize the number to a variable 
    int[] randomNum = new int[number]; //Assign random numbers to the array 
    createArray(randomNum); //Call the create array method
    displayArray(randomNum); //Call the display array method
    sortArray(randomNum); //Call the sort array method
    displayArray(randomNum); 
    
  }
    
    public static void createArray (int[] randomNum) //Creates the array
    {
      Random random = new Random();
      for (int i =0; i < randomNum.length; i++)
      {
        int num = random.nextInt(1000) + 1;
        randomNum[i] = num;
      }
    }
    
    public static void displayArray (int[] randomNum) //Displays numbers in array
    {
      for (int i =0; i < randomNum.length; i++)
      {
        System.out.print(randomNum[i] + ", ");
      }
      System.out.println("\n");
    }
    
    public static void sortArray (int[] randomNum) //Sorts the array into correct order
    {
      int n = randomNum.length;
      int temp = 0;
      
      for (int i = 0; i < n; i++)
      {
        for (int j = 1; j < (n - i); j++)
        {
          if (randomNum[j - 1] < randomNum[j])
          {
            temp = randomNum[j - 1];
            randomNum[j - 1] = randomNum[j];
            randomNum[j] = temp;
          }
        }   
      }
    }
        
}
