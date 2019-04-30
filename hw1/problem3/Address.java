package com.ualbany.hw1.problem3;

public class Address 
{
	// Instance variables
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;
	
	// Address constructor
	public Address(String l1, String l2, String c, String s, String z)
	{
		line1 = l1;
		line2 = l2;
		city = c;
		state = s;
		zip = z;
	}
	
	/* Set methods */
	public void setLine1(String l1) // Set line 1
	{
		line1 = l1;
	}
	
	public void setLine2(String l2) // Set line 2
	{
		line2 = l2;
	}
	
	public void setCity(String c) // Set city
	{
		city = c;
	}
	
	public void setState(String s) // Set state
	{
		state = s;
	}
	
	public void setZip(String z) // Set ZIP code
	{
		zip = z;
	}
	
	/* Get methods */
	public String getLine1()
	{
		return line1;
	}
	
	public String getLine2()
	{
		return line2;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	/* Misc. methods */
	public String getFullAddress() // Return the full formatted address
	{
		String addr;
		addr = line1.concat(" ").concat(line2).concat(" ").concat(city).concat(", ").concat(state).concat(" ").concat(zip);
		return addr;
	}
}
