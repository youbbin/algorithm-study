import java.util.*;

class Solution {        
    boolean solution(String s) {
        boolean answer = true;
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                queue.add(s.charAt(i));
            }
            else{
                if(!queue.isEmpty()){
                    queue.poll();
                }
                else{
                    return false;
                }
            }
        }
        if(!queue.isEmpty()){
            return false;
        }
        else return true;

    }
}