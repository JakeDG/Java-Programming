package edu.albany.sandwichshop;

public class SandwichOrder 
{
	private String name;	// Name of order (sandwich name)
	private String size;	// Size of sandwich
	
	// Order Constructor
	public SandwichOrder(String n, String s)
	{
		this.name = n;
		this.size = s;
	}
	
	// Get order name
	public String getName() 
	{
		return name;
	}
	
	// Set order name
	public void setName(String name) 
	{
		this.name = name;
	}
	
	// Get order size
	public String getSize() 
	{
		return size;
	}
	
	// Set order size
	public void setSize(String s) 
	{
		this.size = s;
	}
}
