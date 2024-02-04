import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        int j = 0;
        for(int i = 0; i < 5; i++){
            answer[i] = num_list[j];
            j++;
        }
        return answer;
    }
}