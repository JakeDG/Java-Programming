// Guess all PINs until it guesses correctly
// 4 - digit PIN
public class HackPIN
{
  public static void main(String[] args)
  {
    // Constant to hold PIN
    final short PIN = 2931;
    
    // Counter varialbe for guess
    short guess = 0;
    
   // While loops to try all PINs
    while (guess != PIN)
    {
      guess++;
    }
    
    System.out.println("The PIN is " + guess);
  }
}