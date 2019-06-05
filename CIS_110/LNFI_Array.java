//Created by: Aaron Jenner, Rook, Mike Leto, Jacob Gidley

import java.util.*; //Import random number generator and scanner
  
public class LNFI_Array
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in); //Name scanner object
    Random random = new Random(); //Name random object
    
    int[] numbers = new int [20]; //Create array
    int guess; //Store guess
    boolean answer = false;
    
    for (int i = 0; i < numbers.length; i++) //Assigns random numbers between 100 & 200 to all elements in the array
    {
      int num = random.nextInt(100) + 101;
      numbers[i] = num;
    }
    
    System.out.println("The largest number is " + Largest(numbers)); //Print largest number
    System.out.println("The smallest number is " + Smallest(numbers)); //Print smallest number
    System.out.println("There are " + Even(numbers) + " even numbers"); //Print amount of even
    System.out.println("Enter -1 to end the program."); //Display option to end the program
    System.out.println("Please enter a number between 100 and 200."); //Ask for guess
    
    guess = keyboard.nextInt();
    
    while (guess != -1) //Checks if your guess is greater than 0
    {
      answer = Findit(numbers, guess);
      if (answer == true)
      {
        System.out.println("That number is in the array!");
        System.out.println("Enter -1 to end the program.");
        System.out.println("Please enter another number.");
        guess = keyboard.nextInt();  
      }
      else if (answer == false)
      {
        System.out.println("That number is not in the array.");
        System.out.println("Enter -1 to end the program.");
        System.out.println("Please enter another number.");
        guess = keyboard.nextInt();
      }
      
    }
    
    PrintThem(numbers);

                       
  }
  
  public static int Largest (int[] numbers) //Finds largest number
  {
    int highest = numbers[0];
    
    for (int i = 0; i < numbers.length; i++)
    {
      if (numbers[i] > highest)
        highest = numbers[i];
    }
    
    return highest; //Return the highest number in the array
  }
  
   public static int Smallest (int[] numbers) //Finds smallest number
  {
    int smallest = numbers[0];
    
    for (int i = 0; i < numbers.length; i++)
    {
      if (numbers[i] < smallest)
        smallest = numbers[i];
    }
    
    return smallest; //Return smallest number in the array
  }
   
   public static int Even(int[] numbers) //Finds the amount of even numbers
   {
     int even = 0;
     
     for (int i = 0; i < numbers.length; i++)
     {
       if (numbers[i] % 2 == 0)
       {
         even++;
       }
     }
     
     return even; //Return numbe of even numbers
   }
   
   public static boolean Findit (int[] numbers, int guess) //Checks if guess number is in the array
   {
     boolean decision = false;
     
     for (int i =0; i < numbers.length; i++)
     {
       if (guess == numbers[i])
       {
         decision = true;
       }
     }
     
     return decision; 
     
   }
   
   public static void PrintThem (int[] numbers) //Prints all the numbers in the array
   {
     for (int i = 0; i < numbers.length; i++)
     {
       System.out.print(numbers[i] + ", ");
     }
   }  
  
}