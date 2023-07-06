import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = a * (b % 10);
        int d = a * (((b % 100) - ((b % 10))) / 10);
        int e = a * (b / 100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c + (d * 10) + (e * 100));
        br.close();
    }
}
