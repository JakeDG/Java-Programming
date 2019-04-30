package edu.albany.fproj.people;

import java.util.concurrent.ThreadLocalRandom;

import edu.albany.fproj.address.Address;
import edu.albany.fproj.person.Person;

/* This class models an employee with the following properties:
 * job title, salary, and id.
 * The rest of this class's properties are inherited from the Person class.
 */
public class Employee extends Person
{
	private String jobTitle;
	private double salary;
	private int id;
	
	// Employee constructor
	public Employee(String first, String last, String phoneNum, String email, Address address, String ttl, double sal) 
	{
		super(first, last, phoneNum, email, address);
		this.jobTitle = ttl;
		this.id = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);	// ID is randomly generated
		
		if (sal < 0)
			this.salary = 0;
		else
			this.salary = sal;
	}

	/* Getters & setters */
	public String getJobTitle() 
	{
		return jobTitle;
	}

	public void setJobTitle(String ttl) 
	{
		this.jobTitle = ttl;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double sal) 
	{
		if (sal < 0)
			this.salary = 0;
		else
			this.salary = sal;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	/* Misc methods */
	
	// Adjusts the employee's salary base on a percent value
	public void adjustSalary(double r)
	{
		if (salary > 0) // If positive increase salary
		{
			r /= 100; // Convert the raise value to a percent value
			salary += (salary * r);
		}
	}
	
	// toSting mehtod
	public String toString()
	{
		return super.toString() + "\nRole: " + jobTitle + "\nID: " + "ID: " + id + "\nSalary: " + String.format("$%.2f", salary) + "/hr";
	}
}
