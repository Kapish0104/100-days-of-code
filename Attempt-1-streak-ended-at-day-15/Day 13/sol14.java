package allsolutions;


import java.util.*;

public class sol14 {
	
	//BADDD SOLUTION. DOSEN't WORK
	/*
	public static int[][] merge(int[][] intervals) {
		
		int count = 0;
		for(int i =0;i<intervals.length-1;i++)
		{
			
			/*if(intervals[i][1] - intervals[i+1][0] >=0)
			{
				
				intervals[i+1][0] = intervals[i][0]<intervals[i+1][0]?intervals[i][0]:intervals[i+1][0];
				intervals[i+1][1] = intervals[i][1]>intervals[i+1][1]?intervals[i][1]:intervals[i+1][1];
				count++;
			}
			
			//case1
			if((intervals[i][0]<intervals[i+1][0] && intervals[i][1]>intervals[i+1][1]) || (intervals[i+1][0]<intervals[i][0] && intervals[i+1][1]>intervals[i][1]) )
			{

				intervals[i+1][0] = intervals[i][0]<intervals[i+1][0]?intervals[i][0]:intervals[i+1][0];
				intervals[i+1][1] = intervals[i][1]>intervals[i+1][1]?intervals[i][1]:intervals[i+1][1];
				count++;
			}
			else
				if((intervals[i][0]<=intervals[i+1][0] && intervals[i][1] <=intervals[i+1][1] && intervals[i][1] >= intervals[i+1][0]) || (intervals[i+1][0]<=intervals[i][0] && intervals[i+1][1] <intervals[i][1] &&intervals[i+1][1] >= intervals[i][0]))
				{
					intervals[i+1][0] = intervals[i][0]<intervals[i+1][0]?intervals[i][0]:intervals[i+1][0];
					intervals[i+1][1] = intervals[i][1]>intervals[i+1][1]?intervals[i][1]:intervals[i+1][1];
					count++;
				}
				else
					if(intervals[i][1] == intervals[i+1][0])
					{
						intervals[i+1][0] = intervals[i][0]<intervals[i+1][0]?intervals[i][0]:intervals[i+1][0];
						intervals[i+1][1] = intervals[i][1]>intervals[i+1][1]?intervals[i][1]:intervals[i+1][1];
						count++;
					}
					else
						if(intervals[i][1] == intervals[i+1][1] && intervals[i+1][0] == intervals[i][0])
						{
							intervals[i+1][0] = intervals[i][0]<intervals[i+1][0]?intervals[i][0]:intervals[i+1][0];
							intervals[i+1][1] = intervals[i][1]>intervals[i+1][1]?intervals[i][1]:intervals[i+1][1];
							count++;
						}
			//System.out.println("Iteration " +i);
			// for(int j[]:intervals) { System.out.println(intervalsays.toString(j)); }
		}
		intervals = Arrays.copyOfRange(intervals, count, intervals.length);
		//System.out.println("final");
		// for(int j[]:intervals) { System.out.println(intervalsays.toString(j)); 
		
		 
		
		return intervals;
		
		
    }
   */ 
	
	
	public static int[][] merge(int[][] intervals) {
		
		int count =0;
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		List<int[]> al = new ArrayList<int[]>();
        for(int i =0;i<intervals.length;i++)
        {
            for(int j[]:al) {
            	System.out.print(Arrays.toString(j) + " ");
            }
            System.out.println("");
            if(i!=intervals.length-1 && (intervals[i][1] >= intervals[i+1][0]))
            {
                intervals[i+1][0] = intervals[i][0];
                intervals[i+1][1] = intervals[i][1]>intervals[i+1][1]?intervals[i][1]:intervals[i+1][1];
                if( !(al.isEmpty()) && (al.get(al.size()-1)[0] != intervals[i+1][0]) && (al.get(al.size()-1)[1] != intervals[i+1][1]))
                	al.add(intervals[i+1]);
            }
            else {
            al.add(intervals[i]);
            }

        }
        System.out.println(count);
       // al = al.subList(count, al.size());
        for(int j[]:al) {
        	System.out.print(Arrays.toString(j) + " ");
        }
        System.out.println("");
       // intervals = Arrays.copyOfRange(intervals, count, intervals.length);

		
		return intervals;
	}
	
	public static void main(String[] args) {
		//int[][] intervals = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
		int[][] intervals = {{1,33},{4,12}, {45,555},{35,48}};
		merge(intervals);
		
	}

}
