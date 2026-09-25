
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class BFSShortestPath{
    public static int shortestPath(int V, int[][] edges, int src, int dest){
        List<List<Integer>>graph = new ArrayList<>();
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v= edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        Deque<Integer>queue = new ArrayDeque<>();
        if(src==dest){
            return 0;
        }
        queue.offer(src);
        visited[src] = true;
        int dist[] = new int[V];
        Arrays.fill(dist,-1);
        dist[src]=0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    dist[neighbor]  = dist[curr]+1;
                    queue.offer(neighbor);
                }
            }
        }
        return dist[dest];
    }

    public static void main(String[] args) {

    int V = 7;

    int[][] edges = {
        {0, 1},
        {0, 2},
        {1, 3},
        {2, 3},
        {3, 4},
        {4, 5},
        {5, 6}
    };

    int src = 0;
    int dest = 6;

    int result = shortestPath(V, edges, src, dest);

    System.out.println("Shortest distance: " + result);
}
}