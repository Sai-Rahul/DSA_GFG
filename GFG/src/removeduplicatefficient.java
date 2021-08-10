
public class removeduplicatefficient {
	
	static int removeDupsEffi(int arr[], int n)
	{
		int res=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
    int arr[]= {10, 20, 20, 30, 30, 30}; int n=6;
    System.out.println("Before Removal");
    for(int i=0; i<n;i++)
    {
    	System.out.println(arr[i]+ " ");
    }
    System.out.println();
    
    n=removeDupsEffi(arr,n);
    System.out.println("After Removal");
    for(int i=0; i<n;i++)
    {
    	System.out.println(arr[i]+ " ");
    }
  }

}
