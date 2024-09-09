import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll(" ", "").split("x");
     
		List<String> arr = new ArrayList<>();
        
		Arrays.sort(answer);
        
		for(int i = 0; i < answer.length; i++) {
            if(!(answer[i].isEmpty())){
                arr.add(answer[i]);
            }
		}
        answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}