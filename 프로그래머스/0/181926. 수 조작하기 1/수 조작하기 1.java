class Solution {
    public int solution(int n, String control) {
       
        char [] a = new char[control.length()];
        control.getChars(0, control.length(), a, 0);
        for(int i = 0; i < control.length(); i++){
            if(a[i] == 'w'){
                n += 1;
            } else if(a[i] == 's'){
                n -= 1;
            } else if(a[i] == 'd'){
                n += 10;
            } else if(a[i] == 'a'){
                n -= 10;
            }
        }
        return n;
    }
}