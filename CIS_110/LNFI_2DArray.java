/*LNFI_2DArray
 * The program lets the user enter a number to see if it's in the array
 * Written by Jacob Gidley
 */

import java.util.*; //Import random number generator and scanner

public class LNFI_2DArray
{
  /**
   * Creates the scanner object.
   * Intializes the 2D array.
   * Calls the methods.
   * Prints out what the methods return.
   * Accepts users guess input.
   * Displays if guess number is correct or not.
   * If program is terminated then display the numbers in the array.
   */
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in); //Name scanner object
    Random random = new Random(); //Name random object
    
    int[][] numbers = new int [4][4]; //Create array
    int guess; //Store guess
    int answer = 0;
    
    for (int r = 0; r < numbers.length; r++) //Assigns random numbers between 100 & 200 to all elements in the array
    {
      for (int c = 0; c < numbers.length; c++)
      {
        int num = random.nextInt(100) + 101;
        numbers[r][c] = num;
      }
    }
     
    System.out.println("The largest number is " + Largest(numbers)); //Print largest number
    System.out.println("The smallest number is " + Smallest(numbers)); //Print smallest number
    System.out.println("There are " + Even(numbers) + " even numbers"); //Print amount of even
    System.out.println("Enter -1 to end the program."); //Display option to end the program
    System.out.println("Please enter a number between 100 and 200."); //Ask for guess
    
    guess = keyboard.nextInt(); //Get users guess input
    
    while (guess != -1) //Checks if you ended the program
    {
      answer = Findit(numbers, guess);
      if (answer == 1) //Display that the number is in the array
      {
        System.out.println("That number is in the array!");
        System.out.println("Enter -1 to end the program.");
        System.out.println("Please enter another number.");
        guess = keyboard.nextInt();  
      }
      else if (answer == 0)//Display that the number is not in the array
      {
        System.out.println("That number is not in the array.");
        System.out.println("Enter -1 to end the program.");
        System.out.println("Please enter another number.");
        guess = keyboard.nextInt();
      }
      
    }
    
    PrintThem(numbers);//Call the method to print the numbers if the program is terminated
    
  }
  
   /**
   * Finds the largest number in the array
   * @param numbers This is the 2D array containing random numbers
   * @return the largest number 
   */
  public static int Largest (int[][] numbers)
  {
    int highest = numbers[0][0]; //Stores the largest number in the array
    
    //Interates through the rows and columns to find the largest number
    for (int r = 0; r < numbers.length; r++)
    {
      for (int c = 0; c < numbers.length; c++)
      {
        if (numbers[r][c] > highest)
        {
          highest = numbers[r][c];
        }
      }
    }
    
    return highest; //Return the largest number in the array
  }
  
  /**
   * Finds the smallest number in the array
   * @param numbers This is the 2D array containing random numbers
   * @return the smallest number
   */ 
   public static int Smallest (int[][] numbers) //Finds smallest number
  {
    int smallest = numbers[0][0];
    
    //Interates through the rows and columns to find the smallest number
    for (int r = 0; r < numbers.length; r++)
    {
      for (int c = 0; c < numbers.length; c++)
      {
        if (numbers[r][c] < smallest)
        {
          smallest = numbers[r][c];
        }
      }
    }
    
    return smallest; //Return smallest number in the array
  }
   /**
    * Finds the amount of even numbers in the array
    * @param numbers This is the 2D array containing random numbers
    * @return the amount of even numbers 
    */
   public static int Even(int[][] numbers) //Finds the amount of even numbers
   {
     int even = 0; //Stores the amount of even numbers
     
     //Interates through the rows and columns to find the amount of even numbers
     for (int r = 0; r < numbers.length; r++)
     {
       for (int c = 0; c < numbers.length; c++)
       {
         if (numbers[r][c] % 2 == 0)
         {      
           even++;
         }
       }
     }
     
     return even; //Return amount of even numbers
   }
   
   /**
    * Checks if the users guess is in the array
    * @param numbers This is the 2D array containing random numbers
    * @param guess This is the user's guess number
    * @return 1 if the guess is right, 0 if the guess is wrong
    */
   public static int Findit (int[][] numbers, int guess) //Checks if guess number is in the array
   {
     int decision = 0; //Stores the number to indicate if the guess is correct
     
     //Interates through the rows and columns to find out if the guess number is correct
     for (int r =0; r < numbers.length; r++)
     {
       for (int c = 0; c < numbers.length; c++)
       {
         if (guess == numbers[r][c])
         {
           decision = 1;
         }
       }
     }
     
     return decision; //Return if the guess is correct or not
     
   }
   
   /**
    * Prints all of the numbers in the array after the program is terminated
    * @param numbers This is the 2D array containing random numbers
    */
   public static void PrintThem (int[][] numbers) //Prints all the numbers in the array
   {
     for (int r =0; r < numbers.length; r++)
     {
       for (int c = 0; c < numbers.length; c++)
       {
         System.out.print(numbers[r][c] + ", ");
       }
     }   
   }
}