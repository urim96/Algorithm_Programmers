import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        
    	String[] a = String.valueOf(n).split("");
		int[] answer = new int[a.length];
        int j = 0;
        
        for(int i = a.length-1; i>=0; i--){
        	answer[j] = Integer.parseInt(a[i]);
        	j++;
        }
        return answer;
    }
}