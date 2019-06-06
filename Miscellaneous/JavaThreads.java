/*
* Developed by Jacob Gidley, jgidley@albany.edu
* This program is a simple Hello World program that creates and ends 4 threads.
*/

package jprog5;

// This class creates threads by extending the Thread class and overriding the run method
class CreateThread extends Thread
{
	// Execute the thread object
    public void run()
    {
        try
        {
			System.out.println("Creating thread " + Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getId() + ": Hello World!");
 
        }
        catch (Exception e)
        {
            System.out.println("Error in run() method");
			e.printStackTrace();
        }
    }
}
 
// Main method
public class JavaThreads
{
    public static void main(String[] args)
    {
		// Create four threads
        for (int i = 0; i < 4; i++)
        {
            CreateThread t = new CreateThread();  // Create new thread object	
            t.start();	// Start the thread, then invoke run() on Thread object
        }
    }
}