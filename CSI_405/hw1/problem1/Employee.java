package com.ualbany.hw1.problem1;

public class Employee 
{
	// Instance variables
	private String fName; // First name
	private String lName; // Last name
	private double salary; // Monthly salary
	
	// Employee constructor
	public Employee(String fn, String ln, double sal)
	{
		fName = fn;
		lName = ln;
		
		if (sal > 0)
		{
			salary = sal;
		}
		else
		{
			salary = 0;
		}
	}
	
	/* Set methods */
	public void setFirstName(String fn) // Set first name
	{
		fName = fn;
	}
	
	public void setLastName(String ln) // Set last name
	{
		lName = ln;
	}
	
	public void setSalary(double sal) // Set salary
	{
		if (sal > 0)
		{
			salary = sal;
		}
	}
	
	/* Get methods */
	public String getFirstName() // Get first name
	{
		return fName;
	}
	
	public String getLastName() // Get last name
	{
		return lName;
	}
	
	public double getSalary() // Get salary
	{
		return salary;
	}
	
	public double getYearSalary() // Get yearly salary
	{
		return (salary * 12);
	}
	
	public String getFullName() // Get full name, returned as formatted string
	{
		String fullName = fName.concat(" ").concat(lName);;
		return fullName;
	}
	
	/* Misc. methods */
	public void raiseSalary(double r) // Raise salary
	{
		if (r > 0)
		{
			r /= 100; // Convert the raise value to a percent value
			salary += (salary * r);
		}
	}
	
}
