package allsolutions;

public class LeetCodeSolution58 {

    public int lengthOfLastWord(String s) {
        if(s.length() == 1)
            return 1;
        s = s.trim();
        char ch[] = s.toCharArray();
        int count = 0;
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i] ==' ')
                break;
            count++;
        }
        
        return count;
    }
}
