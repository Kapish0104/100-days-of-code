package allsolutions;

import java.util.Arrays;

//This solution exceeds time
//I feel will have to sort this set and then find out

public class sol03 {
	
	public static int kthSmallest(int[] arr, int k) 
    { 
        /*for(int i=0;i<k;i++)
        {
        	int min = arr[0];
        	for(int j=0;j<arr.length-1;j++)
        	{
        		
        		if(arr[j]<arr[j+1]) {
        			int tmp =arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = tmp;
        		}
        	}
        }
        */
		Arrays.sort(arr);
        return(arr[k-1]);
}
public static void main(String[] args) {
	int[] numbers = {5,7,2,99,-4,7,101,6,2};
	
	int num = kthSmallest(numbers , 3);
	
	System.out.println(num);
}
}
