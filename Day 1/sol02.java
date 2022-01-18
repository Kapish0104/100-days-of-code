package allsolutions;

public class sol02 {
	
	public static void printMinMax(int[] numbers) {
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(min>numbers[i])
				min = numbers[i];
			if(max<numbers[i])
				max=numbers[i];
		}
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

	public static void main(String[] args) {
		
		int[] numbers = {5,7,2,99,-4,7,101,6,2};
		
		printMinMax(numbers);

	}

}
