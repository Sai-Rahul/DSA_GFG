
public class arraySortedOrNot {
	
	static boolean arraySorted(int arr[])
	{
		for(int i=0; i<arr.length;i++)
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
					return false;
			}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {5, 12, 30, 6,35};
		System.out.println(arraySorted(arr));

	}

}
