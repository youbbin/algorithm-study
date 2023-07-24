import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Double[] arr = new Double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Double max = Collections.max(Arrays.asList(arr));
        Double sum = 0.0;
        for (Double i : arr) {
            i = i / max * 100;
            sum += i;
        }
        System.out.println(sum / N);
    }
}