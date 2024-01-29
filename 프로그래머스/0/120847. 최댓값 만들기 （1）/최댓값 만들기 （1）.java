import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;  
        Arrays.sort(numbers);
        int max = numbers.length-1;
        
        return answer = numbers[max] * numbers[max-1] ;
    }
}