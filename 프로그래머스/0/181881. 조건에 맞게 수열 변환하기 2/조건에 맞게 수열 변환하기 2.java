import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = arr.clone();
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr2[i] = arr[i] / 2;	
			} else if (arr[i] < 50 && arr[i] % 2 == 1) {
				arr2[i] = arr[i] * 2 + 1;
			  }
		}
		while(!(Arrays.equals(arr,arr2))){
				arr= arr2.clone();
			for (int i = 0; i < arr2.length; i++){
				if(arr[i] >= 50 && arr[i] % 2 == 0) {
					arr2[i] = arr2[i] / 2;
				} else if(arr[i] < 50 && arr[i] % 2 == 1){
					arr2[i] = arr2[i] * 2 + 1;
				}
			}answer++;
		}
            return answer;
    }
}