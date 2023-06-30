import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N, M;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[M+1][N+1];
            bw.write(pascal(M, N, arr) + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }

    public static int pascal(int n, int r, int[][] arr) {
        if (n == r || r == 0) {
            return arr[n][r] = 1;
        }
        if (arr[n][r] != 0) {
            return arr[n][r];
        } else {
            return arr[n][r] = pascal(n-1,r-1,arr) + pascal(n-1,r,arr);
        }
    }
}