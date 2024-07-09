import java.util.*;
class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        
        String str = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ");
		String[] strArr = str.replaceAll("   "," ").replaceAll("  "," ").split(" ");
		
		for(int i = 0; i < strArr.length; i++) {
			if(!(strArr[i].equals(""))){
				answer.add(strArr[i]);
			}
		}
		if(answer.size()==0) {
			answer.add("EMPTY");
		}
        return answer;
    }
}