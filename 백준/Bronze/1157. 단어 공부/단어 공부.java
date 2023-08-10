import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        char c;
        for (int i = 0; i < word.length(); i++) {
            c = Character.toUpperCase(word.charAt(i));
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        char max_char = 'a';
        for (char ch : hashMap.keySet()) {
            if (max < hashMap.get(ch)) {
                max = hashMap.get(ch);
                max_char = ch;
            }
        }
        int cnt = 0;
        for (char ch : hashMap.keySet()) {
            if (max == hashMap.get(ch))
                cnt++;
            if (cnt >= 2) {
                System.out.println("?");
                return;
            }
        }

        System.out.println(max_char);
        br.close();
    }
}