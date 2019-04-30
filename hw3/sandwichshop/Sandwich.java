package edu.albany.sandwichshop;

public class Sandwich 
{
	private String name;	// Sandwich name
	private String size;	// Sandwich size
	private double price;	// Sandwich price
	
	// Sandwich Constructor
	public Sandwich(String n, String s)
	{
		this.name = n;
		this.size = s;
		
		// Only 3 sizes w/ 3 prices
		if (size == "small")
			price = 3.25;
		else if (size == "medium")
			price = 5.50;
		else
			price = 7.75;
	}
	
	// Get sandwich name
	public String getName() 
	{
		return name;
	}
	
	// Set sandwich name
	public void setName(String n) 
	{
		this.name = n;
	}

	// Get sandwich size
	public String getSize() 
	{
		return size;
	}
	
	// Set sandwich size
	public void setSize(String s) 
	{
		this.size = s;
	}
	
	// Set sandwich price
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	// Get sandwich price
	public double getPrice()
	{
		return price;
	}
	
	// Overridden toString()
	@Override
	public String toString()
	{
		return size + " " + name + " sandwich";
	}
}
