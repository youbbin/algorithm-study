import java.io.*;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int last;
        char s = 64;
        for (int i = 2; i <= 9; i++) {
            if (i == 7 || i == 9) last = 4;
            else last = 3;
            for (int j = 0; j < last; j++) {
                hashMap.put((s = (char) (s + 1)), i);
            }
        }

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt += hashMap.get(str.charAt(i)) + 1;
        }

        System.out.println(cnt);
        br.close();
    }

}
