package allsolutions;

public class sol10 {

	public static int minJumps(int[] arr){
        int max_reachable =arr[0];
        int current_reach=arr[0];
    	int steps =0;
		for(int i =1;i<arr.length;i++)
    	{
			if(i>max_reachable)
			{
				return -1;
			}
			if(i==arr.length-1)
				{
					steps++;
					break;
				}
			
			if(max_reachable<i+arr[i])
			{
				max_reachable = i+arr[i];
			}
			if(i == current_reach)
			{
				steps++;
				current_reach = max_reachable;
			}

			
			System.out.println("i="+i+"   max_reachable="+max_reachable+"   current_reach="+current_reach+"   steps="+steps);
			
    	}

		return steps;
        }
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(numbers));

	}
}
