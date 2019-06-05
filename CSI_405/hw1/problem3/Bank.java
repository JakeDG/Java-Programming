package com.ualbany.hw1.problem3;

public class Bank 
{
	// Instance variables 
	private String bName;
	private Address bAddress;
	
	// Bank constructor
	public Bank(String bn, String l1, String l2, String c, String s, String z)
	{
		bName = bn;
		bAddress = new Address(l1, l2, c, s, z);
	}
	
	/* Set methods */
	public void setBankName(String bn)
	{
		bName = bn;
	}
	
	/* Get methods */
	public String getBankName()
	{
		return bName;
	}
	
	public Address getBankAddress()
	{
		return bAddress;
	}
	
	/* Misc methods */
	public void printReceipt(Person p, double amt, boolean dep)
	{
		if (dep)
			System.out.printf("Receipt | Deposit: $%.2f | " + p.getFullName() + " | " + p.getPersonAddress().getFullAddress() + " | Acc. Value: $%.2f\n", amt, p.getAccount().getValue());
		else
			System.out.printf("Receipt | Withdrawal: $%.2f | " + p.getFullName() + " | " + p.getPersonAddress().getFullAddress() + " | Acc. Value: $%.2f\n", amt, p.getAccount().getValue());
	}
	
	public static void main(String[] args)
	{
		// Create bank
		Bank kBank = new Bank("KeyBank", "370", "Delaware Ave.", "Delmar", "New York", "12159");
		
		// Create person
		Person person = new Person("Jason", "Bradley", "13", "Bridge St.", "Slingerlands", "New York", "12454", 0);
	
		// Simulate person arriving at bank
		System.out.println(person.getFullName() + " arrvives at " + kBank.getBankName());
		
		// Simulate the person opening the account
		System.out.println(person.getFirstName() + " opens a checking account and deposits $1000.");
		person.getAccount().deposit(1000);
		kBank.printReceipt(person, 1000, true); // Print receipt
		
		// Simulate a deposit of 1000 and a withdrawal of 500
		System.out.println(person.getFirstName() + " deposits $1000.");
		person.getAccount().deposit(1000);
		kBank.printReceipt(person, 1000, true);
		
		System.out.println(person.getFirstName() + " withdraws $500.");
		person.getAccount().withdraw(500);
		kBank.printReceipt(person, 500, false);
	}
}
