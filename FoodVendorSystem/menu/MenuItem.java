package edu.albany.fproj.menu;

import java.util.*;
import java.util.Map.Entry;

/* This class uses generics, polymorphism, and the design pattern of abstract methods */

/* MenuItem is a generic abstract class and is used to ensure that any child of this class can have 
 * its price manipulated and its Enum constant retrieved. It also includes a method that allows the vendor business to 
 * adjust its menu prices on a certain type of menu item.
 */
public abstract class MenuItem<T extends MenuItem<T>>
{
	public abstract void adjustPrice(Double r);
	public abstract String getItemCode();
	
	// Adjust menu item prices type is defined by the boolean argument. True = food, False = drink 
	public static void adjustTypePrices(Hashtable<String, MenuItem<?>> table, double r, boolean type)
	{
		// Iterate over table
		for (Entry<String, MenuItem<?>> entry : table.entrySet())
		{
			if (type && entry.getValue() instanceof FoodItem)	// Adjust food prices by percent value
				entry.getValue().adjustPrice(r);
			else if(!type && entry.getValue() instanceof DrinkItem) // Adjust drink prices by exact value
				entry.getValue().adjustPrice(r);
		}
	}
}