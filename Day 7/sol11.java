package allsolutions;

import java.util.HashSet;
import java.util.Set;

public class sol11 {
	 public int findDuplicate(int[] nums) {
	        //This Solution Exceeds time. Kind of Brute force
	        
	        /*int sol = nums[0];
	        int flag = 0;
	        for(int i=0;i<nums.length;i++)
	        {
	            int last = nums.length-1;
	            for(int j=i+1;j<=last;j++)
	            {
	                if(nums[i] == nums[j] || nums[i] == nums[last])
	                {
	                    sol = nums[i];
	                    flag = 1;
	                    break;
	                }
	                last--;
	            }
	            if(flag == 1)
	                break;
	        }*/
	        
	        //This solution works but is faster than only 5% of the total solutions. Plus uses a lot of space
		 /*
	        Set<Integer> set = new HashSet<Integer>();
	        int curr_len =0;
	        for(int num:nums)
	        {
	            set.add(num);
	            if(curr_len == set.size())
	            {
	                return num;
	            }
	            curr_len = set.size();
	        }
	        
	        return -1;
	    */
		 
		 //Binary Search Approach
		 int duplicate =-1;
		 int low = 0;
		 int high = nums.length;
		 while(low>=high)
		 {
			 int mid = (low+high)/2;
			 int count=0;
			 for(int num:nums)
				 if(num<=mid)
					 count++;
			 if(count>mid)
			 {
				 duplicate = mid;
				 high = mid-1;
			 }
			 else
			 {
				 low = mid+1;
			 }
		 }
		 return duplicate;
		 
	    }
	    
	    //A solution called 'Negative Marking for this problem is present on Leetcode. Its an amazing Sol'n

}

