package edu.albany.hw2.car;

public class FuelGauge 
{
	/* Instance variables */
	
	private int fLevel; // Fuel level (in gallons)
	
	public FuelGauge(int lvl)
	{
		fLevel = lvl;
	}
	
	/* Accessor Methods */
	public int getFuelLevel() // Get fuel amount
	{
		return fLevel;
	}
	
	/* Misc Methods */
	public void incFuelLevel() // Increment fuel level
	{
		if (fLevel < 15)
			fLevel++;
	}
	

	public void decFuelLevel() // Decrement fuel level
	{
		if (fLevel > 0)
			fLevel--;
	}
}
