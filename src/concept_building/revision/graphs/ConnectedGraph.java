
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ConnectedGraph{
    public static int countComponents(int V, int[][] edges){
        List<List<Integer>> graph  =new ArrayList<>();
        int count=0;
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                count++;
                bfs(graph,i,visited);
            }
        }
        return count;
    }

    public static void bfs(List<List<Integer>>graph,int start,boolean visited[]){
        visited[start]=true;
        Deque<Integer>queue = new ArrayDeque<>();
        queue.offer(start);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}