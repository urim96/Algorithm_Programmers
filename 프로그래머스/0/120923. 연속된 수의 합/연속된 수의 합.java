class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int median = total/num - (int)num/2;
		int cnt = (int)num/2;
		
		if(total % num == 0) {
			for(int i = 0; i < num; i++) {
				answer[i] = median;
				median++;
			}
		}else {
			for(int i = 0; i < num; i++) {
				answer[i] = median+1;
				median++;
			}
		}
        return answer;
    }
}