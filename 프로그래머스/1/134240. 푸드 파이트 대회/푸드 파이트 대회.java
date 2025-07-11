class Solution {
    public String solution(int[] food) {
        String answer = "";
        
         for (int i = 1; i < food.length; i++) {
		  int str = food[i] / 2;
			for (int j = 0; j < str; j++) {
				answer += i;
			}
		}
		String reverse = new StringBuilder(answer).reverse().toString();
		answer = answer + "0" + reverse;
  
        return answer;
    }
}