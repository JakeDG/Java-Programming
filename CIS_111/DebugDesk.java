import java.util.Scanner;
public class DebugDesk extends DebugTable
{
 private int drawers;
 public DebugDesk()
 {
   super();
  drawers = 1;
 }
 public void printHeader()
    {
       System.out.println("Desk: ");
    }
    public void printDesk()
    {
       super.printTable();
        System.out.println("The desk has " + drawers + " drawers");
    }
 public void setDrawers()
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("How many drawers? ");
  drawers = sc.nextInt();
 }
}
