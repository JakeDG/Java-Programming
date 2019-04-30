package edu.albany.fproj.vendor_business;

import edu.albany.fproj.address.Address;
import edu.albany.fproj.event.Event;
import edu.albany.fproj.people.*;
import edu.albany.fproj.menu.*;

/* This driver class creates a vendor business and adds employees, events to attend, known event hosts, 
 * as well as creating a small menu for the vendor. There are comments explaining more of what happens after the vendor attends some events
 */
public class VendorBusinessDriver 
{

	public static void main(String[] args) 
	{
		// Create vendor owner /w address
		Address oAddr = new Address("123 Micormick Ave.", "Slingerlands", "NY", "12159");
		Owner own = new Owner("Bob", "Saget", "518-439-2748", "bobs@gmail.com", oAddr, "CEO/Cook");
		
		System.out.println(own + "\n");
		
		// Create vendor business using owner's address
		VendorBusiness vb = VendorBusiness.getVendorBusiness("Bob's Burgers", "518-278,7964", "bobsburgers@gmail.com", 2300.00, own, oAddr);
		
		System.out.println(vb + "\n");
		
		// Hire some employees for the business
		System.out.println("Hiring employees...");
		Employee e1 = new Employee("James", "Franco", "518-242-2600", "jfranks@gmail.com", new Address("23 State St.", "Albany", "NY", "14523"), "Cashier", 9.50);
		Employee e2 = new Employee("Mark", "Wahlberg", "585-346-0890", "markymark@gmail.com", new Address("58 South Ave.", "Troy", "NY", "56876"), "Cashier/Assistant", 10.50);
		Employee e3 = new Employee("Will", "Ferrel", "878-764-3479", "wferrel@yahoo.com", new Address("105 Richman Drive.", "Loudenville", "NY", "22345"), "Cook", 15.75);
		
		vb.addEmployee(e1);
		vb.addEmployee(e2);
		vb.addEmployee(e3);
		
		vb.displayEmployees();
		
		// Add some events that the business will attend and also add the event hosts at thesame time
		// Create some event hosts
		EventHost eh1 = new EventHost("Chad", "Northman", "518-456-7899", "chNorth@capitalcarshows.com", 
										new Address("34 Moss St.", "Albany", "NY", "12235"), "Overseer", 9.5, 17);
		EventHost eh2 = new EventHost("Sheryl", "Turner", "518-678-2717", "sherryt75@aol.com", 
										new Address("101 Joshua Rd.", "Colonie", "NY", "10504"), "Host", 8.7, 5);
		EventHost eh3 = new EventHost("Thomas", "Harrell", "518-178-6323", "tomharrell@yahoo.com", 
										new Address("17 Grand Ave.", "Kingston", "NY", "17389"), "Coordinator", 4.6, 2);
		
		vb.addKnownHost(eh1);
		vb.addKnownHost(eh2);
		vb.addKnownHost(eh3);
		
		System.out.println("Printing Known Event Hosts...");
		vb.displayKnownHosts();
		
		// Create some events hosted by these event hosts
		Event ev1 = new Event("Central Ford Carshow", "10:30AM - 4PM", "July, 10, 2019", "N/A", 
								new Address("8701 Central Ave.", "Albany", "NY", "12057"), eh1, 500, 1);
		Event ev2 = new Event("Lake George Music Fesival", "9AM - 10PM", "June, 29, 2019", "N/A", 
				new Address("45 Lakeview Dr.", "Lake George", "NY", "11286"), eh2, 4000, 6);
		Event ev3 = new Event("Siena Horseshow", "7AM - 3PM", "August, 8, 2019", "August 10, 2019", 
				new Address("787 Counrty Rd.", "Schotica", "NY", "12343"), eh3, 200, 0);
		
		vb.addEvent(ev1);
		vb.addEvent(ev2);
		vb.addEvent(ev3);
		
		vb.displayEvents();
		
		// Create menu items
		FoodItem f1 = new FoodItem("GRCH", 3.00);
		FoodItem f2 = new FoodItem("HTDOG", 2.00);
		FoodItem f3 = new FoodItem("CBURG", 5.00);
		
		DrinkItem d1 = new DrinkItem("PEPSI", 2.00);
		DrinkItem d2 = new DrinkItem("COKE", 2.00);
		DrinkItem d3 = new DrinkItem("VITWAT", 3.00);
		
		// Add the menu and drink items
		vb.addMenuItem(f1);
		vb.addMenuItem(f2);
		vb.addMenuItem(f3);
		vb.addMenuItem(d1);
		vb.addMenuItem(d2);
		vb.addMenuItem(d3);
		
		// Display menu
		vb.displayMenu();
		
		// Adjust menu prices and remove grilled cheese fom the menu
		vb.adjustMenuPrices(10, true);
		vb.adjustMenuPrices(-1, false);
		vb.removeMenuItem("GRCH");
		
		// Display menu
		vb.displayMenu();
		
		/* Business attends event #1, makes $1024, and has satisfactory experience with the event's host
		 * Therefore it increases the wages for all employees by 20% and increases its rating of the event host
		 */
		System.out.println(vb.getName() + " attends " + ev1.getName());
		vb.removeEvent(ev1.getId());		// Remove event from list to indicate that it has been attended
		vb.setFunds(vb.getFunds() + 1024);	// Business makes money
		vb.adjustWages(20);					// Increase all employee wages by 20%
		vb.rateKnownHost(eh1.getId(), 9.7); // Business increases its rating of the event host
		vb.incrEventHosted(eh1.getId()); 	// Increment the amount of events the business has attended with this event host
		
		System.out.println("After-event business details: ");
		
		// Print all business info again
		System.out.println(vb + "\n");
		vb.displayEmployees();
		vb.displayEvents();
		vb.displayKnownHosts();
		
		/* Business attends event #2, loses $512, and has unsatisfactory experience with the event's host
		 * Therefore it decreases the wages for all employees by 25% and decreases its rating of the event host
		 * it also fires Mark Wahlberg
		 */
		System.out.println(vb.getName() + " attends " + ev2.getName() + "\n");
		vb.removeEvent(ev2.getId());		// Remove event from list to indicate that it has been attended
		vb.setFunds(vb.getFunds() - 512);	// Business loses money
		vb.adjustWages(-25);					// Decrease all employee wages by 25%
		vb.rateKnownHost(eh2.getId(), 4.5); // Business decreases its rating of the event host
		vb.incrEventHosted(eh2.getId()); 	// Increment the amount of events the business has attended with this event host
		vb.removeEmployee(e2.getId());		// Fire Mark
		
		System.out.println("After-event business details: ");
		
		// Print all business info again
		System.out.println(vb + "\n");
		vb.displayEmployees();
		vb.displayEvents();
		vb.displayKnownHosts();
		
		/* Before attending event #3 the owner bumps up all food prices by 20%, removes coke from the menu, and adds water instead */
		vb.adjustMenuPrices(20, true);
		vb.removeMenuItem("COKE");
		vb.addMenuItem(new DrinkItem("WATER", 2.00));
		vb.displayMenu(); // Print the menu
		
		/* Business attends event #3, makes $2048, and has a satisfactory experience with the event's host
		 * Therefore it increases the wages for all employees by 5% and increases its rating of the event host
		 * it also re-hires Mark Wahlberg
		 */
		System.out.println(vb.getName() + " attends " + ev3.getName() + "\n");
		vb.removeEvent(ev3.getId());		// Remove event from list to indicate that it has been attended
		vb.setFunds(vb.getFunds() + 2048);	// Business makes money
		vb.adjustWages(5);				// Increases all employee wages by 5%
		vb.rateKnownHost(eh3.getId(), 6.4); // Business increases its rating of the event host
		vb.incrEventHosted(eh3.getId()); 	// Increment the amount of events the business has attended with this event host
		vb.addEmployee(e2);		// Re-hire Mark
		
		System.out.println("After-event business details: ");
		
		// Print all business info again
		System.out.println(vb + "\n");
		vb.displayEmployees();
		vb.displayEvents();
		vb.displayKnownHosts();
		
		/* No more events so the business shuts down for the season */
	}

}
