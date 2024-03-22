import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int sco : scoville){
            queue.add(sco);
        }
        while(queue.size() >= 2 && queue.peek() < K){
            int mix = queue.poll() + (queue.poll() * 2);
            queue.add(mix);
            answer++;
        }
        if(queue.peek() < K) answer = -1;
        return answer;
    }
}