import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n = 0;
        String str;
        while (n < N) {
            str = br.readLine();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
            n++;
        }
        br.close();
    }
}
