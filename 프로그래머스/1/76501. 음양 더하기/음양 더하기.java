class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == false){
                answer = answer + (-absolutes[i]);
            }else {
                answer += absolutes[i];
            }  
        }
        return answer;
    }
}