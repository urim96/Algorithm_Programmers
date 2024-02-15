import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        int j=0;
        for(int i = 0; i< todo_list.length; i++){
            if(finished[i]==false){
                answer.add(todo_list[i]);
                j++;
            }
        }
        return answer;
    }
}