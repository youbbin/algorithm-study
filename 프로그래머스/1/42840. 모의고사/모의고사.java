import java.util.*;

class Solution {
    public ArrayList solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[][] student = {{1, 2, 3, 4, 5}
                          ,{2, 1, 2, 3, 2, 4, 2, 5}
                          ,{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[][] studentAnswer = new int[3][answers.length];
        int[] correct = {0, 0, 0};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < answers.length; j++){
                studentAnswer[i][j] = student[i][j % student[i].length];
                if(studentAnswer[i][j] == answers[j]){
                    correct[i]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < correct.length; i++) {
			max = Math.max(max, correct[i]);
		}
        
        for(int i = 0; i < correct.length; i++){
            if(correct[i] == max) answer.add(i+1);
        }
        
        return answer;
    }
}