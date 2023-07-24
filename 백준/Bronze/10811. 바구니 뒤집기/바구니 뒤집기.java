import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] temp = new int[N];
        int a, b;

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
            temp[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            for (int j = b - 1, k = a - 1; j >= a - 1; j--, k++) {
                temp[k] = arr[j];
            }
            for (int j = a - 1; j <= b - 1; j++) {
                arr[j] = temp[j];
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
