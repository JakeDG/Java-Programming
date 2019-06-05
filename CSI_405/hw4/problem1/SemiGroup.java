package edu.albany.problem1;

import java.util.Collection;

public abstract class SemiGroup<T>
{
	public abstract T operate(T a);
	
	// compute & accumulate the operator results sequentially for all the elements in a Collection
	public static <T extends SemiGroup<T>> T combine(Collection<T> list)	// <T extends SemiGroup<T>> means that the type T inherits from the SemiGroup class and thus can use its methods
	{
		// Accumulate the operate() results from a collection
		T acc;	// Accumulator of type T
		acc = list.iterator().next();	// Get first value from collection (assuming it's not empty)
		boolean firstElement = true; // Remove 1st element to ensure that the 1st element is not calculated in the combination
		for(T i: list)
		{
			if (firstElement == false) 
			{
				try 
				{
					acc = acc.operate(i);	// Compute the results of operate function
				}
				catch (Exception e)
				{
					System.out.println("Error: In function 'combine': Cannot combine/operate on different object types.");
					return null;
				}
			}
				
			firstElement = false;
		}
		
		return acc;
	}
}
