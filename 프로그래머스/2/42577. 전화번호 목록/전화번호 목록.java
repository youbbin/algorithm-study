import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for(String phone : phone_book){
            map.put(phone, 1);
        }
        for(String key: map.keySet()){
            for(int i = 0; i < key.length(); i++){
                if(map.containsKey(key.substring(0,i))){
                    return false;
                }
            }
        }
        answer = true;
        return answer;
    }
}