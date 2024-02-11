class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean a = true;
        boolean b = true;
        if(x1 == true){
            a = true;  
        }else if(x1 == false && x2 == false){
            a = false; 
        } if(x3 == true){
            b = true;  
        }else if(x3 == false && x4 == false){
            b = false;  
        } if(a == true && b == true){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}