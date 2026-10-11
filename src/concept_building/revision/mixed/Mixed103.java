
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Mixed103{
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>graph = new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[]:times){
            int u=edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[] {v,w});
        }
        int dir[] = new int [n+1];
        Arrays.fill(dir,Integer.MAX_VALUE);
        PriorityQueue<int []>heap = new PriorityQueue<>((a,b)->Integer.compare(a[1], b[1]));
        dir[k] = 0;
        heap.offer(new int[]{k,0});
        while(!heap.isEmpty()){
            int current[] = heap.poll();
            int curr=current[0];
            int weight = current[1];
            if(weight>dir[curr]){
                continue;
            }
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor[] = graph.get(curr).get(i);
                int nextWeight = neighbor[1];
                int nextNode = neighbor[0];
                if(dir[curr]+nextWeight<dir[nextNode]){
                    dir[nextNode] = dir[curr]+nextWeight;
                    heap.offer(new int[]{nextNode,dir[nextNode]});
                }
            }
        }
        int maxTime = 0;
        for(int i=1;i<=n;i++){
            if(dir[i]==Integer.MAX_VALUE){
                return -1;
            }
            maxTime = Math.max(maxTime, dir[i]);
        }
        return maxTime;
}
    public static void main(String[] args) {
        Mixed103 solution = new Mixed103();

        int[][] times1 = {
            {2, 1, 1},
            {2, 3, 1},
            {3, 4, 1}
        };

        System.out.println(solution.networkDelayTime(times1, 4, 2)); // Expected: 2

        int[][] times2 = {
            {1, 2, 1}
        };

        System.out.println(solution.networkDelayTime(times2, 2, 2)); // Expected: -1

        int[][] times3 = {
            {1, 2, 1},
            {1, 3, 4},
            {2, 3, 2}
        };

        System.out.println(solution.networkDelayTime(times3, 3, 1)); // Expected: 3
    }
}