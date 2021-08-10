
public class ArrayInsert {
	
	static int ArrayInsert(int arr[],int n, int x, int pos, int cap)
	{
		if (n==cap)
			return n;
		int idx= pos-1;
		for (int i=n-1; i>=idx;i++)
		{
			arr[i+1]= arr[i];
			arr[idx]=x;
		}
		return (n+1);
		
	}

	public static void main(String[] args) {
		int arr[]= new int[5]; int n=3; 
		arr[0]= 5; arr[1]= 10; arr[2]=20; int cap= 5;
		System.out.println("Before Insertion");
		for (int i=0; i<n;i++)
		{
			System.out.println(arr[i]+ "");	
		}
		System.out.println();

	       int x = 7, pos = 2;

	       n = ArrayInsert(arr, n, x, pos, cap);

	       System.out.println("After Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	}

}
