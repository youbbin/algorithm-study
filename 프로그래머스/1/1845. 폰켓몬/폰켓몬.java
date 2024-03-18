import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
       int answer = 0;
        int n = nums.length;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < n; i++){
                hashmap.put(nums[i], 1);
        }

        int type_num = hashmap.size();
        if(type_num <= n/2){
            answer = type_num;
        }
        else{
            answer = n/2;
        }
        return answer;
    }
}