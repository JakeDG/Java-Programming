package edu.albany.fproj.address;

/* This class creates and address that has the properties of
 * Street address, city, state, and ZIP code
 */
public class Address 
{
	private String street, city, state, zip;	
	
	// Address Constructor
	public Address(String st, String c, String s, String z)
	{
		this.street = st;
		this.city = c;
		this.state = s;
		this.zip = z;
	}

	/* Getters & setters */
	public String getStreet() 
	{
		return street;
	}

	public void setStreet(String st) 
	{
		this.street = st;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String c)
	{
		this.city = c;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String s) 
	{
		this.state = s;
	}

	public String getZip() 
	{
		return zip;
	}

	public void setZip(String z) 
	{
		this.zip = z;
	}
	
	/* Misc. mehtods */
	
	public String toString()
	{
		return street + " " + city + ", " + state + " " + zip;
	}
	
}
