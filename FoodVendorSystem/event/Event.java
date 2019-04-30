package edu.albany.fproj.event;

import java.util.concurrent.ThreadLocalRandom;
import edu.albany.fproj.address.Address;
import edu.albany.fproj.people.EventHost;

/* This class models an event that the vendor business will attend.
 * It has the following properties:
 * name, time, date, rain date, location (HAS-A Address), estimated turnout for the event, 
 * number of other vendors that are attending, and an id
 */
public class Event 
{
	private String name, time, date, rainDate;
	private Address location;
	private EventHost host;
	private int estTurnout, numOfVendors, id;
	
	// Event constructor
	public Event(String name, String time, String date, String rDate, Address loc, EventHost host, int tOut, int numV)
	{
		this.name = name;
		this.time = time;
		this.date = date;
		this.rainDate = rDate;
		this.location = loc;
		this.host = host;
		this.estTurnout = tOut;
		this.numOfVendors = numV;
		this.id = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);	// ID is randomly generated
	}

	/* Getters & setters */
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getTime() 
	{
		return time;
	}

	public void setTime(String time) 
	{
		this.time = time;
	}

	public String getDate() 
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public String getRainDate() 
	{
		return rainDate;
	}

	public void setRainDate(String rainDate) 
	{
		this.rainDate = rainDate;
	}

	public Address getLocation() 
	{
		return location;
	}

	public void setLocation(Address location) 
	{
		this.location = location;
	}

	public EventHost getHost() 
	{
		return host;
	}

	public void setHost(EventHost host) 
	{
		this.host = host;
	}

	public int getEstTurnout() 
	{
		return estTurnout;
	}

	public void setEstTurnout(int estTurnout) 
	{
		this.estTurnout = estTurnout;
	}

	public int getNumOfVendors() 
	{
		return numOfVendors;
	}

	public void setNumOfVendors(int numOfVendors) 
	{
		this.numOfVendors = numOfVendors;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	/* Misc. methods */
	
	public String toString()
	{
		return "Event Name: " + name + "\nEvent Host: " + host.getFirstName() + " " + host.getLastName()+ ", ID: " + host.getId() 
				+ "\nEvent ID: " + id + "\nLocation: " + location + "\nDate/Time: " + date + " @ " + time + "\nRain Date: " + rainDate + 
				"\nEstimated Turnout: " + estTurnout + "\nNumber of Other Vendors: " + numOfVendors;
	}
}
