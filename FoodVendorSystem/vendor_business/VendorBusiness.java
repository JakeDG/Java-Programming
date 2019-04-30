package edu.albany.fproj.vendor_business;

import java.util.*;
import java.util.Map.Entry;

import edu.albany.fproj.address.Address;
import edu.albany.fproj.event.Event;
import edu.albany.fproj.menu.*;
import edu.albany.fproj.people.*;

/* Singleton private constructor and public getInstance() method (named getVendorBusiness) are located on lines 31 & 47 respectively 
 * Polymorphism is used for the menu hashtable to store FoodItems and DrinkItems */

/* This class models a vendor business and includes methods to help run a vendor business and manage record keeping 
 * A vendor business HAS-A owner and address, as well as, zero-to-many employees, event hosts, events, and menu items
 * */

public class VendorBusiness 
{
	private static VendorBusiness vb;
	private String name, phoneNum, email;
	private Owner owner;
	private double funds;
	private Address address;
	private Hashtable<Integer, Employee> employeeTable;
	private Hashtable<Integer, EventHost> knownHostsTable;
	private Hashtable<Integer, Event> eventTable;
	private Hashtable<String, MenuItem<?>> menu;
	
	// Singleton private constructor
	private VendorBusiness(String n, String pNum, String email, double f, Owner o, Address addr)
	{
		this.name = n;
		this.phoneNum = pNum;
		this.email = email;
		this.funds = f;
		this.owner = o;
		this.address = addr;
		
		// Initialize all ArrayLists
		employeeTable = new Hashtable<>();
		knownHostsTable = new Hashtable<>();
		eventTable = new Hashtable<>();
		menu = new Hashtable<>();
	}
	
	// Method to limit access to VendorBusiness constructor
	public static VendorBusiness getVendorBusiness(String n, String pNum, String email, double f, Owner o, Address addr)
	{
		if(vb == null)
			vb = new VendorBusiness(n, pNum, email, f, o, addr);
		return vb;
	}

	/* Getters / Setters */
	public String getName() 
	{
		return name;
	}

	public void setName(String n) 
	{
		this.name = n;
	}

	public String getPhoneNum() 
	{
		return phoneNum;
	}

	public void setPhoneNum(String pNum) 
	{
		this.phoneNum = pNum;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public Owner getOwner() 
	{
		return owner;
	}

	public void setOwner(Owner o) 
	{
		this.owner = o;
	}

	public double getFunds() 
	{
		return funds;
	}

	public void setFunds(double funds) 
	{
		this.funds = funds;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address addr) 
	{
		this.address = addr;
	}

	public Hashtable<Integer, Employee> setEmployeeTable() 
	{
		return employeeTable;
	}

	public void setEmployeeTable(Hashtable<Integer, Employee> empTable) 
	{
		this.employeeTable = empTable;
	}

	public Hashtable<Integer, EventHost> getKnownHostsTable() 
	{
		return knownHostsTable;
	}

	public void setKnownHostsTable(Hashtable<Integer, EventHost> hostTable) 
	{
		this.knownHostsTable = hostTable;
	}

	public Hashtable<Integer, Event> getEventTable() 
	{
		return eventTable;
	}

	public void setEventTable(Hashtable<Integer, Event> eTable) 
	{
		this.eventTable = eTable;
	}
	
	public Hashtable<String, MenuItem<?>> getMenu() 
	{
		return menu;
	}

	public void setMenu(Hashtable<String, MenuItem<?>> mTable) 
	{
		this.menu = mTable;
	}
	
	/* Table data methods */
	
	// Adds an employee to the businesse's employee table
	public void addEmployee(Employee e)
	{
		// Check if employee already exists in the table
		if (!employeeTable.containsKey(e.getId()))
				employeeTable.put(e.getId(), e);
		else
			System.out.println("Error: Employee: " + e.getId() + " already exists!");
	}
	
	// Removes an employee from the businesse's employee table
	public void removeEmployee(int empId)
	{
		// Check if employee does not exist in the table
		if (employeeTable.remove(empId) == null)
			System.out.println("Error: Employee: " + empId + " does not exist!");
	}
	
	// Adds an event host to the businesse's known event hosts table
	public void addKnownHost(EventHost h)
	{
		// Check if host already exists in the table
		if (!knownHostsTable.containsKey(h.getId()))
			knownHostsTable.put(h.getId(), h);
		else
			System.out.println("Error: Host: " + h.getId() + " already exists!");		
	}
		
	// Removes an event host from the businesse's employee table
	public void removeKnownHost(int hostId)
	{
		// Check if host doesn't exist in the table
		if (knownHostsTable.remove(hostId) == null)
			System.out.println("Error: Host: " + hostId + " does not exist!");
	}	
	
	// Adds an event to the business's event list
	public void addEvent(Event e)
	{
		// Check if event already exists in table
		if (!eventTable.containsKey(e.getId()))
			eventTable.put(e.getId(), e);
		else
			System.out.println("Error: Event: " + e.getId() + " already exists!");		
	}
	
	// Removes an event from the business's event list
	public void removeEvent(int eId)
	{
		// Check if event doesn't exist in the table
		if (eventTable.remove(eId) == null)
			System.out.println("Error: Event: " + eId + " does not exist!");
	}
	
	// Adds a menu item to the business's menu
	public void addMenuItem(MenuItem<?> item)
	{
		// Check if event already exists in table
		if (!menu.containsKey(item.getItemCode()))
		{
			menu.put(item.getItemCode(), item);
			System.out.println("Menu item: " + item.getItemCode() + " added to menu");
		}
		else
			System.out.println("Error: Event: " + item.getItemCode() + " already exists!");		
	}
		
	// Removes a menu item from the business's menu
	public void removeMenuItem(String code)
	{
		// Check if event doesn't exist in the table
		if (menu.remove(code) == null)
			System.out.println("Error: Event: " + code + " does not exist!");
		else
			System.out.println("Menu item: " + code + " removed from menu");
	}
	
	/* Other Misc Methods */
	
	// Adjust all employee wages simultaneously
	public void adjustWages(double r)
	{
		// Iterate over employee table
		for (Entry<Integer, Employee> entry : employeeTable.entrySet())
		{
			entry.getValue().adjustSalary(r);
		}
	}
	
	// Change rating of a particular event host
	public void rateKnownHost(int hId, double r)
	{
		// Check if host doesn't exist in the table
		if (knownHostsTable.containsKey(hId))
			knownHostsTable.get(hId).setRating(r);
		else
			System.out.println("Error: Host: " + hId + " does not exist!");
	}
	
	// Print all employees
	public void displayEmployees()
	{
		System.out.println("\n------------------- Employees -------------------\n");
		
		// Loop over employee table
		for(Entry<Integer, Employee> entry : employeeTable.entrySet())
			System.out.println(entry.getValue() + "\n");
		
		System.out.println("-------------------------------------------------\n");
	}
	
	// Print all known hosts
	public void displayKnownHosts()
	{
		System.out.println("\n--------------- Known Event Hosts ---------------\n");
		
		// Loop over host table
		for(Entry<Integer, EventHost> entry : knownHostsTable.entrySet())
			System.out.println(entry.getValue() + "\n");
		
		System.out.println("-------------------------------------------------\n");
	}
	
	// Print all events
	public void displayEvents()
	{
		System.out.println("\n-------------------- Events --------------------\n");
		
		// Loop over host table
		for(Entry<Integer, Event> entry : eventTable.entrySet())
			System.out.println(entry.getValue() + "\n");
		
		System.out.println("------------------------------------------------\n");
	}
	
	// Print all menu items
	public void displayMenu()
	{
		System.out.println("\n---------------------- Menu ----------------------\n");
				
		// Loop over menu table
		for(Entry<String, MenuItem<?>> entry : menu.entrySet())
			System.out.println(entry.getValue());
				
		System.out.println("---------------------------------------------------\n");
	}
	
	// Adjust menu prices
	public void adjustMenuPrices(double r, boolean type)
	{
		// Call MenuItem's adjust price method
		MenuItem.adjustTypePrices(menu, r, type);
	}
	
	// Increment events hosted count for a given event host
	public void incrEventHosted(int hId)
	{
		// Check if host doesn't exist in the table
		if (knownHostsTable.containsKey(hId))
			knownHostsTable.get(hId).setEventsHostedCount(knownHostsTable.get(hId).getEventsHostedCount() + 1);
		else
			System.out.println("Error: Host: " + hId + " does not exist!");
	}
	
	// toString method
	public String toString()
	{
		return "Business Name: " + name + "\nOwner: " + owner.getFirstName() + " " + owner.getLastName() + "\nPhone: " + phoneNum + 
				"\nEmail: " + email + "\nAddress: " + address + "\nTotal Funds: " + funds;
	}
}
