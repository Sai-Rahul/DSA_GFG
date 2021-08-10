
public class removeDupsNaive {
	static int removeDups(int arr[], int n)
	{
		int temp[]= new int[n];
		temp[0]=arr[0];
		int res=1;
		for(int i=1;i<n;i++)
		{
			if(temp[res-1]!=arr[i])
			{
				temp[res]=arr[i];
		    res++;
			}
		}
		
		for(int i=0; i<res;i++)
		{
			arr[i]=temp[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {10, 20, 20, 30, 30, 30}; int n = 6;
		
		System.out.println("Before removal");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+ " ");
		}
		 System.out.println();
		 
		 n=removeDups(arr,n);
		 System.out.println("After removal");
			for(int i=0; i<n; i++)
			{
				System.out.println(arr[i]+ " ");
			}
	}

}
