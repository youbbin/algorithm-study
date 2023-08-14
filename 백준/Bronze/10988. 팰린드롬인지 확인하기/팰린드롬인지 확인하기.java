import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        for (int i = 0, j = word.length() - 1; i < word.length()/2; i++,j--) {
            if(word.charAt(i)!= word.charAt(j)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
        br.close();
    }
}
