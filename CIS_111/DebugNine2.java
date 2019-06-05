// This program constructs a Desk
// The Desk descends from Table - it "is a" Table with drawers
public class DebugNine2
{
  public static void main(String[] args)
  {
 DebugDesk aDesk = new DebugDesk();
 aDesk.printHeader();
 aDesk.setTable();
 aDesk.setDrawers();
    aDesk.printDesk();
  }
}
