import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
       	List<Integer> stk = new ArrayList<>();
	
		for (int i = 0; i < arr.length; i++) {
			if(i > arr.length) {
                break;
            }
			if (stk.size() == 0) {
				stk.add(arr[i]);
			} else if (stk.get(stk.size() - 1) < arr[i]) {
				stk.add(arr[i]);
			} else if (stk.get(stk.size() - 1) >= arr[i]) {
				stk.remove(stk.get(stk.size() - 1));
                i--;
			}
        
    }return stk;
}
}
