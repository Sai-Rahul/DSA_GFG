import java.util.Arrays;

public class sieve {
	static void sieve(int n)
	{
		if (n<=1)
			return;
		
		boolean isprime[] = new boolean[n+1];
		Arrays.fill(isprime, true);
		for (int i =2; i*i <=n ; i++)
		{
			if (isprime[i]==true)
			{
				for (int j=2*i; j<=n; j=j+i)
				{
					isprime[j]=false;
				}
			}
		}
		
		for (int i=2; i<=n; i++)
		{
			if (isprime[i]==true)
			{
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int n=30;
		sieve(n);

	}

}
