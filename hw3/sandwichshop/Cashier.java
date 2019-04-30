package edu.albany.sandwichshop;

public class Cashier 
{
	private int id;			// Cashier ID
	private double money;	// Cashier's total money in register
	
	// Cashier Constructor
	public Cashier (int id, double m)
	{
		this.id = id;
		this.money = m;
	}

	// Get cashier's ID
	public int getId() 
	{
		return id;
	}
	
	// Set cashier's ID
	public void setId(int id) 
	{
		this.id = id;
	}
	
	// Get cashier's money
	public double getMoney() 
	{
		return money;
	}
	
	// Set cashier's money
	public void setMoney(double money) 
	{
		this.money = money;
	}
	
	// Charge a customer for their food, and if they don't have enough money, then get rid of their sandwich
	public void charge(Customer c)
	{
		if (c.getMoney() >= c.getSandwich().getPrice())
		{
			System.out.printf("Customer #%d has sufficient funds and pays for the sandwich\n", c.getId());
			money += c.getSandwich().getPrice(); // Put money in the register
			c.setMoney(c.getMoney() - c.getSandwich().getPrice()); // Customer has lost money
		}
		else // Customer cannot pay for sandwich, take back sandwich and throw away
		{
			System.out.printf("Customer #%d has insufficient funds! The sandwich is retrieved from the customer and thrown away!\n", c.getId());
			c.setSandwich(null); // Get rid of the customer's sandwich
		}
	}
}
