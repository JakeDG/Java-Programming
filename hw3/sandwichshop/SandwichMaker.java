package edu.albany.sandwichshop;

public class SandwichMaker 
{
	private int id;	// Sandwich Maker's ID
	
	// Sandwich Maker's Constructor
	public SandwichMaker(int id)
	{
		this.id = id;
	}
	
	// Get sandwich maker's ID
	public int getId() 
	{
		return id;
	}
	
	// Set sandwich maker's ID
	public void setId(int id) 
	{
		this.id = id;
	}
	
	// Sandwich maker creates a sandwich
	public Sandwich makeSandwich(SandwichOrder o)
	{
		System.out.printf("Sandwich maker #%d makes the %s %s sandwich\n", this.id, o.getSize(), o.getName());
		Sandwich sandwich = new Sandwich(o.getName(), o.getSize());
		return sandwich;
	}
}
