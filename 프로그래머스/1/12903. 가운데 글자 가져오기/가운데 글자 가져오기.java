class Solution {
    public String solution(String s) {
        String answer = "";
        int i = s.length()/2;
        if(s.length()%2 == 1){
            char a = s.charAt(i);
            answer = String.valueOf(a);
        }else {
            answer = s.substring(i-1, i+1);
        }
        return answer;
    }
}