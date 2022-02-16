package allsolutions;

import java.util.Arrays;

public class sol12 {
	//implementation is not complete yet!
	
    public static void merge(int arr1[], int arr2[], int n, int m) {
        //This solution exceeds time limit!!(Not efficient) 
        /*int p1 = 0;
        while(p1<arr1.length)
        {
            if(arr1[p1]<arr2[0])
                p1++;
            else{
                int tmp = arr1[p1];
                arr1[p1] =  arr2[0];
                arr2[0] = tmp;
                int i=0;
                while(i<arr2.length-1 && arr2[i]>arr2[i+1])
                {
                    int tmpo = arr2[i];
                    arr2[i] = arr2[i+1];
                    arr2[i+1] = tmpo;
                    i++;
                }
                System.out.println("arr1:" + Arrays.toString(arr1));
                System.out.println("arr2:" + Arrays.toString(arr2));
            }
            
            
        }
        
        */
    	
    }
	public static void main(String[] args) {
		int[] arr1 = {10, 12};
		int[] arr2 = {5, 18, 20};
		merge(arr1,arr2,arr1.length,arr2.length);

	}

}
