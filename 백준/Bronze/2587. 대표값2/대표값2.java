import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int N = 5;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
            sum += arr.get(i);
        }

        System.out.println(sum/N);
        Collections.sort(arr);
        System.out.println(arr.get(N/2));

        br.close();
    }
}