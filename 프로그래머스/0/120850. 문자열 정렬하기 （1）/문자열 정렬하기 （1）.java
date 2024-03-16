import java.util.*;
class Solution {
    public int[] solution(String my_string) {
		my_string = my_string.replaceAll("[a-z]", "");
		String[] a = my_string.split("");
		int[] answer = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			answer[i] = Integer.parseInt(a[i]);
		}
		  Arrays.sort(answer);
	     return answer; 
    }   
}