
public class FactRecur {
	static int fact(int n)
	{
		if (n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		int number =3;
		System.out.println(fact(number));

	}

}
