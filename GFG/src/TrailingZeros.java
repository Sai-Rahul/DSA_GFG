
public class TrailingZeros {

	static int countTrailZero(int n)
	{
		int res= 0;
		
		for(int i=5; i<=n; i= i*5)
		{
			res= res+n/i;
		}
		return res;
	}
public static void main(String[] args) {
		int number =10;
		System.out.println(countTrailZero(number));

	}
}
