package allsolutions;

public class sol01 {
	
	public static String reverseWord(String str)
    {
        char[] revstr = str.toCharArray();
        
        int endptr = revstr.length-1;
        for(int i=0;i<revstr.length/2;i++,endptr--)
        {
        	char tmp;
        	tmp = revstr[i];
        	revstr[i] =  revstr[endptr];
        	revstr[endptr] = tmp;
        }
        
        str = String.valueOf(revstr);
        return str;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
