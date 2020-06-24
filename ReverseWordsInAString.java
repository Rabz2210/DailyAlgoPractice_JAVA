import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;


public class ReverseWordsInAString {
    public static void main(String[] args)throws IOException,NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<String>();
        String s= br.readLine();
        int length = s.length();
        StringTokenizer st = new StringTokenizer(s," ",true);
        while(st.hasMoreTokens()){
            
            stack.push(st.nextToken());
            System.out.println("Token: "+stack.peek());
        }
        StringBuilder reversed = new StringBuilder(length);
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        System.out.println(reversed);
    }
}