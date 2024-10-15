class Solution {
    public int solution(int[] sides) {
        int answer = 0;
		
		int cnt = sides[0] - sides[1];
		int sum = sides[0] + sides[1];
		int max = sides[0];
		
	    if(cnt < 0){
			max = sides[1];
			cnt = -cnt;
		}
		for(int i = cnt + 1; i <= max; i++) {
			answer++;
		}
		
		for(int i = max + 1; i < sum; i++) {
			answer++;
		}
        return answer;
    }
}