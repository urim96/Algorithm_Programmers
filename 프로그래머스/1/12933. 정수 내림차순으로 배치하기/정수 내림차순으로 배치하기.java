import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String an = "";
        
	    String a = String.valueOf(n);
		String[] ab = a.split("");
		Arrays.sort(ab, Comparator.reverseOrder());
			
			for(int i = 0; i< ab.length; i++) {
				an += ab[i];
			}
			
			answer = Long.valueOf(an);
        
        return answer;
    }
}