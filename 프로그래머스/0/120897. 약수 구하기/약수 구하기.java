import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        	
        if(n==1){
            answer.add(1);
        }else{
        answer.add(1);
			for(int i = 2; i < n; i++){
				for(int j = n-1; j > 0; j--){
					if(i * j == n) {
						answer.add(i);
						break;
					}	
				}
			} 
         answer.add(n);
         }  
      return answer;
    }
}