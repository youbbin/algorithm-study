import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if (x * y > 0) {
            if (x > 0) {
                System.out.println(1);
            } else System.out.println(3);
        } else {
            if (x < y) {
                System.out.println(2);
            } else System.out.println(4);
        }
    }
}
