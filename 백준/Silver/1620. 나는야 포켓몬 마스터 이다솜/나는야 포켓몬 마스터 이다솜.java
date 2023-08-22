import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int M = Integer.parseInt(st.nextToken()); // 문제의 개수
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        String pokemon;
        String question;

        for (int i = 0; i < N; i++) {
            pokemon = br.readLine();
            hashMap1.put(i + 1, pokemon);
            hashMap2.put(pokemon, i+1);
        }

        for(int i = 0;i<M;i++){
            question = br.readLine();
            if(isInteger(question)){
                System.out.println(hashMap1.get(Integer.parseInt(question)));
            }
            else{
                System.out.println(hashMap2.get(question));
            }
        }
        br.close();
    }

    public static boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
