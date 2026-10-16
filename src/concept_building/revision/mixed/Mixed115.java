
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed115{
    class MyQueue {
        Deque<Integer>stack = new ArrayDeque<>();
        Deque<Integer>stack2;


        public MyQueue() {
        }

        public void push(int x) {
            stack.push(x);

        }

        public int pop() {
            stack2 = new ArrayDeque<>();
            int size = stack.size();
            if(size==0){
                return -1;
            }
            int i=0;
            while(i<size){
                stack2.push(stack.pop());
                i++;
            }
            int out= stack2.pop();
            size = stack2.size();
            i=0;
            while(i<size){
                stack.push(stack2.pop());
                i++;
            }
            return out;
        }

        public int peek() {
            stack2 = new ArrayDeque<>();
            int size = stack.size();
            if(size==0){
                return -1;
            }
            int i=0;
            while(i<size){
                stack2.push(stack.pop());
                i++;
            }
            int peek= stack2.peek();
            size = stack2.size();
            i=0;
            while(i<size){
                stack.push(stack2.pop());
                i++;
            }
            return peek;
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
        public static void main(String[] args) {
        Mixed115 outer = new Mixed115();
        MyQueue queue = outer.new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek());  // 1
        System.out.println(queue.pop());   // 1
        System.out.println(queue.peek());  // 2
        System.out.println(queue.empty()); // false

        queue.pop();
        queue.pop();
        System.out.println(queue.empty());
    }
}