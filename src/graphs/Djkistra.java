
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Djkistra{
    public static int[] dijkstra(int V, int[][] edges, int src){
        List<List<int[]>>graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            graph.get(u).add(new int[] {v,w});
        }
        int dist[] = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]>heap = new PriorityQueue<>((a,b)->Integer.compare(a[1], b[1]));
        heap.offer(new int[] {src,0});
        while(!heap.isEmpty()){
            int current[] = heap.poll();
            int curr=current[0];
            int weight = current[1];
            if(weight>dist[curr]){
                continue;
            }
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor[] = graph.get(curr).get(i);
                int next = neighbor[0];
                int edgeWeight = neighbor[1];
                if(dist[curr]+edgeWeight<dist[next]){
                    dist[next] = dist[curr]+edgeWeight;
                    heap.offer(new int[]{next, dist[next]});
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {

    int V = 6;

    int[][] edges = {
        {0, 1, 4},
        {0, 2, 1},
        {2, 1, 2},
        {1, 3, 1},
        {2, 3, 5},
        {3, 4, 3},
        {1, 4, 7}
    };

    int src = 0;

    int[] result = dijkstra(V, edges, src);

    System.out.println(Arrays.toString(result));
}
}