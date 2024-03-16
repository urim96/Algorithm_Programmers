class Solution {
    public int[] solution(String myString) {
    
  		String[] xx = myString.split("x");

		if (myString.lastIndexOf("x") == myString.length() - 1) {
			System.out.println(myString.lastIndexOf("x"));
			int[] answer = new int[xx.length + 1];
			answer[answer.length - 1] = 0;
			  for (int i = 0; i < xx.length; i++) {
				answer[i] = xx[i].length();
			} return answer;
		} else {
			int[] answer = new int[xx.length];
			  for (int i = 0; i < xx.length; i++) {
				answer[i] = xx[i].length();
			}return answer;
		}
    }
}