class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int a = 1+2+3+4+5+6+7+8+9;
			
		for(int i = 0; i < numbers.length; i++) {
			a = a-numbers[i];
		}
        answer = a;
        return answer;
    }
}