import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] votes = new Integer[N - 1];
        int dasom = Integer.parseInt(br.readLine());
        int bribe = 0;

        for (int i = 0; i < N - 1; i++) {
            votes[i] = (Integer.parseInt(br.readLine()));
        }


        while (!win(dasom, votes)) {


            for (int i = 0; i < N - 1; i++) {
                Arrays.sort(votes, Collections.reverseOrder());
                if (dasom <= votes[i]) {
                    dasom++;
                    votes[i]--;
                    bribe++;
                    i--;
                }
            }
        }

        System.out.println(bribe);
        br.close();
    }

    public static boolean win(int dasom, Integer[] votes) {
        for (int i = 0; i < votes.length; i++) {
            if (dasom <= votes[i]) {
                return false;
            }
        }
        return true;
    }
}
