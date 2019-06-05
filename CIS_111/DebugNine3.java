// This program constructs a Table and a Desk
public class DebugNine3
{
  public static void main(String[] args)
  {
    DebugDesk aDesk = new DebugDesk();
    DebugTable aTable = new DebugTable();
 aTable.printHeader();
 aTable.setTable();
 aTable.printTable();
 aDesk.printHeader();
 aDesk.setTable();
 aDesk.setDrawers();
 aDesk.printDesk();
  }
}
