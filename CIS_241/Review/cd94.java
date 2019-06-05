package revPack;

/* Jacob Gidley
 * Exercise 9-4 cd subclass
 * This class will define a cd
 */
 
public class cd94 extends account94 
{
	double intRate;
	int months;

	public cd94(int n, double ir, int m) 
	{
		super(n);
		intRate = ir;
		months = m;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getaccountinfo() {
		// TODO Auto-generated method stub
		return "CD Account Information:\n" + acctnum + " " + intRate + " " + months;
	}

}
