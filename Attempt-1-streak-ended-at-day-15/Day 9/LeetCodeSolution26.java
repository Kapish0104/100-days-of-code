package allsolutions;

import java.util.Arrays;

class LeetCodeSolution26 {
    public static int removeDuplicates(int[] nums) {
        
    	//This solution is not very efficient but accepted...
        for(int i =0;i<nums.length;i++)
        {
            int count =0;
            int j=i;
             while(j!=nums.length-1 && nums[j] == nums[j+1] )
             {
            //	 System.out.println("count++");
                count++;
                j++;
            //    System.out.println(j);
            //    System.out.println(nums.length-1);
             }
            if(count!=0)
            {
                for(int k = i+1;k<=i+count;k++)
                {
                	if(i+count+1>nums.length-1)
                		break;
                    nums[k] = nums[i+count+1];
                }
            }
        }
       // System.out.println(Arrays.toString(nums));
        
        int k=0;
        for(int i =0;i<nums.length-1;i++)
        {
        	k++;
        	if(nums[i] == nums[i+1])
        		break;
        }
       // System.out.println(k);
        return k;
    }
    
    public static void main(String[] args) {
    	int[] arr = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(arr);

	}
}
