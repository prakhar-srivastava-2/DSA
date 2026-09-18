
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianDataStream{
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int val){
        if(maxHeap.isEmpty() || val<=maxHeap.peek()){
            maxHeap.offer(val);
        }
        else{
            minHeap.offer(val);
        }
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        if(minHeap.size()>maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    public double median(){
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }
        else{
                    return maxHeap.peek();
        }

    }
public static void main(String[] args) {

    MedianDataStream obj = new MedianDataStream();

    obj.addNum(5);
    System.out.println(obj.median());

    obj.addNum(2);
    System.out.println(obj.median());

    obj.addNum(8);
    System.out.println(obj.median());

    obj.addNum(3);
    System.out.println(obj.median());
}

}