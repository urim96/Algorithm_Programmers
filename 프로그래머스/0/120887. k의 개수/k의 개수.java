class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kk = Integer.toString(k);
        
        for(int a = i; a <= j; a++){
            String b = Integer.toString(a);
            String[] bb = b.split("");
            for(int e = 0; e < bb.length; e++){
                if(bb[e].contains(kk)){
                 answer++;     
                } 
            } 
        }
        return answer;
    }
}