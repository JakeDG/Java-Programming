package edu.albany.problem1;

import java.util.*;

public class ProblemDriver 
{
	public static void main(String[] args)
	{
		// Create a binary word and find its complement.
		BinaryWord bw1 = new BinaryWord("001011");
		BinaryWord bw2 = new BinaryWord("111100001");
		BinaryWord bw3 = new BinaryWord("110100");
		
		// Print out values of binary words
		System.out.printf("Value of 1st BinaryWord: %s\n", bw1);
		System.out.printf("Value of 2nd BinaryWord: %s\n", bw2);
		System.out.printf("Value of 3rd BinaryWord: %s\n", bw3);
		
		bw1.complement();	// Get the complement of the 1st binary word
		bw2.complement();	// Get the complement of the 2nd binary word
		System.out.printf("The complement of the 1st binary word %s is %s\n", bw1.getBinaryWord(), bw1);
		System.out.printf("The complement of the 2nd binary word %s is %s\n", bw2.getBinaryWord(), bw2);
		
		if (bw1.equals(bw3)) 
			System.out.printf("The binary word %s is the complemnt of %s\n", bw3, bw1.getBinaryWord());
		else
			System.out.printf("The binary word %s is NOT the complemnt of %s\n", bw3, bw1);
		
		// Create positive integers
		PositiveInteger p1 = new PositiveInteger(7);
		PositiveInteger p2 = new PositiveInteger(13);
		PositiveInteger p3;

		// Operate on the two PositiveIntegers
		p3 = p1.operate(p2);
		
		// Print value of positive integers
		System.out.printf("Value of 1st PositiveInteger: %s\n", p1);
		System.out.printf("Value of 2nd PositiveInteger: %s\n", p2);
		System.out.printf("Value of new PositiveInteger after using operate() on the previous PositiveIntegers is: %s\n", p3);
		
		// Create RGBColors
		RGBColor c1 = new RGBColor(32, 96, 128);
		RGBColor c2 = new RGBColor(0, 99, 255);
		RGBColor c3;
		
		// Operate on the two RGBColors
		c3 = c1.operate(c2);
		
		// Print value of RGBColor
		System.out.printf("Value of 1st RGBColor: %s\n", c1);
		System.out.printf("Value of 2nd RGBColor: %s\n", c2);
		System.out.printf("Value of complent of 1st RGBColor %s is: %s\n", c1, c1.complement());
		System.out.printf("Value of complent of 2nd RGBColor %s is: %s\n", c2, c2.complement());
		System.out.printf("Value of new RGBColor after using operate() on the previous RGBColors is: %s\n", c3);
		
		// Create ArrayList of PositiveIntegers to combine()
		ArrayList<PositiveInteger> pIntList = new ArrayList<PositiveInteger>();
		pIntList.add(p1);
		pIntList.add(p2);
		pIntList.add(p3);
				
		// Print value of combined PositiveInteger list
		System.out.printf("The result of the combined() method used on the PositiveInteger list %s is: %s\n", pIntList, SemiGroup.combine(pIntList));
		
		RGBColor c4 = new RGBColor(54, 72, 119);	// Create another RGBColor object to also operate on
		
		// Create ArrayList of RGBColors to combine()
		ArrayList<RGBColor> rgbcList = new ArrayList<RGBColor>();
		rgbcList.add(c1);
		rgbcList.add(c2);
		rgbcList.add(c3);
		rgbcList.add(c4);
				
		// Print value of combined RGBColor list
		System.out.printf("The result of the combined() method used on the RGBColor list %s is: %s\n", rgbcList, SemiGroup.combine(rgbcList));
	}
}
