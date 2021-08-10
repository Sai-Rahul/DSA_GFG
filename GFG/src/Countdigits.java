 import java.util.*;
 
class Countdigits {
	
	static int CountDigit(int x)
	{
		int res= 0;
		while (x>0)
		{
		x= x/10;
		res++;
		}
	return res;
	}
	
	public static void main (String args[])
	{
		int x = 7896;
		System.out.println(CountDigit(x));
	}
}
	
	

