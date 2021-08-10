
public class arrsortedeffic {
	
	static boolean arraySorted(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {2,2,4,8};
		System.out.println(arraySorted(arr));

	}

}
