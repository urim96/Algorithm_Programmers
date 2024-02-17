import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i]==true){
                for(int j = 0; j < arr[i]*2; j++)
                { answer.add(arr[i]);}
            } else {answer = answer.subList(0, answer.size()-arr[i]);}
        }
        return answer;
    }
}