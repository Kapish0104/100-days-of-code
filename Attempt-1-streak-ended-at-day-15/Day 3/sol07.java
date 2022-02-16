package allsolutions;

import java.util.Arrays;

public class sol07 {

	//method1
	/*
	public static void rotate(int arr[], int n)
	{
	    for(int i =0;i<n-1;i++)
	    {
	    	int tmp = arr[i];
	    	arr[i] = arr[n-1];
	    	arr[n-1] = tmp;
	    }
	}*/
	
	//method2
	public static void rotate(int arr[], int n)
	{
		int lastdig = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[0] = lastdig;
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] numbers = {-12,11,-13,-5,6,-7,5,-3,-6};
		rotate(numbers, numbers.length);

	}

}
