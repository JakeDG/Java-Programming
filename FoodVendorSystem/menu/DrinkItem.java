package edu.albany.fproj.menu;

/* This class models a drink item that IS-A menu item.
 * It has the following properties:
 * Price, and HAS-A Drink Enum object
 */
public class DrinkItem extends MenuItem<DrinkItem>
{
	private Drink drink;
	private double price;
	
	// Constructor
	public DrinkItem(String n, double p)
	{
		this.drink = Drink.valueOf(n);
		this.price = p;
	}

	/* Getters & Setters */
	public Drink getDrink() 
	{
		return drink;
	}

	public void setDrink(Drink d) 
	{
		this.drink = d;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double p) 
	{
		this.price = p;
	}
	
	/* Methods that override MenuItem's abstract methods */
	
	// Drink item price adjustment
	public void adjustPrice(Double r) 
	{
		if (price <= 0)
			price = 0.0;
		else
			price += r;
	}
	
	// Get item's Enum constant
	public String getItemCode()
	{
		return drink.toString();
	}
	
	/* Misc methods */
	public String toString()
	{
		return drink + ": " + drink.getName() + ", " + String.format("$%.2f", price); 
	}
}
