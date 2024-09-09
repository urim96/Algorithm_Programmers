class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
    	int max = 0;
			
		for(int i = 0; i <= 30; i++) {
			for(int j = 0; j < strArr.length; j++) {
				if(strArr[j].length() == i) {
					max++;
				}
			} 
				if(max > answer) {
					answer = max;
				}
                max = 0;
		}
        return answer;
    }
}