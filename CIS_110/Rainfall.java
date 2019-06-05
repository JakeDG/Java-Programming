/* Rainfall class 
 * Written by Jacob Gidley
 * This program will display the total, average, highest, and lowest amount of rainfall for the given input of the 12 months.
 */

import java.util.Scanner; //Import scanner

public class Rainfall
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in); //Create scanner object
    int count = 0;
    double[] rain = new double[12]; //Create array
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; //Array of the names of the months 
    double input; //Takes input from the user
    
    for (int i = 0; i < rain.length; i++)//Continues to ask for the amount of rainfall per month and also increments number of month
    {
     
      System.out.println("Please enter the amount of rainfall for " + months[i] + "."); //Ask for the rainfall for the given month
      input = keyboard.nextDouble();
      
      while (input < 0) //Checks if input is not negative
      {
        System.out.println("You cannot have a negative value for the rainfall!");
        System.out.println("Please enter a different value for " + months[i] + "."); //Ask again for the rainfall for the given month
        input = keyboard.nextInt();
      }
      
        rain[i] = input; //Assign values to the rain array
                        
    }
    
    //Call Methods
    totalRainfall(rain); //Call total rainfall method
    averageRainfall(rain); //Call average method
    
    //Display info
    System.out.println("The total rainfall for the year is " + totalRainfall(rain)); //Display the total amount of rainfall for the year
    System.out.println("The average rainfall for the year is " + averageRainfall(rain)); //Display the average amount of rainfall for the year
    
    double highestMonth = highest(rain); //Stores call to method
    while (highestMonth != rain[count])
    {
      count++;
    }
    System.out.println("The highest amount of rainfall was in " + months[count]); //Display the month with the most amount of rain
    
    count = 0;
    double lowestMonth = lowest(rain); //Stores call to method
    while (lowestMonth != rain[count])
    {
      count++;
    }
    System.out.println("The lowest amount of rainfall was in " + months[count]); //Display the month with the least amount of rain
    
  }
    
    public static double totalRainfall (double[] rain) //Sums up the total rainfall for the year
    {
      double total = 0; //accumulator 
      for (int i = 0; i < rain.length; i++)
      {
        total += rain[i];
      }
      
      return total; //Return the total amount of rainfall
      
    }
    
    public static double averageRainfall (double[] rain) //Finds the average of the total rainfall for the year
    {
      double total = 0; //accumulator
      double average; //Stores the average
      for (int i = 0; i < rain.length; i++)
      {
        total += rain[i];
      }
      
      average = total / rain.length;
      
      return average; //Return the total amount of rainfall
      
    }
    
    public static double highest (double[] rain)//Finds highest value
    {
      double highest = rain[0]; //Stores highest value
      
      for (int i = 1; i < rain.length; i++)
      {
        if (rain[i] > highest)
        {
          highest = rain[i]; //Stores highest value
        }
      }
      
      return highest; //Return the highest amount of rainfall
         
    }
    
    public static double lowest (double[] rain)//Finds lowest value
    {
      double lowest = rain[0];
      
      for (int i = 1; i < rain.length; i++)
      {
        if (rain[i] < lowest)
        {
          lowest = rain[i]; //Stores lowest value
          
        }
      }
      
      return lowest; //Return the lowest amount of rainfall
         
    }
    
}