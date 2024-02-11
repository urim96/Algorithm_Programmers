class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int j = 0;
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] == numLog[j]+1){
                answer += "w";
                j++;
            }else if(numLog[i] == numLog[j]-1){
                answer += "s";
                j++;
            } else if(numLog[i] == numLog[j]+10){
                answer += "d";
                j++;
            }else if(numLog[i] == numLog[j]-10){
                answer += "a";
                j++;
            }
        }
        return answer;
    }
}