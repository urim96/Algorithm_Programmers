import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
         ArrayList<Integer> answer = new ArrayList<>();
        
          for(int i = 0; i < arr.length; i++){
	            if(answer.size() == 0){
	            	answer.add(arr[i]);
	            }else if(answer.size() > 0) {
	            	if(answer.get(answer.size()-1) == arr[i]) {
	            		answer.remove(answer.size()-1);
	            	}else {
	            		answer.add(arr[i]);
	            	}
	            }
	        }
	        if(answer.size() == 0){
	        	answer.add(-1);
	        }
        return answer;
    }
}