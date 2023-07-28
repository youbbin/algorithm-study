import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int index;
        for (int i = 97; i <= 122; i++) {
            if ((index = str.indexOf((char) i)) != -1) {
                System.out.print(index + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
        br.close();
    }
}