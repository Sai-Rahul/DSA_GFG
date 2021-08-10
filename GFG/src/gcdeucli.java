
public class gcdeucli {
	static int gcd(int a, int b)
	{
		while (a!=b)
		{
			if (a>b)
				a= a-b;
			else
				b= b-a;
		}
		return a;
	}
	

	public static void main(String[] args) {
		 int a= 10;
		 int b=15;
		System.out.println(gcd(a,b));
		

	}

}
