import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static final int WHITE_SCALE = 100;
    public static final int BLACK_SCALE = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x, y;
        int cnt = 0;
        boolean[][] arr = new boolean[WHITE_SCALE][WHITE_SCALE];
        for (boolean[] i : arr) {
            Arrays.fill(i, false);
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + BLACK_SCALE; j++) {
                for (int k = y; k < y + BLACK_SCALE; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < WHITE_SCALE; i++) {
            for (int j = 0; j < WHITE_SCALE; j++) {
                if (arr[i][j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
