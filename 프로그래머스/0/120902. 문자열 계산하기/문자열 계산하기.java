class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] str = my_string.split(" ");
	
		if(str[1].equals("+")) {
			answer = Integer.valueOf(str[0]) + Integer.valueOf(str[2]);
		}else {
			answer = Integer.valueOf(str[0]) - Integer.valueOf(str[2]);
		}
		
		for(int i = 3; i < str.length; i++) {
			if(i%2==1) {
				if(str[i].equals("+")) {
					answer += Integer.valueOf(str[i+1]);
				}else {
					answer -= Integer.valueOf(str[i+1]);
				}
			}
		}
        return answer;
    }
}