import java.util.Scanner;
public class DebugTable
{
  private int length;
  private int width;
  private int area;
  
 public DebugTable()
 {
   length = 1;
   width = 1;
   area = length * width;
 }
 
 public void printTable()
 {
  System.out.println("Surface Area = " + area);
 }
 
 public void printHeader()
    {
     System.out.println("Table: ");
    }
 
 public void setTable()
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the length of the top ");
   length = sc.nextInt();
   System.out.print("Enter the width of the top ");
   width = sc.nextInt();
   area = length * width;
  }
}


