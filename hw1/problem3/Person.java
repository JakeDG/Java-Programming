package com.ualbany.hw1.problem3;

public class Person
{
	// Instance variables
	private String fName;
	private String lName;
	private Address pAddress;
	private CheckingBankAccount pAccount;
	
	// Person constructor
	public Person(String fn, String ln, String l1, String l2, String c, String s, String z, double val)
	{
		fName = fn;
		lName = ln;
		pAddress = new Address(l1, l2, c, s, z);
		pAccount = new CheckingBankAccount(val);
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
	
	/* Get methods */
	public String getFirstName() // Get first name
	{
		return fName;
	}
	
	public String getLastName() // Get last name
	{
		return lName;
	}
	
	public Address getPersonAddress() // Get person's address
	{
		return pAddress;
	}
	
	public CheckingBankAccount getAccount() // Get person's checking account
	{
		return pAccount;
	}
	
	/* Misc methods */
	public String getFullName() // Get person's full name, returned as formatted string
	{
		String fullName;
		fullName = fName.concat(" ").concat(lName);
		return fullName;
	}
}
