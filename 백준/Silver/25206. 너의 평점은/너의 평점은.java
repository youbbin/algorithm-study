import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        final int N = 20;
        double score = 0; // 과목평점
        double credit = 0; // 학점
        double credit_sum = 0; // 학점의 총합
        double score_sum = 0; // 전공과목별 (학점 × 과목평점)의 합
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            credit_sum += credit;
            switch (st.nextToken()) {
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score = 1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "F":
                    score = 0.0;
                    break;
                case "P":
                    credit_sum -= credit;
                    continue;
            }
            score_sum += credit * score;
        }

        System.out.println(score_sum / credit_sum);
        br.close();
    }
}