
public class leftrotatebydNaive {
	static void leftRotateOne(int arr[], int n)
	{
		int temp=arr[0];
		for(int i=1;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	static void leftRotateByD(int arr[], int d, int n)
	{
		for(int i=0; i<d;i++)
		{
			leftRotateOne(arr,n);
		}
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5}; int d=2; int n=5;
		System.out.println("Before Roatation");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		leftRotateByD(arr,d,n);
		System.out.println("After Rotation");
		for(int i=0; i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}
