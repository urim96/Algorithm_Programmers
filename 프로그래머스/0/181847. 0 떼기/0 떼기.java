class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        char[] a = n_str.toCharArray();
		  for(int i = 0; i < a.length; i++){
			if(a[i] == '0'){
				continue;
			 }else{
				for (int j = i; j < a.length; j++) {
					answer += a[j];
				}break;
			  }
		   }
        return answer;
    }
}