/* Exercise 11-1
 * This program will create a yankees linked list
 * */

import java.util.*;

public class ex111
{ 
  public static void main(String[] args)
  {
     int num;
     String player; 
     Scanner sc = new Scanner(System.in);
     yankees111b y = new yankees111b(); // linked list
     
     y.first("Jeter", 2);
     y.add("Teixeira", 25);
     y.add("A-Rod", 13);
     y.add("Gardener", 11);
     y.add("Ellsbury", 19);
     y.add("Beltran", 36);
     y.add("Sabathia", 52);
     
     System.out.print("Enter number to find player's name: ");
     num = sc.nextInt();
     player = y.search(num);
     if(!player.equals("-1"))
     {
       System.out.println("Player's name is " + player);
     }
     else
     {
       System.out.println("Player not found");
     }
     
     System.out.println();
     y.display();
     y.del();
  }
}

     