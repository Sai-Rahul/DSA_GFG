import java.util.*;

public class GFG {
	
	static int countDigit(long n)
	{
		if(n==0)
			return 0;
		return 1+countDigit(n/10);
	}
	
	public static void main(String args[])
	{
		long n = 1234555566;
		System.out.println("Number of digits :" + countDigit(n));
	}

}
