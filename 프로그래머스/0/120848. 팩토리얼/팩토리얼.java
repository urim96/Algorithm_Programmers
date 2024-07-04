class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        
          for(int i = 1; i <= n; i++){
            a *= i;
            answer++;
            if(a > n){
                answer--;
                break;
            }
        }
        
        return answer;
    }
}