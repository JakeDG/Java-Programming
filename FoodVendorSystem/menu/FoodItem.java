package edu.albany.fproj.menu;

/* This class models a food item that IS-A menu item.
 * It has the following properties:
 * Price, and HAS-A Food Enum object
 */
public class FoodItem extends MenuItem<FoodItem>
{
	private double price;
	private Food food;
	
	// Constructor
	public FoodItem(String n, double p)
	{
		this.food = Food.valueOf(n);
		this.price = p;
	}

	/* Getters & Setters */
	public Food getFood() 
	{
		return food;
	}

	public void setFood(Food f) 
	{
		this.food = f;
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
	
	// Food item price adjustment
	public void adjustPrice(Double r)
	{
		if (price <= 0)
			price = 0.0;
		else
		{
			r /= 100; // Convert the adjustment value to a percent value
			price += (price * r);
		}
	}
	
	// Get item's Enum constant
	public String getItemCode()
	{
		return food.toString();
	}
	
	/* Misc methods */
	
	public String toString()
	{
		return food + ": " + food.getName() + ", " + String.format("$%.2f", price); 
	}
	
}
