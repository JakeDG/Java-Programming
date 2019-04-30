package edu.albany.ship;

import edu.albany.cruise.CruiseShip;
import edu.albany.cargo.CargoShip;

public class ShipDriver 
{
	public static void main(String[] args)
	{
		// Declare array of 10 Ships
		Ship[] ships = new Ship[10];
		
		// Initalize all 10 ships in the array
		ships[0] = new CruiseShip("RMS Olympic", "1910", 2435);
		ships[1] = new CargoShip("SS Bolt", "1998", 3345);
		ships[2] = new CargoShip("MSC Carouge", "2007", 4860);
		ships[3] = new CruiseShip("MS Anthem of the Seas", "2015", 4905);
		ships[4] = new Ship("USS Constitution", "1797");
		ships[5] = new CargoShip("MV TransAtlantic", "1997", 4276);
		ships[6] = new Ship("USS Freedom", "2017");
		ships[7] = new Ship("HMS Dreadnought", "1906");
		ships[8] = new CruiseShip("MS Oasis of the Seas", "2009", 6296);
		ships[9] = new CruiseShip("RMS Queen Mary II", "2003", 2695);
		
		// Print all the ships in the array
		for (int i = 0; i < ships.length; i++)
		{
			System.out.println(ships[i]);
		}
	}
}
