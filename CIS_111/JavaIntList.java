 /* Jacob Gidley, CIS 111-02
 * -------------------------------------------
 * Random Java Integer Linked List Main Class
 * -------------------------------------------
 * This program will create a linked list of java integers.
 * The user will input how many integer they wish to create .
 * The program will then get a random value and assign it to each integer created.
 * The intergers will then be put in a list, which will then be sorted.
 * The program will print the index #, the original index #, and the random value
 * of the corresponding integer. It will also find and print the mean, median, 
 * and range of values in the list, as well as pick a random index number 
 * and its the random value.
 * */
import java.util.*;

public class JavaIntList
{
  public static void main(String[] args)
  {
    JavaInt j; // Reference object
    int amt, rand, i;
    double mean = 0;
    int range = 0;
    int median = 0;
    int sum = 0;
    
    // Create the linked list 
    LinkedList<JavaInt> nList = new LinkedList<JavaInt>();
    ListIterator li; // List iterator
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many numbers do you want to create?");
    amt = sc.nextInt();
    
    // Create java integers
    for(i = 0; i < amt; i++)
    {
      rand = (int)(Math.random()*150+1);
      nList.add(new JavaInt(i, rand));
    }
    
    Collections.sort(nList); // Sort the list
    
    li = nList.listIterator(); // Put iterator at begining of list
    System.out.println("Index   Order   Random");
    System.out.println("--------------------------");
    
    while(li.hasNext()) // Iterate through the list
    {
       j = (JavaInt)li.next();
      System.out.printf("%3d %7d %8d\n", nList.indexOf(j), j.getOriginal(), j.getRandom());
    }
    
    li = nList.listIterator();
    
    // Sum up the random values
    while(li.hasNext())
    {
      j = (JavaInt)li.next();
      mean += j.getRandom(); 
    }
    
    // Get the range and median of the values in the list
    range = nList.getLast().getRandom() - nList.getFirst().getRandom();
    median =  nList.get(nList.size()/2).getRandom();
    sum = (int)mean;
    
    // Get random object
    j = nList.get((int)(Math.random() * nList.size()));
    
    // Print out results
    System.out.println("--------------------------");
    System.out.println("Sum: " + sum);
    System.out.printf("Mean: %.2f\n", (double)mean/nList.size());
    System.out.println("Median: " + median);
    System.out.println("Range: " + range);
    System.out.println("Random Index: " + j.getOriginal());
    System.out.println("Random Index Integer: " + j.getRandom());
    System.out.println("--------------------------\n");
     
  }
}
