import java.io.*;
import java.util.Arrays;

public class Main {
    public static final int STUDENTS_NUM = 30;
    public static final int SUBMIT = 28;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        Boolean[] arr = new Boolean[STUDENTS_NUM];
        Arrays.fill(arr, false);
        for (int i = 0; i < SUBMIT; i++) {
            n = Integer.parseInt(br.readLine());
            arr[n - 1] = true;
        }
        for (int i = 0; i < STUDENTS_NUM; i++) {
            if (!arr[i]) System.out.println(i + 1);
        }
        br.close();
    }
}
