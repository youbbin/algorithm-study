import java.util.*;
class Solution {
    // 코드 1
//      public int solution(int[] citations) {
//         int[] hIdxArr = new int[citations.length];
//         for(int i = 0; i < citations.length; i++){
//             int h = 0;
//             for(int j = 0; j < citations.length; j++){
//                 if(citations[i] <= citations[j]){
//                     h++;
//                 }
//                 if(h > citations[i]){
//                     h = 0;
//                 }
//             }
//             hIdxArr[i] = h;
//         }

//         Arrays.sort(hIdxArr);
//         return hIdxArr[(citations.length)-1];

//     }
    
    // 코드 2
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++){
            int h = citations.length - i;
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}