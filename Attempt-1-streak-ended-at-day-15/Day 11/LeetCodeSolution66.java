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
            if(index==0 && carry!=0)
            {
            	int arr[] = new int[digits.length+1];
            	arr[0] = carry;
            	for(int i=1;i<arr.length;i++)
            		arr[i] = digits[i-1];
            	digits = arr;
            }
            index--;
        }
        
        return digits;
    }
	
	public static void main(String[] args) {
		int arr[] = {9,9};
		arr = plusOne(arr);
		System.out.println(Arrays.toString(arr));

	}

}
