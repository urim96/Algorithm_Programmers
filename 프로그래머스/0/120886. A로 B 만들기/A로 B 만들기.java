import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] be = before.toCharArray();
		char[] af = after.toCharArray();
		
		Arrays.sort(be);
		Arrays.sort(af);
		for(int i = 0; i < be.length; i++){
			if(be[i]==af[i]) {
				answer = 1;
			}else {answer = 0; break;}
		}
        return answer;
    }
}