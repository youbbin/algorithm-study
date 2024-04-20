class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb_tmp = new StringBuilder();
        String[] strings = s.split(" ");
        for(String string : strings){
            if(string.length() == 0){ // 연속 공백 있을 경우 공백 문자열 발생
                sb_tmp.append(" ");
            }
            else{
                StringBuilder sb = new StringBuilder(string);
                char c = sb.charAt(0);
                if(!Character.isDigit(c)){ // 첫 글자 숫자가 아니면 대문자로 바꾸기
                    sb.setCharAt(0, Character.toUpperCase(c));
                }
                for(int i = 1; i < sb.length(); i++){ // 나머지 소문자로 바꾸기
                    sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
                }
                sb_tmp.append(sb+" ");
            }

        }
        System.out.println(answer);
        answer = sb_tmp.toString();
        if(s.charAt(s.length()-1) == ' '){
            return answer;
        }
        return answer.substring(0, answer.length()-1);
    }
}