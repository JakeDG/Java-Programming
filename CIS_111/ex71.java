/*Exercise 7-1
 * This program will calculate days and milliseconds until next
 * summer using Date objects
 * */
import java.util.*;

public class ex71
{
  public static void main(String[] args)
  {
    Date today = new Date();
    Date summer = new Date(today.getYear(), 5, 21);
    Date year = new Date(today.getYear() + 1, 0, 1);
    long ms;
    int days;
    
    System.out.println("Today is " + today);
    System.out.println("Summer begins on " + today);
    System.out.println("Next year begins on " + year);

    ms = summer.getTime() - today.getTime();
    days = (int)(ms/1000.0/60/60/24);
    
    System.out.println("Number of miliseconds until summer is " + days);
    System.out.println("Number of days until summer is " + ms);
    
    ms = year.getTime() - today.getTime();
    days = (int)(ms/1000.0/60/60/24);
    
    System.out.println("Number of miliseconds until next year is " + ms);
    System.out.println("Number of days until next year is " + days);
  }
}