
import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStack{

    Deque<Integer>stack1 = new ArrayDeque<>();
    Deque<Integer>stack2 = new ArrayDeque<>();
    public void push(int x){
        stack1.push(x);
    }

    public int pop(){
        if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            int x  =stack1.pop();
            stack2.push(x);
        }
        }
        return stack2.pop();
    }

    public int peek(){
        if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            int x =stack1.pop();
            stack2.push(x);
        }
        }
        return stack2.peek();
    }

    public boolean empty(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        return false;
    }

public static void main(String[] args) {
    ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
    queue.push(1);
    queue.push(2);
    queue.push(3);
    System.out.println(queue.peek());   // 1
    System.out.println(queue.pop());    // 1
    System.out.println(queue.peek());   // 2
    System.out.println(queue.pop());    // 2
    System.out.println(queue.empty());  // false
}

}
