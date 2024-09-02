class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
			int a = 0;
			    for(int j = 1; j <= i; j++) {
				    for(int q = 1; q <= i ; q++) {
					    a += (j*q == i) ? 1 : 0;
				    } 
			     }
			if(a%2 == 0) {
				answer += i;
			}else if(a%2 == 1) {
				answer -= i;
			}
		}
        return answer;
    }
}