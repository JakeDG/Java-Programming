package edu.albany.ship;

public class Ship 
{
	protected String name;
	protected String year;
	
	public Ship(String n, String y)
	{
		this.name = n;
		this.year = y;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setYear(String y)
	{
		this.year = y;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getYear()
	{
		return this.year;
	}
	
	public String toString()
	{
		return "Ship: " + this.name + " | Year: " + this.year;
 	}
}
