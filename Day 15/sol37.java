package allsolutions;

import java.util.ArrayList;

public class sol37 {
	    //Function to return a list of integers denoting spiral traversal of matrix.
	   public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
	    {
		   int maxr = r-1;
		   int maxc = c-1;
		   int rp=0;
		   int cp=0;
		   ArrayList<Integer> list = new ArrayList<Integer>();
		   while(maxr>0 && maxc>0)
		   {
			   //System.out.println("1. reading upto maxc=" + maxc);
			   
			   for(int i=0;i<=maxc;i++)
			   {
				   list.add(matrix[rp][cp]);
				   cp++;
			   }
			   //System.out.println(list.toString());
			   cp--;
			   rp++;
			   maxr--;
			   //System.out.println("2. reading upto maxr=" + maxr);
			   for(int i =0;i<=maxr;i++)
			   {
				   list.add(matrix[rp][cp]);
				   rp++;
			   }
			   //System.out.println(list.toString());
			   maxc--;
			   rp--;
			   cp--;
			   
			   //System.out.println("3. reading upto minc=" + maxc);
			   for(int i =0;i<=maxc;i++)
			   {
				   list.add(matrix[rp][cp]);
				   cp--;
			   }
			   //System.out.println(list.toString());
			   maxr--;
			   cp++;
			   rp--;
			   //System.out.println("4. reading upto minr=" + maxr);
			   for(int i =0;i<=maxr;i++)
			   {
				   list.add(matrix[rp][cp]);
				   rp--;
			   }
			   maxc--;
			   rp++;
			   cp++;
			   
			  // System.out.println(list.toString());
		   }
		   return list;
	    }
	
	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
		spirallyTraverse(arr, 4, 4);
		
	}
	

}
