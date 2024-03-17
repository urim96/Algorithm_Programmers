class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int e = 0;

		if(m > 1){
			char[][] aa = new char[my_string.length()/m][m];
			 for(int i = 0; i < aa.length; i++){
				for(int j = 0; j < m; j++) {
					aa[i][j] = my_string.charAt(e);
					e++;
				}
			}
			 for(int i = 0; i < aa.length; i++){
				answer += aa[i][c-1];
			 }
		}else {
			answer = my_string;
		}
        return answer;
    }
}