import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(num_list[0]);
        
        for(int i = n; i < num_list.length; i=i+n){
            answer.add(num_list[i]);
        }
        return answer;
    }
}