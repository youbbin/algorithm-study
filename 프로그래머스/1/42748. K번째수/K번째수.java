import java.util.*;
class Solution {
     public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            int[] arr = new int[j - i + 1];
            int n = 0;
            
            for(int b = i - 1; b < j; b++){
                arr[n] = array[b];
                n++;
            }
            Arrays.sort(arr);
            answer[a] = arr[k-1];
        }
        return answer;
    }
}