import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashSet<Integer> hashSetA = new HashSet<>();
        HashSet<Integer> hashSetB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            hashSetA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            hashSetB.add(Integer.parseInt(st.nextToken()));
        }
        HashSet<Integer> substract1 = new HashSet<>(hashSetA);
        substract1.removeAll(hashSetB); // A-B
        HashSet<Integer> substract2 = new HashSet<>(hashSetB);
        substract2.removeAll(hashSetA); // B-A
        HashSet<Integer> union = new HashSet<>(substract1);
        union.addAll(substract2);
        System.out.println(union.size());

        br.close();
    }
}
