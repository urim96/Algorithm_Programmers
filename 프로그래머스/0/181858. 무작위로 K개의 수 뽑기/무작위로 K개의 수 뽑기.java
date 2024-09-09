import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
		Set<Integer> set = new LinkedHashSet<Integer>();
        
		for(int i : arr) {
				set.add(i);
		}
		Integer[] integer = set.toArray(new Integer[0]);
			
		for(int i = 0; i < k; i++) {
			if(integer.length <= i) {
				answer[i] = -1;
			}else {
				answer[i] = integer[i];
			}
		}
        return answer;
    }
}