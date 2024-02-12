import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int j = 0;
        for(int i = my_string.length()-1; i >= 0 ; i--){
            answer[j] = my_string.substring(i,  my_string.length());
            j++;  
        } Arrays.sort(answer);
        return answer;
    }
}