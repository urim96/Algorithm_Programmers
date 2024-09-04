import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
    
        Arrays.sort(indices);
		
		StringBuffer str = new StringBuffer();
		str.append(my_string);
		
		for(int i = 0; i < indices.length; i++) {
			str.deleteCharAt(indices[i] - i);
		}
		
		for(int i = 0; i < str.length(); i++) {
			answer += str.charAt(i);
		}
        return answer;
    }
}