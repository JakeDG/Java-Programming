package edu.albany.sandwichshop;

/*	The idea behind this sandwich shop is that a customer places an order to the sandwich maker who then 
 * makes the sandwich and gives it to the customer.
 * The customer then goes to the cashier who then charges the customer. If the customer does not have the 
 * funds to purchase the sandwich, then the cashier removes the sandwich from the customer. Otherwise the cashier 
 * takes the money from the customer and adds it to the "register". The customer leaves with their sandwich and
 * the next customer in line is dealt with etc.
 * */
public class SandwichDriver 
{
	public static void main(String[] args)
	{
		// Create customers
		Customer[] customers = {new Customer(25.00, "Ham & Turkey", "large"), 
								new Customer(5.50, "Tuna", "small"),
								new Customer(13.00, "Ham and Swiss", "medium"),
								new Customer(2.00, "Roast Beef", "large"),
								new Customer(7.25, "Ham, Turkey, & Swiss", "medium")
								};
		
		Cashier cash = new Cashier(1, 50.00);	// Create cashier
		
		SandwichMaker sMaker = new SandwichMaker(1);	// Create sandwich maker
		
		// Print cashier's initial money
		System.out.printf("Cashier #%d has $%.2f in the register\n\n", cash.getId(), cash.getMoney());
		
		for (Customer c : customers)
		{
			// Customer orders sandwich and the sandwich maker makes it and gives to customer
			System.out.printf("Customer #%d has $%.2f and orders a %s %s sandwich\n", c.getId(), c.getMoney(), c.getOrder().getSize(), c.getOrder().getName());
			c.setSandwich(sMaker.makeSandwich(c.getOrder())); 
			
			System.out.println("The sandwich maker gives the customer the requested sandwich, and then the customer goes to the cashier.");
			
			// Customer pays cashier
			System.out.printf("Cashier #%d charges customer #%d $%.2f for their sandwich.\n", cash.getId(), c.getId(), c.getSandwich().getPrice());
			cash.charge(c);
			
			// Print customer details after their order
			if (c.getSandwich() != null)
			{
				System.out.printf("Customer #%d takes the %s and leaves. They now have $%.2f in their wallet.\n", c.getId(), c.getSandwich(), c.getMoney());
			}
			
			// Print cashier's money
			System.out.printf("Cashier #%d has $%.2f in the register\n\n", cash.getId(), cash.getMoney());
		}
	}
}
