import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = 5;
        int MAX = 15;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[N][MAX];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j][i] != 0) {
                    System.out.print((char) arr[j][i]);
                }
            }
        }
        br.close();
    }

}
