class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] a = my_string.toCharArray();
        char[] b = is_prefix.toCharArray();
        if(a.length >= b.length){
        for(int i = 0; i < b.length; i++){
            if(a[i] == b[i]){
                answer = 1;
            } else {answer = 0;
                   return answer;}
        }
        } else {answer = 0; }
        return answer;
    }
}