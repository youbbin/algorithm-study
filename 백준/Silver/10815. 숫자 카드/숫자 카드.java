import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> ans = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int num =0;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            hashMap.put(num,num);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if(hashMap.get(Integer.parseInt(st.nextToken())) != null){
                ans.add(1);
            }
            else{
                ans.add(0);
            }
        }

        for(int i : ans){
            bw.write(i+" ");
            bw.flush();
        }
        bw.close();
        br.close();
    }

}
