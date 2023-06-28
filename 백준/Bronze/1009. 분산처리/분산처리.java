import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a, b, ans;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ans = (int) mod(a, b);
            if (ans == 0) {
                ans = 10;
            }
            System.out.println(ans);
        }
        br.close();
    }

    public static double mod(int base, int index) {
        if (index == 1) {
            return base % 10;
        }
        else if (index % 2 == 0) {
            double r = mod(base, index / 2);
            return Math.pow(r, 2) % 10;
        } else {
            return base * mod(base, index - 1) % 10;
        }
    }
}