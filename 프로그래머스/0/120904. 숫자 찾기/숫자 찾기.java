class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String[] str1 = str.split("");
        for(int i = 0; i < str.length(); i++){
            if(str1[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }else {answer = -1;}
        }
        return answer;
    }
}