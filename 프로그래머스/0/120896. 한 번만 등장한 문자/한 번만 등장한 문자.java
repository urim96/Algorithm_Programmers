import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
		String[] str = s.split("");
		Arrays.sort(str);
		int num = 0;
		
		for(int i = 0; i < str.length; i++) {
			num = 0;
			for(int j = 0; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					num++;
				}
			}
			if(num == 1) {
				answer += str[i];
			}
		}
        return answer;
    }
}