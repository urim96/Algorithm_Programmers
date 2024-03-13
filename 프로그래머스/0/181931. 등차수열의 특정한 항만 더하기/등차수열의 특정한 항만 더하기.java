class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
		int aa = a;
		int[] ab = new int[included.length];
			
		for(int i = 0; i < included.length; i++) {
			ab[i] = aa;
			aa = aa+d;
		}
		for(int i = 0; i < included.length; i++) {
			if(included[i]==true) {
				answer += ab[i];
			}
		}
 
        return answer;
    }
}