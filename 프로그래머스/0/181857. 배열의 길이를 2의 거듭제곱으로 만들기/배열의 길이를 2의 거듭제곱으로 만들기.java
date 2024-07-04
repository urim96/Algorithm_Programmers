import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int a = 1;
        
        while(a < arr.length){
            a *= 2;
        }
        answer =  Arrays.copyOf(arr, a);
        return answer;
    }
}