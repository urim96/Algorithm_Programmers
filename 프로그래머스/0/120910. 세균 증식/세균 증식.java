class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i = 1; i <= t ; i++){
            if(i >= 2){
                answer = answer*2;
            } else answer += i*n*2;
            
        }
        return answer;
    }
}
//처음 세균 n마리, 경과한 시간 t, t시간 후 세균의 수 answer
//한시간 지날때마다 2배로 증가