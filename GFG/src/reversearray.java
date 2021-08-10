
public class reversearray {
	
	static void reverseArray(int arr[], int n)
	{
	int low =0; 
	int high=n-1;
	int temp;
	while(low<high)
	{
		temp= arr[low];
		arr[low]= arr[high];
		arr[high]=temp;
		low++;
		high--;
	}
	}
	public static void main(String[] args) { 
	       int arr[] = {1,2,3,4,5,6,7}, n = 7;

	       System.out.println("Before Reverse");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       reverseArray(arr, n);

	       System.out.println("After Reverse");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
	}

}
