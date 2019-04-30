package edu.albany.problem1;

public class PositiveInteger extends SemiGroup<PositiveInteger>
{
	private Integer num;
	
	public PositiveInteger(Integer i)
	{
		this.num = Math.abs(i);	// Use absolute value to get the positive value of the argument
	}

	public Integer getNum() 
	{
		return this.num;
	}

	public void setNum(Integer i) 
	{
		this.num = i;
	}
	
	// Equals method
	public boolean equals(PositiveInteger p)
	{
		if (this.num == p.getNum())
			return true;
		else
			return false;
	}

	// Overridden operate method
	@Override
	public PositiveInteger operate(PositiveInteger p)
	{
		return new PositiveInteger (this.num + p.getNum());
	}
	
	// toString method
	@Override
	public String toString()
	{
		return this.num.toString();
	}
}
