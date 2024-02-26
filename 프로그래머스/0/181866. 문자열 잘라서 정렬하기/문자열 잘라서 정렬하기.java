import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll(" ", "").split("x");
     
		List<String> a = new ArrayList<>();
        
		Arrays.sort(answer);
        
		for(int i = 0; i < answer.length; i++) {
            if(!(answer[i].isEmpty())){
                a.add(answer[i]);
            }
		}
        return a.stream().toArray(String[]::new);
    }
}