/* Charge Account Validation
 * The program lets the user enter a charge account number to see if it's a valid account number
 * Written by Jacob Gidley
 */

import java.util.*; //Import scanner

public class AccountValidation
{
  /**
   * Creates the scanner object.
   * Intializes the account numbers array.
   * Accepts users guess input.
   * Calls the isValid method.
   * Displays if account number entered is valid or not.
   * If program is terminated then display the numbers in the array.
   */
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    //Create array with 3 rows that have 6 columns each
    int[][] accountNums = { 
      {5658845, 4520125, 7895122, 8777541, 8451277, 1302850}, 
      {8080152, 4562555, 5552012, 5050552, 7825877, 1250255}, 
      {1005231, 6545231, 3852085, 7576651, 7881200, 4581002} };
   
    int input; //Stores users input
    boolean valid = false;
    
    System.out.println("Enter -1 to end the program.");
    System.out.println("Please enter a charge account number.");
    input = keyboard.nextInt(); //Get the users input
    
    while (input != -1) //Checks if you ended the program
     {
      valid = isValid(accountNums, input);//Stores the return value of a method
      
      if (valid == true) //Checks if input number is true
      {
        System.out.println("That is a valid account number!");
        System.out.println("Enter -1 to end the program.");
        System.out.println("Please enter another account number.");
        input = keyboard.nextInt();
      }
      else if (valid == false) //Checks if input number is false
      {
        System.out.println("That is not a valid account number.");
        System.out.println("Enter -1 to end the program.");
        System.out.println("Please enter another account number.");
        input = keyboard.nextInt();
      }
    }
  }
 
  /**
   * Checks if the users account number is correct
   * @param accountNums This is the array of valid account numbers
   * @param input This is the users account number input
   * @return true if the number is correct or false if the number is incorrect
   */
  public static boolean isValid (int[][] accountNums, int input)
  {
     boolean correct = false;
     
     for (int r = 0; r < accountNums.length; r++) //Counts from 0 to 2 (The number of rows)
     {
       for (int c = 0; c < accountNums[0].length; c++) //Counts from 0 to 5 (The number of columns)
       {
         if (input == accountNums[r][c]) //Checks if the users input is equal to one of the valid account numbers
         {
           correct = true;
         }
       }
     }   
     
     return correct;     
  }
}
 