class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int mmm = 0;
        for(int i=1; i < 3; i++){
            if(max < sides[i]){
                max = sides[i];
                mmm = sides[0]+sides[1]+sides[2] - max;
            } else{
                max = max;
                mmm = sides[0]+sides[1]+sides[2] - max;
            }
        }   
        if(max < mmm){
            answer = 1;
        } else answer = 2;
        return answer;
    }
}