package edu.albany.hw2.car;

public class Odometer 
{
	/* Instance variables */
	private int mileage; // Mileage of car
	private int milesTraveled; // Stores miles traveled per gallon
	
	public Odometer(int mi, int mt)
	{
		mileage = mi;
		
		if (milesTraveled > 22)
		{
			milesTraveled = 0;
		}
		else
		{
			milesTraveled = mt;
		}
	}
	
	/* Accessor Methods */
	public int getMileage()	// Get car's current mileage
	{
		return mileage;
	}
	
	/* Misc. Methods */
	public void incMileage() // Increment car's mileage
	{
		if (mileage < 999999)
		{
			mileage++;
		}
		else
		{
			mileage = 0;
		}
		
		milesTraveled++; // Increment miles traveled per gallon
	}
	
	public void milesFuelCheck(FuelGauge fg) // Check to see if car exceeded its MPG so gas can be deducted
	{
		if (milesTraveled >= 22)
		{
			fg.decFuelLevel();
			milesTraveled = 0; // Reset miles traveled per gallon
		}
	}
}
