class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] a = String.valueOf(x).split("");
		int b = 0;
		    for(int i = 0; i < a.length; i++) {
			    b += Integer.valueOf(a[i]);
		    }
		    if(!(x%b == 0)) {
			    answer = false;
		    }
        return answer;
    }
}