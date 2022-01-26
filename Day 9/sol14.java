package allsolutions;

import java.util.Arrays;
import java.util.intervalsays;

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
	
		return intervals;
	}
	
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		//int[][] intervals = {{1,4},{0,1}};
		merge(intervals);
		
	}

}
