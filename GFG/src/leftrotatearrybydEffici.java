import java.util.*;
import java.io.*;
import java.lang.*;

public class leftrotatearrybydEffici {
	static void LeftRotateByD(int arr[], int n, int d)
	{
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
	}
	static void reverse(int arr[], int low, int high)
	{
		while (low<high) 
		{
			int temp= arr[low];
			 arr[low]=arr[high];
			 arr[high]=temp;
			 
			 low++;
			 high--;
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
		LeftRotateByD(arr,d,n);
		System.out.println("After Rotation");
		for(int i=0; i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
}
