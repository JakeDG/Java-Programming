package com.ualbany.hw1.problem3;

public class CheckingBankAccount 
{	
	// Instance variables
	private double value;	// Amount in the account
	
	// Checking Bank Account constructor
	public CheckingBankAccount(double val)
	{
		value = val;
	}
	
	public void setValue(double val) // Set account amount
	{
		value = val;
	}
	
	public double getValue() // Get account value
	{
		return value;
	}
	
	public void deposit(double dAmt) // Make a deposit (Add to account value)
	{
		value += dAmt;
	}
	
	public void withdraw(double wAmt) // Make a withdrawal (Subtract from account value)
	{
		value -= wAmt;
	}
}
