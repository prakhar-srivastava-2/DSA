
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed72{
    public static boolean isValid(String s) {
        Deque<Character>stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{' || c=='(' || c=='['){
                stack.push(c);
            }
            else if(stack.peek()=='[' && c==']'){
                stack.pop();
            }
            else if(stack.peek()=='{' && c=='}'){
                stack.pop();
            }
            else if(stack.peek()=='(' && c==')'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
}
    public static void main(String[] args) {

    String s = "([)]";

    boolean result = isValid(s);

    System.out.println(result);
    }
}
