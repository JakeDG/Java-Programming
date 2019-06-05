/* Jacob Gidley
 * Exercise 13-2d
 * This program will output to a file using character input streams
 */

package files13;

import java.io.*;

public class ex132d {

	public static void main(String[] args) throws IOException 
	{
		FileReader is;
		FileWriter os;
		int value;
		String fileNameIn;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		File fIn;
		
		System.out.print("Enter input filename: ");
		fileNameIn= br.readLine();
		
		
		try
		{
			fIn = new File(fileNameIn);
			is = new FileReader(fIn);
			
			StreamTokenizer st = new StreamTokenizer(is);
			int token;
			st.parseNumbers();
			st.eolIsSignificant(true);
			st.wordChars('A', 'Z');
			st.wordChars('a', 'z');
			st.whitespaceChars('.', '.');
			
			token = st.nextToken();
			while(token != StreamTokenizer.TT_EOF)
			{
				if (token == StreamTokenizer.TT_WORD)
				{
					System.out.print(st.sval);
				}
				else if (token == StreamTokenizer.TT_NUMBER)
				{
					System.out.printf("%.1f", st.nval * 2);
				}
				else if (token == StreamTokenizer.TT_EOL)
				{
					System.out.println("\n");
				}
				token = st.nextToken();
			}
			is.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
