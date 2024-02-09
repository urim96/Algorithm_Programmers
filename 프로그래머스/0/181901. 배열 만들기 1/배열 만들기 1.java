class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int j = 1;
        for(int i = 0; i < answer.length; i++){
            if(k <= n){
                answer[i] = k*j;
                j++;
                
            }
        }
        return answer;
    }
}