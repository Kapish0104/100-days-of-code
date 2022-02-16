package allsolutions;

import java.util.Arrays;


public class sol15 {
    public static void nextPermutation(int[] nums) {
    	if(nums.length<=1)
    		return;
    	int found = 0;
    	for(int i =nums.length-2;i>=0;i--)
    	{
    		for(int p = nums.length-1;p>i;p-- )
    		{
    			if(nums[p]>nums[i])
    			{
    				int tmp = nums[p];
    				nums[p] = nums[i];
    				nums[i] = tmp;
    				found=1;
    				Arrays.sort(nums,i+1,nums.length);
    				break;
    			}
    			
    		}
    		if(found==1)
				{	
    				
    		    	System.out.println((Arrays.toString(nums)));
    				break;
				}
    	}
    	if(found==0)
    		Arrays.sort(nums);
    	System.out.println((Arrays.toString(nums)));
    	
    }
    
    public static void main(String[] args) {
		int arr[] = {1,3,2};
		nextPermutation(arr);
	}

}
