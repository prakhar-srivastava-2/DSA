
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Mixed50{
    public static int[][] kClosest(int[][] points, int k){
        HashMap<int[],Integer>map = new HashMap<>();
        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int dist = (x*x) + (y*y);
            map.put(points[i],dist);
        }

        PriorityQueue<int[]>heap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry<int[],Integer>mp: map.entrySet()){
            if(heap.size()<k){
                heap.offer(mp.getKey());
            }
            else if(mp.getValue()<map.get(heap.peek())){
                heap.poll();
                heap.offer(mp.getKey());
            }
        }
        int result[][] = new int[k][2];
        for(int i=0;i<k;i++){
            result[i] = heap.poll();
        }
        return result;
    }
    public static void main(String[] args) {

    int[][] points = {
        {1, 3},
        {-2, 2},
        {5, 8},
        {0, 1}
    };

    int k = 2;

    int[][] result = kClosest(points, k);

    for(int i = 0; i < result.length; i++){
        System.out.println("[" + result[i][0] + ", " + result[i][1] + "]");
    }
}
}