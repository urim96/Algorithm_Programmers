class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.replaceAll("[a-l]", "l");
        return answer;
    }
}