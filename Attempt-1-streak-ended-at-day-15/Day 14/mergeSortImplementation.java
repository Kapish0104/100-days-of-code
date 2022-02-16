package allsolutions;

public class mergeSortImplementation {
	
	public static void mergeSort(int[] arr) {
		mergeSort(arr, 0 , arr.length-1);
		
	}
	public static void mergeSort(int arr[], int start, int end) {
		if(start>=end)
			return;
		int mid = (start + end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1,end);
		System.out.println(start + "  " + mid + " " + end);
	}
	public static void main(String[] args) {
		int arr[] = {5,4,1,2,9,7};
		mergeSort(arr);
	}

}
