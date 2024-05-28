class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        
        for(int i = 1; i < count+1; i++){
            total += (price*i);
        }
        if(money-total > 0){
            answer = 0;
        }else {
            answer = -(money-total);
        }
        return answer;
    }
}