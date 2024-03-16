class Solution {
    public String solution(String letter) {
        String answer = "";
       	String[] aa = new String[26];
		String[] mo = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		for(int i = 0; i< 26; i++){
			aa[i] = String.valueOf((char)('a'+i));
		}
		  String[] let = letter.split(" ");
		   for(int i = 0; i < let.length; i++){
			 for(int j = 0; j< mo.length; j++){
				if(let[i].equals(mo[j])){
					answer += aa[j];
				}
			 }
		   } 
        return answer;
    }
}