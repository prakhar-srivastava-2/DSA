
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed24{
    public static boolean isValid(String str){
        Deque<Character>stack = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if (!stack.isEmpty() && c==')' && stack.peek()=='('){
                stack.pop();
            }
            else if (!stack.isEmpty() && c==']' && stack.peek()=='['){
                stack.pop();
            }
            else if (!stack.isEmpty() && c=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "([{}])";
        System.out.println(isValid(str));
    }
}