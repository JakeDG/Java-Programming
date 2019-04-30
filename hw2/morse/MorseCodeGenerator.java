package edu.albany.hw2.morse;

import java.util.Hashtable;

/* Strategy for code table:
 * 
 * Firstly, I used two arrays. One which held the English characters and another that held their Morse code translation. The indexes for both arrays
 * are synced up so that the English characters in the English array have the same index as their Morse code translations in the Morse code array.
 * Lastly, I stored these values in a hash table using the English characters as the keys and their associated Morse code translation as their value.
 * I chose to store the code table in this manner because it seemed like the most efficient, clean, and organized method to choose from.
 * It also made sense to use a hash table because there are no duplicate values and it is very easy to look up values using the English characters as keys.
 */

public class MorseCodeGenerator 
{
	/* Instance variables */
	
	// Stores the English characters
	private String[] eng = {" ", ",", ".", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
							"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
							"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	// Stores Morse code version of English characters
	private String[] mor = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
							".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", 
							"---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
	
	// Maps the values of each English character to it Morse code equivalent
	private Hashtable<String, String> codeTable;
	
	// Morse code generator constructor
	public MorseCodeGenerator()
	{
		// Initialize the hash table
		codeTable = new Hashtable<>();
		
		// Fill the code table, English chars as keys and Morse as their values
		for (int i = 0; i < eng.length; i++)
		{
			codeTable.put(eng[i], mor[i]);
		}
	}
	
	// Tanslates the string argument provided into Morse code
	public String translate(String str)
	{
		// Create a string buffer for dealing with larger strings
		StringBuffer buf = new StringBuffer();
		
		// Loop through the input string and get each char value from the code map
		for (int i = 0; i < str.length(); i++)
		{
			buf.append(codeTable.get(String.valueOf(str.charAt(i)).toUpperCase())); // Keep appending the Morse code to the buffer
		}
		
		return buf.toString(); // Convert the buffer to a string and return it
	}
}
