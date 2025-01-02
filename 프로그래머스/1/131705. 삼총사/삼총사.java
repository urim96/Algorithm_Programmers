class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				for (int c = number.length - 1; c > j; c--) {
					if (number[i] + number[j] + number[c] == 0) {
						answer++;
					}
				}
			}
		}
        return answer;
    }
}