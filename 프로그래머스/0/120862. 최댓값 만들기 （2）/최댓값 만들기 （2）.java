class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        	
		if(numbers.length == 2) {
			answer = numbers[0] * numbers[1];
		}else {
			for(int i = 0; i < numbers.length; i++){
				for(int j = numbers.length-1; j >= 0; j--) {
					int max = numbers[i]* numbers[j];
					if(answer < max && i != j) {
						answer = max;
					}
				}		
			}
		}
        return answer;
    }
}