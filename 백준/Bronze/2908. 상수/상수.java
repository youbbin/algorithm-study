import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = rev(a) > rev(b) ? rev(a) : rev(b);
        System.out.println(max);
        br.close();
    }

    public static int rev(int n) {
        int rev = 0;
        rev += (n % 10) * 100;
        n = (n - (n % 10)) / 10;
        rev += (n % 10) * 10;
        n = (n - (n % 10)) / 10;
        rev += n;
        return rev;
    }
}
