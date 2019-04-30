package edu.albany.cruise;

import edu.albany.ship.Ship;

public class CruiseShip extends Ship 
{
	private int maxPass;
	
	public CruiseShip(String n, String y, int m)
	{
		super(n, y); // Always call the super constructor first!
		this.maxPass = m;
	}
	
	public void setMaxPassengers(int m)
	{
		this.maxPass = m;
	}
	
	public int getMaxPasengers()
	{
		return this.maxPass;
	}
	
	// Override the Ship parent class toString()
	@Override
	public String toString()
	{
		return "Cruise Ship: " + this.name + " | Maximum Passengers: " + this.maxPass;
	}
}
