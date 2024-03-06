class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        int[][] answer = new int[num_list.length/n][n];
		int i = 0;
		 
		for(int j = 0; j < answer.length; j++){
			if(i < num_list.length){
				for(int p = 0; p < n; p++){
					answer[j][p] = num_list[i];
					i++;
	    		}
			}
	    }
        return answer;
    }
}