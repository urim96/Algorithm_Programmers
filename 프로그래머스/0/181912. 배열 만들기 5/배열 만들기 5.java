import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++) {
			String a = intStrs[i].substring(s, s+l);
			if(Integer.parseInt(a) > k){
				answer.add(Integer.parseInt(a));
			}
		}
        
        return answer;
    }
}