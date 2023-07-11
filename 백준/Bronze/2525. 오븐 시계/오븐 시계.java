import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        int h, m;
        if (B + C >= 60) {
            h = A + ((B + C) / 60);
            if (h >= 24) {
                h = h - 24;
            }
            m = (B + C) % 60;
        } else {
            h = A;
            m = B + C;
        }
        System.out.println(h + " " + m);
    }
}
