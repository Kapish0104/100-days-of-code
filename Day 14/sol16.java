package allsolutions;

public class sol16 {
	
	static long inversionCount(long arr[], long N)
    {
        long count = 0;
        for(int i =0;i<N-1;i++)
        {
            for(int j =i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
        }
        
        return count;
    }
	  public static void main(String[] args) {
			long arr[] = {1,3,2};
			long N = arr.length;
			inversionCount(arr, N);
		}
}
