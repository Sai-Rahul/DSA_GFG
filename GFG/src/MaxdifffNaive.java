
public class MaxdifffNaive {
	static int maxDiffNaive(int arr[], int n)
	{
		int res= arr[1]-arr[0];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1; j<n;j++)
				res=Math.max(arr[j], arr[i]);
		}
		return res;
	}
public static void main(String args[])
{   int arr[]= {2, 3, 10, 6, 4, 8, 1}; int n=7;
	System.out.println(maxDiffNaive(arr,n));
	}
}