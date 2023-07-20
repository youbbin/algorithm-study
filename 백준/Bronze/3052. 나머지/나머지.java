import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int n;
        int cnt = 1;

        for (int i = 0; i < 10; i++) {
            n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;
        }
        Arrays.sort(arr);
        int current = arr[0];
        for (int i = 0; i < 10; i++) {
            if (current != arr[i]) {
                cnt++;
            }
            current = arr[i];
        }
        System.out.println(cnt);
        br.close();
    }
}
