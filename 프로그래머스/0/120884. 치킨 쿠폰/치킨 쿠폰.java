class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while (chicken >= 10) {
			int coupon = chicken % 10;
			answer += chicken / 10;
			chicken = coupon + chicken / 10;
		}
        return answer;
    }
}