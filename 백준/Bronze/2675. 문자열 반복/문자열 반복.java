import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int r;
        String s;
        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            for(char c : s.toCharArray()){
                for(int j = 0;j<r;j++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        br.close();
    }
}
