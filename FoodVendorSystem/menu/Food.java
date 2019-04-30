package edu.albany.fproj.menu;

/* Enum class that holds food names */
public enum Food 
{
	GRCH("Grilled Cheese"),
	GRHC("Grilled Ham & Cheese"),
	GRBEC("Grilled Bacon, Egg, & Cheese"),
	GRHEC("Grilled Ham, Egg, & Cheese"),
	HBURG("Hamburger"),
	CBURG("Cheeseburger"),
	QUESD("Quesidilla"),
	HTDOG("Hotdog");
	
	private String name;
	
	private Food(String n)
	{
		this.name = n;
	}
	
	// Returns string name of the food item
	public String getName()
	{
			return name;
	}
}
