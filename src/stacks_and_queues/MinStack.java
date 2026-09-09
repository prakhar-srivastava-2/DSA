
import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack{
        Deque<Integer>mainStack = new ArrayDeque<>();
        Deque<Integer>minStack = new ArrayDeque<>();

    public void push(int x){
        mainStack.push(x);
        if(minStack.isEmpty()==true || x<=minStack.peek()){
            minStack.push(x);
        }
    }
    public void pop(){
        if(!mainStack.isEmpty()){
            int top = mainStack.peek();
            mainStack.pop();

            if(!minStack.isEmpty() && top==minStack.peek()){
            minStack.pop();
            }
        }
    }

    public int top(){
        int x = mainStack.peek();
        return x;
    }

    public int getMin(){
        int x  = minStack.peek();
        return x;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
    }
}