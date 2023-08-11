import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
        int M = Integer.parseInt(st.nextToken()); // 보도 못한 사람
        HashSet<String> hashSetA = new HashSet<>();
        HashSet<String> hashSetB = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSetA.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            hashSetB.add(br.readLine());
        }

        HashSet<String> intersection = new HashSet<>(hashSetA);
        intersection.retainAll(hashSetB); // 교집합
        ArrayList<String> arrayList = new ArrayList<>(intersection);
        Collections.sort(arrayList); // 정렬
        System.out.println(arrayList.size());
        for(String name : arrayList){
            System.out.println(name);
        }
        br.close();
    }
}
