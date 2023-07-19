import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int i, j, k;
        for (int a = 0; a < N; a++) {
            arr[a] = 0;
        }
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            for (int b = i - 1; b < j; b++) {
                arr[b] = k;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        br.close();
    }
}
