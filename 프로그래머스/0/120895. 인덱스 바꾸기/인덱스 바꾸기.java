class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
       	char[] my = my_string.toCharArray();
		char a = my[num1];
		my[num1] = my[num2];
		my[num2] = a;
			
		for(int i = 0; i < my.length; i++) {
			answer += my[i];
		}	
        return answer;
    }
}