
public class Fact {
	static int fact(int n)
	{
		int res= 1;
		for (int i=2; i<=n;i++)
		{
			res = res*i;
		}
		return res;
	}

	public static void main(String[] args) {
		int number =10;
		System.out.println(fact(number));

	}

}
