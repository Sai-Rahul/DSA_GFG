
public class printDivisorsNaive {

	static  void printDivisorsNaive(int n)
	{
		for (int i=1; i<=n; i++)
		{
			if (n%i==0)
				System.out.println(i+"");
			//System.out.println();
		}
	}
	public static void main(String[] args) {
		int n= 10;
		printDivisorsNaive(n);

	}

}
