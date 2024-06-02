class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p = 0;
		int y = 0;
		String[] aa = s.toUpperCase().split("");
			
		for(int i = 0; i < aa.length; i++) {
			if(aa[i].equals("P")) {
				p++;
			}else if(aa[i].equals("Y")) {
				y++;
			}
		}
			
        if(p == y) {
			answer = true; 
		 }else if (p== 0 && y == 0) {
			answer = true;
		 }else {
				answer = false;
		}

        return answer;
    }
}