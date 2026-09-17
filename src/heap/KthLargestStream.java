
import java.util.PriorityQueue;

public class KthLargestStream{
    private PriorityQueue<Integer>check = new PriorityQueue<>();
    private int k =3;
    public int add(int val){
        check.offer(val);

        if(check.size()>k){
            check.poll();
        }
        return check.peek();
    }
}