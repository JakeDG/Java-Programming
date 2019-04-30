package edu.albany.fproj.people;

import edu.albany.fproj.address.Address;
import edu.albany.fproj.person.Person;
import java.util.concurrent.ThreadLocalRandom;

/* This class models an event host who has the following properties:
 * title, rating, number of events hosted that the vendor business has attended, and an ID.
 * The rest of this class's properties are inherited from the Person class.
 */
public class EventHost extends Person
{
	private String title;
	private double rating;
	private int eventsHostedCount; // stores number of events hosted that the vendor business has attended
	private int id;

	// Event host constructor
	public EventHost(String first, String last, String phoneNum, String email, Address address, String ttl, double rate, int hosted) 
	{
		super(first, last, phoneNum, email, address);
		this.title = ttl;
		this.eventsHostedCount = hosted;
		this.id = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);	// ID is randomly generated
		
		// Rating is between 0-10
		if (rate > 10)
			this.rating = 10;
		else if (rate < 0)
			this.rating = 0;
		else
			this.rating = rate;
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

	public double getRating() 
	{
		return rating;
	}
	
	// Set only allows a rating between 0-10
	public void setRating(double rate) 
	{
		if (rate > 10)
			this.rating = 10;
		else if (rate < 0)
			this.rating = 0;
		else
			this.rating = rate;
	}

	public int getEventsHostedCount() 
	{
		return eventsHostedCount;
	}

	public void setEventsHostedCount(int hosted) 
	{
		this.eventsHostedCount = hosted;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	/* Misc mehtod */
	
	public String toString()
	{
		return title + ", " + super.toString() + " " + "\nID: " + id + "\nEvents Hosted: " + eventsHostedCount + " " + "\nRating: " + rating; 
	}
}
