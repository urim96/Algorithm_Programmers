import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
		int min = -1;
		int max = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				if(min == -1) {
					min = i;
				}
				max = i;
			}
		}
		if(!(min == -1 && max == -1)) {
			answer = Arrays.copyOfRange(arr, min, max+1);
		}
        return answer;
    }
}