import java.util.*;
class Solution {
    public String solution(String cipher, int code) {
        List<String> answer = new ArrayList<>();
        String[] a = cipher.split("");
        String b = "";
        
        for(int i = code-1; i < cipher.length(); i++){
            answer.add(a[i]);
            i = i+code-1;
        }
        for(int i = 0 ; i < answer.size(); i++){
            b += answer.get(i);
        }
        return b;
    }
}