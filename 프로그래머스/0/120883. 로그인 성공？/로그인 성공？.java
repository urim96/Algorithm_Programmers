class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])==true&&id_pw[1].equals(db[i][1])==true){
                answer = "login";
            }else if(id_pw[0].equals(db[i][0])==true&&id_pw[1].equals(db[i][1])==false){
                answer = "wrong pw";
            }else if(id_pw[0].equals(db[i][0])==false&&id_pw[1].equals(db[i][1])==false) {answer = "fail";}
        }
         return answer;
    }
}