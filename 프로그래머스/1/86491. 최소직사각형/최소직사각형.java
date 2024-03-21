class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWeight = 0;
        int maxHeight = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(maxWeight < sizes[i][0])
                    maxWeight = sizes[i][0];
            if(maxHeight < sizes[i][1])
                    maxHeight = sizes[i][1];
        }
        
        answer = maxWeight * maxHeight;
        return answer;
    }
}