import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] arr_A = new int[K + 1];
        int[] arr_B = new int[K + 1];
        arr_A[0] = 1;
        arr_A[1] = 0;
        arr_B[0] = 0;
        arr_B[1] = 1;
        for (int i = 2; i < K + 1; i++) {
            arr_A[i] = arr_A[i - 2] + arr_A[i - 1];
            arr_B[i] = arr_B[i - 2] + arr_B[i - 1];
        }

        System.out.println(arr_A[K] + " " + arr_B[K]);
        br.close();
    }
}
