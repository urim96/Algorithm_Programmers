import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
       	ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			answer.add(arr[i]); 
		}
		int a = arr[0];
		int b = 0;
		if(arr.length == 1) {
			answer.add(-1);
		}else {
			for(int i = 1; i < arr.length; i++) {
				if(a > arr[i]) {
					a = arr[i];
					b = i;
				}
			}
        }
		answer.remove(b);
        return answer;
    }
}