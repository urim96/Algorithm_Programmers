class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean a;
        if(ineq.equals("<")){
            if(eq.equals("=")){
                a = n <= m;
                if(a == true){
                    answer = 1;
                }else {answer = 0;}
            }else if(eq.equals("!")){
                a = n < m;
                if(a == true){
                    answer = 1;
                }else {answer = 0;}
            }
        }else if(ineq.equals(">")){
             if(eq.equals("=")){
                a = n >= m;
                if(a == true){
                    answer = 1;
                }else {answer = 0;}
            }else if(eq.equals("!")){
                a = n > m;
                if(a == true){
                    answer = 1;
                }else {answer = 0;}
            }
        }
        return answer;
    }
}