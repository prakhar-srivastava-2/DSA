
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis{
    public static boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c  = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else if(c==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(c==']' && stack.peek()=='['){
                stack.pop();
            }
            else if(c=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else{
                return false;
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "{[]}";
        //op => true
        System.out.println(isValid(s));
    }
}