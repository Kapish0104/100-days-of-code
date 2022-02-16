package allsolutions;

public class sol13 {
	//Kadane's Algorithm
		//if the sum reaches negative, discard the sub array. Basica concept behind this kadane's algorithm.
		//Brute force would gibe big Oh of n squared solution. I would find all the sub arrays then find the sum. 
	    // arr: input array
	    // n: size of array
	    //Function to find the sum of contiguous subarray with maximum sum.
	    long maxSubarraySum(int arr[], int n){
	        long max_sum = arr[0];
	        long sum = 0;
	        for(int i =0;i<n;i++)
	        {
	            sum+=arr[i];
	            if(sum>max_sum)
	                max_sum = sum;
	            if(sum<0)
	                sum = 0;
	        }
	        
	        return max_sum;
	        
	    }
}
