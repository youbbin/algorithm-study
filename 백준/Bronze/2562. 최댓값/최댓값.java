import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(Collections.max(arr));
        System.out.println(arr.indexOf(Collections.max(arr)) + 1);
        br.close();
    }
}
