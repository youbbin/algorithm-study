import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String msg;
        int cnt = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            msg = br.readLine();
            if (msg.equals("ENTER")) {
                set.clear();
            } else if(!set.contains(msg)){
                set.add(msg);
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
