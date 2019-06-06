/* 
* Developed by Jacob Gidley
* This program represents starvation in the dining philosophers problem
*/

public class Prog6star 
{

    public static void main(String[] args) 
	{
        Fork[] forks = new Fork[5];
        Philosopher[] philos = new Philosopher[5];
		
		// Initialize forks
        for (int i = 0; i < 5; i++) 
		{
            Fork f = new Fork();
            forks[i] = f;
        }
		
		// Initialize philosophers
        for (int i = 0; i < 5; i++) 
		{
            Philosopher philo = new Philosopher(forks[i] , forks[(i+1)%5], i);
            philos[i] = philo;
        }
		
		// Make philosophers eat
        for (int i = 0; i < philos.length; i++) 
		{
            new Thread(philos[i]).start();
        }
    }

}

class Philosopher implements Runnable 
{

    private final Fork left;
    private final Fork right;
    private final int id;

	// Constructor
    public Philosopher(Fork l, Fork r, int id)
	{
        this.left = l;
        this.right = r;
        this.id = id;
    }

	/* Looks for forks to pickup.
	* If the right fork is being used, then drop left fork
	* to avoid deadlock.
	*/
    public void lookForks()
	{
        if (left.pickUp()) // Grab left fork
		{
            if (right.pickUp()) // Grab right fork
			{
				System.out.printf("Philosopher %d picks up two forks%n", id+1);
                eat();
                putDown();
            } 
			else 
			{
				left.putDown(); // Put down left fork
			}
        }
    }

    public void run()
	{
		// Eat 10 times
        for (int i = 0; i < 10; i++) 
		{
            lookForks();
        }
    }

    public void eat()
	{
        try 
		{
            //System.out.printf("Philosopher "+id+" is eating");
			System.out.printf("Philosopher %d is eating%n", id+1);
            Thread.sleep(400);
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        } 
    }

    public void putDown()
	{
        left.putDown();
		System.out.printf("Philosopher %d puts down left fork%n", id+1);
        right.putDown();
		System.out.printf("Philosopher %d puts down right fork%n", id+1);
		System.out.printf("Philosopher %d is thinking%n", id+1);
    }

}

class Fork 
{
    private volatile boolean taken = false;

    public synchronized boolean pickUp()
	{
        if (!taken) 
		{ 
            taken = true;
            return true;
        }
        else return false;
    }

    public synchronized void putDown()
	{
        taken = false;
    }
}