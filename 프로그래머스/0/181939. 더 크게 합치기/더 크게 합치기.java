class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        String aaa = aa.concat(bb);
        String bbb = bb.concat(aa);
        int aaaa = Integer.parseInt(aaa);
        int bbbb = Integer.parseInt(bbb);
        if(aaaa >= bbbb){
            answer = aaaa;
        } else {answer = bbbb;}
        return answer;
    }
}