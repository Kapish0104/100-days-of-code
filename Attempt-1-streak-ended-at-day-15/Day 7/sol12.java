package allsolutions;

public class sol12 {
	//implementation is not complete yet!
	
    public void merge(int arr1[], int arr2[], int n, int m) {
        
        int p1 = 0;
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
                }
            }
            
            
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
