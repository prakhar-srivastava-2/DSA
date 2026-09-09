
import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation{
    public static int evalRPN(String[] tokens){
//         Input:  ["2","1","+","3","*"]
// Output: 9
        Deque<Integer>stack = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            String operator = tokens[i];
            if(operator.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a+b;
                stack.push(c);
            }
            else if(operator.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a-b;
                stack.push(c);
            }
            else if(operator.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                int c = b*a;
                stack.push(c);
            }
            else if(operator.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a/b;
                stack.push(c);
            }
            else{
                int k = Integer.parseInt(tokens[i]);
                stack.push(k);
            }
    }
    return stack.peek();
    }

    public static void main(String[] args) {
        String nums[] = {"4","13","5","/","+"};
        System.out.println(evalRPN(nums));
    }

}
