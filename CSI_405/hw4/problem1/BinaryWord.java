package edu.albany.problem1;

import java.util.BitSet;

public class BinaryWord implements Complementable<BitSet>
{
	private String bitWord;
	private BitSet bitSet;
	
	public BinaryWord(String word)
	{
		this.bitWord = word;
		this.bitSet = new BitSet();
		
		// Convert string to bitset
		char c[] = bitWord.toCharArray();
		for(int i = 0; i < c.length; i++)
		{
			if (c[i] == '1')	// If the byte is 1 then store a 1 into the bit set
				this.bitSet.set(i, true);
			else				
				this.bitSet.set(i, false);	// Else store a 0 into the bit set
			// **** CHECK FOR OTHER CHARACTERS??? **** //
		}
	}
	
	// Get bit word
	public String getBinaryWord()
	{
		return this.bitWord;
	}
	
	// Set bit word
	public void setBinaryWord(String word)
	{
		this.bitWord = word;
	}
	
	// Get bit set
	public BitSet getBinWordSet()
	{
		return bitSet;
	}
	
	// Set bit Set
	public void setBinWordSet(BitSet bs)
	{
		this.bitSet = bs;
	}
	
	// Implemented Complementable interface method
	@Override
	public BitSet complement()
	{
		// invert the bitset
		this.bitSet.flip(0, this.bitWord.length());
		
		return this.bitSet;
	}
	
	// Equals method to see if two binary words are equal
	public boolean equals(BinaryWord bs)
	{
		if (this.getBinWordSet().equals(bs.getBinWordSet()))
			return true;
		else
			return false;
	}
	
	// toString method
	@Override
	public String toString()
	{
		// Convert the BitSet into a string
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < this.bitWord.length(); i++)
		{
			if (bitSet.get(i) == true)
				sb.append("1");
			else
				sb.append("0");
		}
		return sb.toString();
	}
}
