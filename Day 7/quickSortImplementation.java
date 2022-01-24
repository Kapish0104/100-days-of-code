package allsolutions;

import java.util.Arrays;

public class quickSortImplementation {

	public static void quickSort(int arr[], int low, int high)
	{
		//System.out.println("here");
		if(low>=high)
		{//System.out.println("terminating now");
			return;
		}
		
		int pivot = arr[(low+high)/2];
		int index = partition(arr, low, high, pivot);
		quickSort(arr, low, index-1);
		quickSort(arr, index, high);
	}
	
	public static int partition(int arr[], int low, int high, int pivot)
	{
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			
			if(low<=high)
			{
				int tmp = arr[low];
				arr[low] = arr[high];
				arr[high] = tmp;
				low++;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
		return low;
	}
	
	public static void main(String[] args) {
		int[] numbers = {-12,11,-13,-5,6,-7,5,-3,-6};
		quickSort(numbers, 0, numbers.length-1);

	}

}
