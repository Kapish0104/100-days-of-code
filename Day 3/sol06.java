package allsolutions;


	//One approach will be to simply use a hash set and insert numbers in the hash set to remove duplicates.
	//Another approach is to search the element in the shorter length array.
	//One more is to sort and then remove duplicates. Though this does not seem optimal.
class sol06{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
         java.util.Set<Integer> union= new java.util.HashSet<Integer>();
        for(int i =0;i<n;i++)
        {
            union.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            union.add(b[i]);
        }
        
        return union.size();
    }
}