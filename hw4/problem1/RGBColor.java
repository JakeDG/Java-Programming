package edu.albany.problem1;

public class RGBColor extends SemiGroup<RGBColor> implements Complementable<RGBColor>
{
	// Stores 3 integer values range 0-255, chars are unsigned in java
	private int r, g, b;
	
	public RGBColor(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	// Overridden complement function from Complementable interface
	@Override
	public RGBColor complement()
	{
		return new RGBColor(255 - this.r, 255 - this.g, 255 - this.b);
	}
	
	// Overridden operate function from SemiGroup parent class
	@Override
	public RGBColor operate(RGBColor c)
	{
		return new RGBColor((this.r + c.r)/2, (this.g + c.g)/2, (this.b + c.b)/2);
	}
	
	// equals Method
	public boolean equals(RGBColor c)
	{
		if (this.r == c.r && this.g == c.g && this.b == c.b)
			return true;
		else
			return false;
	}
	
	// toString Method
	@Override
	public String toString()
	{
		return "[" + this.r + ", " + this.g + ", " + this.b + "]";
	}
}
