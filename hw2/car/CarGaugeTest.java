package edu.albany.hw2.car;

public class CarGaugeTest 
{
	public static void main(String[] args) 
	{
		//int milesTraveled = 0; // Stores the miles traveled per gallon
		
		// Create fuel gauge object
		FuelGauge fGauge = new FuelGauge(0);
		
		// Create odometer object
		Odometer oMeter = new Odometer(0,0);
		
		// Fill the car's fuel tank (max of 15 gallons)
		System.out.println("Filling the car's gas tank...");
		while (fGauge.getFuelLevel() < 15)
			fGauge.incFuelLevel();
		
		// Info Messages
		System.out.println("Gas tank filled.");
		System.out.println("Starting to drive the car...");
		
		// Start driving
		do
		{
			// Increase car's mileage
			oMeter.incMileage();
			
			// Check if fuel needs to be decreased
			oMeter.milesFuelCheck(fGauge);
			
			// Display car's current mileage and fuel level
			System.out.printf("Mileage: %d mile(s) | Fuel: %d gallon(s)\n", oMeter.getMileage(), fGauge.getFuelLevel());
			
		} while (fGauge.getFuelLevel() > 0);
	}
}
