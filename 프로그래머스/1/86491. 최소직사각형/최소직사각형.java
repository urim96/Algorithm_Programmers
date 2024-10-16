class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
		int min = Math.min(sizes[0][0], sizes[0][1]);
        
        for(int i = 0; i < sizes.length; i++) {
			for(int j = 0; j < sizes[i].length; j++) {
				if(max < sizes[i][j]) {
					max = sizes[i][j];
				}
			}
			if(min < Math.min(sizes[i][0], sizes[i][1]) && max > min) {
				min = Math.min(sizes[i][0], sizes[i][1]);
			}
		}
		answer = max * min;
        return answer;
    }
}