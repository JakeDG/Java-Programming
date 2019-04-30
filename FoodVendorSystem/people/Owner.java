package edu.albany.fproj.people;

import edu.albany.fproj.address.Address;
import edu.albany.fproj.person.Person;

/* This class models an owner of a vendor business. An owner has the following property:
 * A title, ex. CEO
 * The rest of this class's properties are inherited from the Person class.
 */
public class Owner extends Person
{
	private String title;
	
	// Owner constructor
	public Owner(String first, String last, String phoneNum, String email, Address address, String ttl)
	{
		super(first, last, phoneNum, email, address);
		this.title = ttl;
	}

	/* Getters & setters */
	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String ttl) 
	{
		this.title = ttl;
	}
	
	/* Misc. methods */
	
	public String toString()
	{
		return title + " " + super.toString();
	}
}
