import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> stack = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String cmd = "";
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            cmd = bf.readLine();
            if(cmd.startsWith("push")){
                int a = Integer.parseInt((cmd.split(" "))[1]);
                push(a);
                continue;
            }
            switch (cmd){
                case "pop" :
                    pop();
                    break;
                case "top":
                    top();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }
    }

    public static void push(int x){
        stack.add(x);
    }
    public static void pop(){
        if(stack.size()==0){
            System.out.println(-1);
        }
        else{
            System.out.println(stack.get(stack.size()-1));
            stack.remove(stack.size()-1);
        }
    }

    public static void size(){
        System.out.println(stack.size());
    }
    public static void empty(){
        if(stack.isEmpty()){
            System.out.println(1);
        }
        else System.out.println(0);

    }
    public static void top(){
        if(stack.size()==0){
            System.out.println(-1);
        }else{
            System.out.println(stack.get(stack.size()-1));

        }
    }
}