class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
      	int j = pat.length();
        
		for(int i = 0; i < myString.length()-pat.length()+1; i++) {	
			if(myString.substring(i, j).contains(pat)) {
				answer++;
			}
				j++;
		}
        return answer;
    }
}