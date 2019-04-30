package edu.albany.hw2.stock;

public class StockTest 
{
	public static void main(String[] args) 
	{
		// Create stock objects
		Stock s1 = new Stock("MSFT");
		Stock s2 = new Stock("GOGL");
		
		// Set previous stock prices
		s1.setPreviousClosingPrice(58.9);
		s2.setPreviousClosingPrice(76.3);
		
		// Set new stock prices
		s1.setCurrentPrice(59);
		s2.setCurrentPrice(74.8);
		
		// Display the price change
		System.out.printf(s1.getSymbol().getName() + "(" + s1.getSymbol() + ")" + " stock price change from $%.2f to $%.2f is: %.2f%%\n", s1.getPreviousClosingPrice(), s1.getCurrentPrice(), s1.getPercentChange());
		System.out.printf(s2.getSymbol().getName() + "(" + s2.getSymbol() + ")" + " stock price change from $%.2f to $%.2f is: %.2f%%\n", s2.getPreviousClosingPrice(), s2.getCurrentPrice(), s2.getPercentChange());
	}
}
