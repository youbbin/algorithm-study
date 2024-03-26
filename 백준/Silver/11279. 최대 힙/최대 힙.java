import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 높은 숫자가 우선순위인 우선순위 큐
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(!priorityQueue.isEmpty()){
                    System.out.println(priorityQueue.poll());
                } else{
                    System.out.println(0);
                }
            } else{
                priorityQueue.add(x);
            }
        }
    }
}
