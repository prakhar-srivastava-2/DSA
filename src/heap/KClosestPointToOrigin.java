
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointToOrigin{
    public static List<List<Integer>> kClosest(List<List<Integer>> val,int k){
//         points = [[1,3],[-2,2],[5,8],[0,1]]
// k = 2
        HashMap<List<Integer>,Integer>map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<val.size();i++){
            List<Integer>individual = val.get(i);
            int dist = 0;
            for(int j = 0;j<individual.size();j++){
                dist+=individual.get(j)*individual.get(j);
            }
            map.put(individual,dist);
        }
        PriorityQueue<List<Integer>>queue = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry<List<Integer>,Integer>mp: map.entrySet()){
            if(queue.size()<k){
                queue.offer(mp.getKey());
            }
            else if(map.get(queue.peek())>mp.getValue()){
                queue.poll();
                queue.offer(mp.getKey());

            }
        }
        while(!queue.isEmpty()){
            List<Integer> res= queue.poll();
            result.add(res);
        }
        return result;
    }

    public static void main(String[] args) {

    List<List<Integer>> points = new ArrayList<>();

    points.add(List.of(1, 3));
    points.add(List.of(-2, 2));
    points.add(List.of(5, 8));
    points.add(List.of(0, 1));

    int k = 2;

    List<List<Integer>> result = kClosest(points, k);

    System.out.println(result);
}
}