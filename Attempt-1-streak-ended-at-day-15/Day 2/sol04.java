package allsolutions;

import java.util.Arrays;

public class sol04 {
	
    //method1
	public static void sort012(int a[], int n)
    {
        int count1 = 0, count2 = 0, count0 = 0;
        
        for(int i =0; i<a.length;i++)
        {
        	if(a[i] ==0)
        		count0++;
        	if(a[i] ==1)
        		count1++;
        	if(a[i] ==2)
        		count2++;
        }
        
        for(int i=0;i<count0;i++)
        	a[i] =0;
        for(int i=count0;i<count0+count1;i++)
        	a[i] =1;
        for(int i=count0+count1;i<a.length;i++)
        	a[i] =2;
        
        System.out.println(Arrays.toString(a));
    }	
	
	//this problem can also be done using multiple position pointers. Have to explore that solution.
    
    public static void main(String[] args) {
    	int[] numbers = {1,0,2,2,1,1,0,2};
    	
    	sort012(numbers,8);
	}

}
