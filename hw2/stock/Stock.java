package edu.albany.hw2.stock;

public class Stock 
{
	// Instance variables
	private double previousClosingPrice; // Stores stock price of previous day
	private double currentPrice; // Stores the stock price for current time
	private Symbol symbol; // Stores stock's symbol
	
	// Stock constructor
	public Stock(String sym) 
										// Specified symbol and name ????????????????????????????????????
	{
		symbol = Symbol.valueOf(sym);
	}
	
	/* Mutator methods */
	
	// Set previous closing price
	public void setPreviousClosingPrice(double pcp)
	{
		previousClosingPrice = pcp;
	}
	
	// Set current price
	public void setCurrentPrice(double cp)
	{
		currentPrice = cp;
	}
	
	// Set stock symbol
	public void setSymbol(String sym)
	{
		symbol = Symbol.valueOf(sym);
	}
	
	/* Accessor Methods */
	
	// Get previous closing price
	public double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	}
	
	// Get current price
	public double getCurrentPrice()
	{
		return currentPrice;
	}
	
	// Get percent changed from previous closing price to current price
	public double getPercentChange()
	{
		double change = (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
		return change;
	}
	
	// Get stock symbol
	public Symbol getSymbol()
	{
		return symbol;
	}
}

/* Symbol ENUM Class */
// enum that represents companie's stock
enum Symbol 
{
	MSFT("Mircosoft"),
	APL("Apple"),
	GOGL("Google"),
	AMZN("Amazon"),
	ATT("AT&T");
		
	private String cName; // Stores the name associated with the Symbol enum
		
	// Symbol enum constructor
	private Symbol(String n) 
	{
		cName = n;
	}
		
	// Returns string name of the symbol
	public String getName()
	{
		return cName;
	}
}