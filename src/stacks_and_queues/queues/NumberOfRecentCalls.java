
import java.util.ArrayDeque;
import java.util.Deque;


public class NumberOfRecentCalls{
    Deque<Integer> queue = new ArrayDeque<>();
    public int ping(int t){
        while(!queue.isEmpty()){
            int old = queue.peekFirst();
            if(t-old>3000){
                queue.poll();
            }
            else{
                break;
            }
        }
            queue.offer(t);
        return queue.size();
    }

    public static void main(String[] args) {

    NumberOfRecentCalls recentCalls = new NumberOfRecentCalls();

    System.out.println(recentCalls.ping(1));       // 1
    System.out.println(recentCalls.ping(100));     // 2
    System.out.println(recentCalls.ping(3001));    // 3
    System.out.println(recentCalls.ping(3002));    // 3
    }
}