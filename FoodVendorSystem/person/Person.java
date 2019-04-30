package edu.albany.fproj.person;

import edu.albany.fproj.address.Address;

/* Owner, Employee, and EventHost classes all inherit from this class */

/* This class models a person who has the following properties:
 * first name, last name, phone number, email, and also HAS-A address 
 */
public class Person 
{
	protected String firstName, lastName, phoneNum, email;
	protected Address address;
	
	// Person construct
	public Person(String first, String last, String phoneNum, String email, Address address)
	{
		this.firstName = first;
		this.lastName = last;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
	}

	/* Getters & setters */
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String first) 
	{
		this.firstName = first;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String last) 
	{
		this.lastName = last;
	}

	public String getPhoneNum() 
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	/* Misc. methods */
	
	public String toString()
	{
		return firstName + " " + lastName + "\nAddress: " + address + "\nPhone " + phoneNum + "\nEmail " +  email;
		
	}
}
