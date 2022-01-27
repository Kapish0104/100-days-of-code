package allsolutions;

import java.util.Arrays;

public class LeetCodeSolution66 {

    public static int[] plusOne(int[] digits) {
        int index = digits.length-1;
        int carry = -1;
        while(carry!=0 && index>=0)
        {
            carry = (digits[index] +1)/10;
            int sum = (digits[index]+1)%10;
            digits[index] = sum;
        }
        
        return digits;
    }
	
	public static void main(String[] args) {
		int arr[] = {2,4,9};
		arr = plusOne(arr);
		System.out.println(Arrays.toString(arr));

	}

}
