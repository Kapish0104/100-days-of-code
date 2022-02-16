package allsolutions;

import java.util.Arrays;

public class LeetCodeSolution88 {
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)
        {
            for(int i =0;i<nums2.length;i++)
	        		nums1[i] = nums2[i];
	        return;
        }
        if(n==0)
            return;
        
        int arr[] = new int[m];
        
        for(int i =0;i<m;i++)
            arr[i] = nums1[i];

        int p1 = 0;
        int p2 = 0;
        int i =0;
        while(p1<m && p2<n)
        {
            if(arr[p1]<nums2[p2])
            {
                nums1[i] = arr[p1];
                p1++;
            }
            else
            {
                nums1[i] = nums2[p2];
                p2++;
            }
            i++;
        }
        if(p1!=m)
        {
            for(int j=p1;j<m;j++)
            {
                nums1[i] = arr[j];
                i++;
            }
        }
        else if(p2!=n)
        {
            for(int j=p2;j<n;j++)
            {
                nums1[i] = nums2[j];
                i++;
            }
        }
    }
	public static void main(String[] args) {
		int nums1[] = {4,0,0,0,0,0};
		int nums2[] = {1,2,3,5,6};
		merge(nums1 , 1 , nums2 , 5);
		System.out.println(Arrays.toString(nums1));
	}

}
