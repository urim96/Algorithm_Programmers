import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
       	
		String a = my_string.toLowerCase();
		String[] aa = a.split("");
		Arrays.sort(aa);
		for(int i = 0; i < aa.length; i++){
            answer += aa[i];
        }
        return answer;
    }
}