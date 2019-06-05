package edu.albany.sandwichshop;

public class Customer 
{
	private int id;					// Customer ID
	private double money;			// Customer's amount of money
	private SandwichOrder order;	// Customer's order
	private Sandwich sandwich;		// Customer's sandwich
	public static int count = 1;	// Stores the total number of customers
	
	// Customer constructor
	public Customer(double m, String n, String s)
	{
		this.id = count++;
		this.money = m;
		this.order = new SandwichOrder(n, s);
	}
	
	// Get customer ID
	public int getId() 
	{
		return id;
	}
	
	// Set customer ID
	public void setId(int id) 
	{
		this.id = id;
	}
	
	// Get customer's money
	public double getMoney() 
	{
		return money;
	}

	// Set customer's money
	public void setMoney(double m) 
	{
		this.money = m;
	}
	
	// Get customer's sandwich order
	public SandwichOrder getOrder() 
	{
		return order;
	}
	
	// Set customer's sandwich order
	public void setOrder(SandwichOrder order) 
	{
		this.order = order;
	}
	
	// Get customer's sandwich
	public Sandwich getSandwich() 
	{
		return sandwich;
	}
	
	// Set customer's sandwich
	public void setSandwich(Sandwich s) 
	{
		this.sandwich = s;
	}
	
	// Get total customer count
	public static int getCount() 
	{
		return count;
	}
	
	// Set total customer count
	public static void setCount(int c) 
	{
		Customer.count = c;
	}
}
