package allsolutions;

import java.util.Arrays;

public class LeetCodeSol136 {
    public static int singleNumber(int[] nums) {
        /*if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2)
        {
            if(nums[i]!=nums[i+1])
                return nums[i];
            if(i+2 == nums.length-1)
                return nums[i+2];
        }
        
        return 0;*/
    
    
    int result = 0;
    for(int i : nums) {
        result ^= i;
        System.out.println("element=" + i + "   result = "+result);
    }
    return result;
    }
    
    public static void main(String[] args) {
		int arr[] = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}
    
}
