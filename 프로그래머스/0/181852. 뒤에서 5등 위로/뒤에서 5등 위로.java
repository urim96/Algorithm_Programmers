import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        Arrays.sort(num_list);
		
		for (int i = 0; i < num_list.length; i++) {
			answer.add(num_list[i]);
		} 
	       for(int i = 4; i >= 0; i-- ) {
	    	   answer.remove(i);
	       }
        
        return answer;
    }
}