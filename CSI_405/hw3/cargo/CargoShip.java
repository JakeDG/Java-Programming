package edu.albany.cargo;

import edu.albany.ship.Ship;

public class CargoShip extends Ship 
{
	private int cargoCap;
	
	public CargoShip(String n, String y, int c)
	{
		super(n, y); // Always call the super constructor first!
		this.cargoCap = c;
	}
	
	public void setCargoCap(int c)
	{
		this.cargoCap = c;
	}
	
	public int getCargoCap()
	{
		return this.cargoCap;
	}
	
	// Override the Ship parent class toString()
	@Override
	public String toString()
	{
		return String.format("Cargo Ship: " + this.name + " | Cargo capacity: " + this.cargoCap);
	}
}
