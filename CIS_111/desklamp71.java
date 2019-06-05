public class desklamp71
{
 private String color;
 private boolean on;
 private int bulbwatts;

 public desklamp71(String c)
 {
  color = c;
  on = false;
  bulbwatts = 60;
 }

 public void setbulbwatts(int b)
 {
  bulbwatts = b;
 }

 public String getcolor()
 {
  return color;
 }
 public boolean geton()
 {
  return on;
 }
 public int getbulbwatts()
 {
  return bulbwatts;
 }

 public void turnon()
 {
  on = !on;
 }
}
