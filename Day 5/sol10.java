package allsolutions;

public class sol10 {

	public static int minJumps(int[] arr){
        	int max_reachable =0;
        	int steps =-1;
			for(int i =0;i<arr.length;i++)
        	{
				
				if(i>max_reachable)
				{
					return -1;
				}
				if(i == max_reachable)
				{
					steps++;
					System.out.println("At index " + i + " steps++ =" + steps );
				}
				if(max_reachable<i+arr[i])
				{
					max_reachable = i+arr[i];
				}
				
        	}
			return steps;
        }
	
	public static void main(String[] args) {
		int[] numbers = {1,3,5,8,9,2,6,7,6,8,9};
		System.out.println(minJumps(numbers));

	}
}
