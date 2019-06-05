// d72
/* 1. String object convert to parallel integer ascii unicode
array, and print integer array.
2. String object convert to character array, and print
character array.
3. String object (of all seasons) convert to String array
of the four seasons (without the ,).
*/
public class db72
{
 public static void main(String[] args)
 {
  String seasons = "Spring,Summer,Fall,Winter";
  int[] seasonsascii = new int[seasons.length()];  // method - same size of parallel array
  char[] seasonscharray;
  String[] seasonsarray;
  int i, j, k, l;
  for (i = 0; i < seasons.length(); i++)
   seasonsascii[i] = seasons.codePointAt(i); // method - convert each to integer
  for (j = 0; j < seasonsascii.length; j++)
   System.out.println(seasonsascii[j]);
  seasonscharray = seasons.toCharArray(); // method - convert String to character array
  for (k = 0; k < seasonscharray.length; k++)
   System.out.println(seasonscharray[k]);
  seasonsarray = seasons.split(",");  // method - divide up seasons array at seasons
  for (l = 0; l < seasonsarray.length; l++)
   System.out.println(seasonsarray[l]);

 }
}

