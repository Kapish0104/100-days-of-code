package allsolutions;

import java.util.*;
public class LeetCodeSolution217 {

	    public boolean containsDuplicate(int[] nums) {
	    //Approach 1   
	    /* Arrays.sort(nums);
	        for(int i =0;i<nums.length-1;i++)
	        {
	            if(nums[i] == nums[i+1])
	                return true;
	        }
	        
	        return false;
	        */
	        //Approach 2
	        
	        /*
	        Set<Integer> set = new HashSet<Integer>();
	        
	        for(int i:nums)
	        {
	            set.add(i);
	        }
	        if(set.size() < nums.length)
	        {
	            return true;
	        }
	        
	        return false;
	        */
	        
	        //Approach 3
	        
	        Set<Integer> set = new HashSet<Integer>();
	        
	        for(int i:nums)
	        {
	            if(set.contains(i))
	                return true;
	            set.add(i);
	        }
	        return false;
	        
	        
	    }
	}
