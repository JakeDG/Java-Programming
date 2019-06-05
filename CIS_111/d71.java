import java.io.*;
import java.util.Scanner;
public class d71
{
 public static void main(String[] args) throws IOException
 {
  int watts;
  String color, onans;
  
  BufferedReader br = new
   BufferedReader(new InputStreamReader(System.in));
  Scanner sc = new Scanner(System.in);
  
  desklamp71 d;
  
  System.out.print("Enter color:  ");
  color = br.readLine();
  d = new desklamp71(color);
  
  System.out.print("Enter watts (60 or 75)):  ");
  watts = sc.nextInt();
  if (watts != d.getbulbwatts())
   d.setbulbwatts(watts);
  
  System.out.print("Should the lamp be turned on? (yes/no:  ");
  onans = br.readLine();
  if (onans.equals("yes") && !d.geton())
   d.turnon();
  if (d.geton())
   System.out.println(d.getcolor() + " desklamp is on and has a " +
    d.getbulbwatts() + " watts light bulb");
  else
   System.out.println(d.getcolor() + " desklamp is off and has a " +
    d.getbulbwatts() + " watts light bulb");
 }
}



