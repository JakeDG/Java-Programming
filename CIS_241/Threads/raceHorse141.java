package Threads14;

public class raceHorse141 extends Thread 
{
	private String name;
	
	public raceHorse141(String n)
	{
		name = n;
	}
	
	public void run()
	{
		int i;
		for (i = 1; i <= 250; i++)
		{
			System.out.print(i + name + " ");
		}
		System.out.println(name + " done");
	}
}
