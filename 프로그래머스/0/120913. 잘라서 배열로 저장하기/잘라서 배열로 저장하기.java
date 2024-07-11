class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n];
        
        for(int i = 0; i < answer.length; i++) {
		 	int a = i*n;
		 	int b = 0;
		 	  if(a + n >= my_str.length()) {
		 		   b = my_str.length();
		 		}else {
		 		   b = a+n;
		 		}
		 		   answer[i]= my_str.substring(a, b);
        }
        return answer;
    }
}