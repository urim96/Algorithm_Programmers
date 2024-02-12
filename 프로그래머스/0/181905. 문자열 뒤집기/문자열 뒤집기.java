class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int i = 0;
        String[] a = my_string.split("");
        while(i < a.length){
            if(i == s){
                for(int j = e; j >= s; j--){
                answer += a[j];
                }
            } else if(i < s || i > e){
                answer += a[i];
            } i++;
        }
        return answer;
    }
}