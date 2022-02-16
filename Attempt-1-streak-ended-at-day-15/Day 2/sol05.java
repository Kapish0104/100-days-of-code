package allsolutions;

import java.util.Arrays;

public class sol05 {
	
	public static void rearrangenp(int n[]) {
		int p1 = 0, p2 = 0;
		while(p2<n.length && p1<n.length)
		{
			if(n[p1]<0)
				p1++;
			else if(p2<p1 || n[p2]>=0)
				p2++;
			else if(n[p1] >=0 && n[p2]<0)
			{
				int tmp =n[p1];
				n[p1] = n[p2];
				n[p2] = tmp;
			}
			
		}
		
		System.out.println(Arrays.toString(n));
		

	}

	public static void main(String[] args) {
		int[] numbers = {-12,11,-13,-5,6,-7,5,-3,-6};
    	rearrangenp(numbers);

	}

}
