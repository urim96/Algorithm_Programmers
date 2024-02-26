class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String s = "";
		
		 for(int i= 0; i < my_string.length(); i++){
	            if(Character.isLowerCase(my_string.charAt(i))){
	                s += my_string.charAt(i);
	                s = s.toUpperCase();
	                answer += s;
	                s = "";
	            } else {
	                s += my_string.charAt(i);
	                s = s.toLowerCase();
	                answer += s;
	                s = "";
	            }
	}
        return answer;
    }
}