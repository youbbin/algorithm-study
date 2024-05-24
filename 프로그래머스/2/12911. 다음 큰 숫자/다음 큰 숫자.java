class Solution {
    public int solution(int n) {
        int answer = 0;
        String n_binary = Integer.toBinaryString(n); // 이진수로 변환
        int cnt_n = count1(n_binary);
        int i = n + 1;
        while(true){
            String i_binary = Integer.toBinaryString(i);
            int cnt_i = count1(i_binary);
            if(cnt_n == cnt_i) {
                break;
            } else i++;
        }
        answer = i;
        return answer;
    }

    public static int count1(String str) {
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}
