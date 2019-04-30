package edu.albany.fproj.menu;

/* Enum class that holds drink names */
public enum Drink
{
	PEPSI("Pepsi"),
	COKE("Coke"),
	SPRITE("Sprite"),
	GATAID("Gatorade"),
	VITWAT("Vitamin Water"),
	WATER("Water"),
	DIPEP("Diet Pepsi"),
	DICOK("Diet Coke");
	
	private String name;
	
	private Drink(String n)
	{
		this.name = n;
	}
	
	// Returns string name of the food item
	public String getName()
	{
			return name;
	}
}
