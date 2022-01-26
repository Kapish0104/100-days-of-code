package allsolutions;

public class LeetCodeSolution27 {
	
	  public int removeElement(int[] nums, int val) {
	        int start = 0;
	        int end = nums.length-1;
	        
	        while(start<=end)
	        {
	            while(end>=0 && nums[end]==val)
	                end--;
	            while(start<nums.length && nums[start]!=val)
	                start++;
	            
	            if(start<=end)
	            {
	                int tmp = nums[start];
	                nums[start] = nums[end];
	                nums[end] = tmp;
	            }
	        }
	        return end+1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
