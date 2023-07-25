import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1, a0;
        a1 = Integer.parseInt(st.nextToken());
        a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        if (a1 > 0 & a1 > c) {
            System.out.println(0);
        } else {
            if (f(a1, a0, n0) <= c * n0) {
                System.out.println(1);
            } else System.out.println(0);
        }
        br.close();
    }

    public static int f(int a1, int a0, int x) {
        return a1 * x + a0;
    }
}
