import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        	int[] aaa = Stream.of(String.valueOf(n).split(""))
					.mapToInt(Integer::parseInt)
					.toArray();
			
			for(int i = 0; i < aaa.length; i++) {
				answer += aaa[i];
			}

        return answer;
    }
}