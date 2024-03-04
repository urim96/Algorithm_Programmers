import java.util.*;
class Solution {
    public  List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
    
        for(int i = 0; i < arr.length; i++){
            answer.add(arr[i]);
        }
        
        for(int i = 0; i < delete_list.length; i++){
            for(int j = 0; j < answer.size(); j++){
                 if(delete_list[i] == answer.get(j)){
                        answer.remove(j);
            }   
            }
        }
        return answer;
    }
}