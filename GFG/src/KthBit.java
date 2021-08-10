
public class KthBit {
	
	static void KthBit(int n, int k)
	{
		//if (n &(1<<(k-1))!=0)
		if ((n & (1 << (k - 1))) == 1)
			
			System.out.println("SET");
		else
			System.out.println("NOT SET");
	}

	public static void main(String[] args) {
		
		int n=5; int k=1;
		KthBit(n,k);
		

	}

}
